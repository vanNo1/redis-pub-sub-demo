package van.reidspubsub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class PubService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 发布消息
     *
     * @param channel 消息信道
     * @param message 消息内容
     */
    public void sendMessage(String channel, String message) {
        stringRedisTemplate.convertAndSend(channel, message);
    }

    /**
     * 发布消息的方法
     */
    public void setStr01() {
        this.sendMessage("mq_01", "发送信息内容01");
        this.sendMessage("mq_01", "发送信息内容011");
        this.sendMessage("mq_02", "发送信息内容02");
    }

}
