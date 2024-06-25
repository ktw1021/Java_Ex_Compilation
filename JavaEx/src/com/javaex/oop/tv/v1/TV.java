package com.javaex.oop.tv.v1;

//	채널 범위 1~255
//	볼륨 범위 0~100
public class TV {
	//	상수
	private static final int MIN_CHANNEL=1;
	private static final int MAX_CHANNEL=255;
	private static final int MIN_VOLUME=0;
	private static final int MAX_VOLUME=100;
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public TV () {
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	//	boolean의 getter 형태
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean power) {
		this.power=power;
	}
	public void channel(int channel) {
		if (channel<=MAX_CHANNEL && channel>=MIN_CHANNEL) {
			this.channel=channel;
		}
	}
	
	public void channel(boolean up) {
		if (channel<=MAX_CHANNEL && channel>=MIN_CHANNEL) {
			if (up==true) {
				this.channel++;
			}
			else {
				this.channel--;
			}
			
		}
	}
	public void volume(int volume) {
		if (volume>=MIN_VOLUME&&volume<=MAX_VOLUME) {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if (volume>=MIN_VOLUME&&volume<=MAX_VOLUME) {
		if (up==true) {
			this.volume++;
		}
		else {
			this.volume--;
		}
		}
	}
	public void status() {
		System.out.printf("현재 채널은 %d, 현재 볼륨은 %d, 전원은 %s%n",channel,volume,power);
	}
}
