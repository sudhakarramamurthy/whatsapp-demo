package com.eqts.whatsapp.controllers;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eqts.whatsapp.receive.WhatsappMsg;
import com.eqts.whatsapp.send.MsgSentResponse;
import com.eqts.whatsapp.send.SendMessage;
import com.eqts.whatsapp.receive.Message;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
    
    @PostMapping("/messages")
    void handleMessage(@RequestBody WhatsappMsg beans) {
     List<Message> msgs = beans.getMessages();
     List<Message> filteredmsg = msgs.stream()                        
             .filter(x -> x.getAuthor().startsWith("919443205969"))
             .collect(Collectors.toList());
      filteredmsg.stream().forEach(System.out::println);
      if (filteredmsg.size() > 0 ) {
			Message mymsg = filteredmsg.get(0);
			postResponse(mymsg);
      }
     }
 
    private SendMessage postResponse(Message msg) {
    	SendMessage sMsg = new SendMessage();
    	System.out.println(msg.getChatId());
    	sMsg.setChatId(msg.getChatId());
    	sMsg.setBody("Your Msg has been received by bot!");
        RestTemplate rt = new RestTemplate();
        ResponseEntity<MsgSentResponse> response = rt.postForEntity("https://api.chat-api.com/instance56644/sendMessage?token=sphz8698hh2rdaag", sMsg, MsgSentResponse.class);
        System.out.println(response.getBody().toString());
    	return null;
    }
    
}
