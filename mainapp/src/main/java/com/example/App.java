package com.example;

import com.example.bean.Message;
import com.example.service.MessageService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MessageService ms = new MessageService();
		Message message = ms.getMessage();
		System.out.println(message.getMessage());
	}
}
