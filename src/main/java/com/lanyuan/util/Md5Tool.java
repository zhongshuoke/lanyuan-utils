package com.lanyuan.util;

import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

public class Md5Tool {
	
	public static String getMd5(String password){
		String str = "";
		if(password !=null && !password.equals("")){
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				BASE64Encoder base = new BASE64Encoder();
				//加密后的字符串
				System.out.println(md.digest(password.getBytes("utf-8")));
				str = base.encode(md.digest(password.getBytes("utf-8")));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	public static void main(String[] args) {
		System.err.println(getMd5("root"));
	}
}
