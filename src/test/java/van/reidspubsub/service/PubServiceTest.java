package van.reidspubsub.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class PubServiceTest {
    @Resource
    private PubService service;
@Test
    public void sentMsg(){
    service.setStr01();
}
}