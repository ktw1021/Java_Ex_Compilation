package com.javaex.network.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // 서버 소켓 생성
            serverSocket = new ServerSocket();
            // 로컬 주소 및 포트에 서버 소켓을 바인드합니다.
            InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
            serverSocket.bind(local);
            System.out.println("<서버가 시작되었습니다>");
            System.out.println("[연결을 기다립니다]");

            // 클라이언트의 연결을 기다리고 수락합니다.
            socket = serverSocket.accept();
            System.out.println("[클라이언트가 연결되었습니다]");

            // 데이터를 받기 위한 입력 스트림을 설정합니다.
            InputStream is = socket.getInputStream();
            // 데이터를 보내기 위한 출력 스트림을 설정합니다.
            OutputStream os = socket.getOutputStream();
            // 입력 스트림에서 읽기 위해 BufferedReader를 설정합니다.
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            // 출력 스트림으로 쓰기 위해 BufferedWriter를 설정합니다.
            bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

            String msg = null;
            // 클라이언트로부터 메시지를 계속해서 읽습니다.
            while (true) {
                System.out.println("메시지: " + msg);
                // 받은 메시지를 클라이언트로 에코 백합니다.
                bw.write("[Echo]:" + msg);
                bw.newLine();
                bw.flush();
                if (msg.equals("quit")) {
                	break;
                }
            }

            // 클라이언트가 연결을 종료했음을 확인
            System.out.println("[접속 종료되었습니다]");
        } catch (BindException e) {
            System.err.println("포트가 이미 사용중입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 모든 자원을 안전하게 종료합니다.
            try {
                if (bw != null) bw.close();
                if (br != null) br.close();
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("<서버 종료>");
    }
}
