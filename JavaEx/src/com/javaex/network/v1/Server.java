package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//	v1. 접속 대기
public class Server {
	
	
	
	public static void main(String[] args) {
		//	서버 소켓 생성
		try {
			ServerSocket serverSocket = new ServerSocket();
		
		//	ip와 포트에 연결: bind
		InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
		serverSocket.bind(local);		// (허용할 IP-현재는 로컬 호스트에 대한 접근 허용, 10000번째 포트)
		System.out.println("<서버가 시작되었습니다.");
		System.out.println("[연결을 기다립니다]");
		//	연결 대기(승인: 대기상태)
		Socket socket = serverSocket.accept();
		
		//	클라이언트 접속시의 처리
		InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
		System.out.println("[클라이언트가 연결되었습니다]");
		System.out.println(socketAddress.getAddress() + ":" + socketAddress.getPort());
		
		//	후 처리
		System.out.println("=========");
		System.out.println("<서버 종료>");
		serverSocket.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}
}
