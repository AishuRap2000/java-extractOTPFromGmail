package com.java;

import java.util.List;
import java.util.Properties;

import javax.mail.Store;

import com.testing.framework.EmailUtils;

public class ExtractOTPFromGmail {
	public static void main(String[] args) throws Exception{
		EmailUtils emailUtils = new EmailUtils();
		Properties prop = new Properties();
		prop.setProperty("gmail_username", "aishu.rap22@gmail.com");
		prop.setProperty("gmail_password", "********");
		prop.setProperty("mail.port", "995");
		prop.setProperty("gmail_from", "aishu.rap22@gmail.com");
		Store connection = emailUtils.connectToGmail(prop);

		List<String> emailtext = emailUtils.getUnreadMessageByFromEmail(connection, "Inbox", "hello@duolingo.com", "🥳 Happy 5th Duoversary, Aish!");
		if(emailtext.size()<1)
			throw new Exception("No Email received");
		else
		{
			System.out.println("Email Content - " +emailtext);			
			String regex= "[^\\d]+";
			String[] OTP = emailtext.get(0).split(regex);
			System.out.println("OTP is : " +OTP[1]);
		
		}
	}
}
