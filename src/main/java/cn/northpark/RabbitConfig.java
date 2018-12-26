package cn.northpark;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    /**
     * 定义队列名
     */
    private final static String STRING = "string";


    /**
     * 定义string队列
     * @return
     */
    @Bean
    public Queue string() {
    
    	return new Queue(STRING);

    }

}