package mul.com.a.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.com.a.chatbot.MainClass;

@RestController
public class ChatbotController {

	@RequestMapping(value = "/chatbot", method = RequestMethod.POST)
	public String chatbot(String msg) {
		System.out.println("PdsController chatbot");
		
		String str = MainClass.chatBot(msg);
		
		return str;

   }
}
