package com.javaex.network.v1;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

//	v1. 접속 대기
public class Client {

	public static void main(String[] args) {
		
	
		
		//	소켓 생성
		Socket sv = new Socket();
		
		//	시작 메시지
		System.out.println("<클라이언트 시작>");
		System.out.println("[연결을 요청합니다.]");
		
		//	connect 시도
		//	서버 주소와 포트 확보
		try {
		InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
		sv.connect(remote);
		System.out.println("[서버에 연결되었습니다.]");
		
		//	종료
		System.out.println("<클라이언트 종료>");
		
		} catch (ConnectException e) {
			System.out.println("접속이 거부되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sv.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
