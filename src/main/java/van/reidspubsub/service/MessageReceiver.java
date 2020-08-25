package van.reidspubsub.service;

import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    /**
     * 接收消息的方法1
     **/
    public void receiveMessage(String message){
        System.out.println("receiveMessage接收到的消息："+message);
    }

    /**
     * 接收消息的方法2
     **/
    public void receiveMessage2(String message){
        System.out.println("receiveMessage2接收到的消息："+message);
    }

}
