package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

//	v2. 클라이언트로부터 메시지 전달 -> Echo Back
public class Client {

	public static void main(String[] args) {
		
		Socket socket = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		try {
		//	소켓 생성
		socket = new Socket();
		//	시작 메시지
		System.out.println("<클라이언트 시작>");
		System.out.println("[연결을 요청합니다.]");
		//	connect 시도
		//	서버 주소와 포트 확보
		InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
		socket.connect(remote);
		System.out.println("[서버에 연결되었습니다.]");
		//	서버로 메시지 전송
		//	서버의 통신 소켓과 클라이언트와 통신 소켓 연결
		OutputStream os = socket.getOutputStream();
		InputStream is = socket.getInputStream();
		bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
		br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		
		//	Echo Back 메시지 수신을 위한 Stream
		while (true) {
		//	메시지 전송
//		String msg = "테스트 메시지";	//	서버로 전송할 메시지
		System.out.println("메시지 입력(종료하려면 'quit' 입력): ");
		String msg = scanner.nextLine();	// 전송할 메시지 입력 받음
		
		//	종료
		if ("quit".equalsIgnoreCase(msg)) {
			System.out.println("클라이언트를 종료합니다.");
			break;
		}
		bw.write(msg);	//	서버로 전송
		bw.newLine();
		bw.flush();
		System.out.println("전송 메시지: "+msg);
		
		//	Echo Back 메시지 수신
		String rcvMsg = br.readLine();
		System.out.println("수신 메시지: "+rcvMsg);
		
		}
		
		} catch (ConnectException e) {
			System.err.println("접속이 거부되었습니다.");
		} catch (IOException e) {
			System.err.println("입출력 오류 발생: "+e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//자원 해제
			try {
				if (bw != null) bw.close();
				if (br != null) br.close();
				if (scanner != null) scanner.close();
				if (socket != null) socket.close();
			} catch (IOException e) {
				System.err.println("자원 해제 중 오류: "+e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
