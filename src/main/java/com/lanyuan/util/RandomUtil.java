package com.lanyuan.util;

import java.util.Random;

public class RandomUtil {
	public static String getRandomString(int length){
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890";
		Random random = new Random();
		StringBuffer sbuffer = new StringBuffer(); 
        for(int i=0;i<length;i++){ 
        	int number = random.nextInt(base.length());    
        	sbuffer.append(base.charAt(number));    
        } 
        return new String(sbuffer);
    }
}
