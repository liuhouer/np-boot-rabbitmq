package cn.northpark.handler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitProducerTest {

	@Autowired
    private RabbitProducer producer;
	
	@Test
	public void test() {
		  for (int i = 0; i < 10; i++) {
	            producer.stringSend();
	        }
	}

}

