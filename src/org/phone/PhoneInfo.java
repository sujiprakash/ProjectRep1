package org.phone;

public class PhoneInfo {

	
	private void phoneInfo(String name,int imei) {
		System.out.println("Phone name:"+name+"\n"+"IMEI:"+imei);
	}
	private void phoneInfo(int pixel,String os) {
		System.out.println("OS:"+os+"\n"+"Pixel:"+pixel);
	}
	private void phoneName() {
		System.out.println("Phone name:Realme");	

		}
		
	private void phoneMieiNum() {
		System.out.println("Phone IMEInum:123");	
	}

	private void Camera() {
		System.out.println("Camera pixels:64MP");
	}
	private void storage() {
		System.out.println("Phone storage:128GB");
	}
	private void osName() {
		System.out.println("OS Name:Anroid");
	}
	
	
	
	public static void main(String[] args) {
		
		PhoneInfo pi=new PhoneInfo();
		pi.phoneInfo("Realme",123);
		pi.phoneInfo(64,"Anroid");
		
		//pi.phoneName();
		//pi.phoneMieiNum();
		//pi.storage();
		//pi.Camera();
		//pi.osName();
	}

}
