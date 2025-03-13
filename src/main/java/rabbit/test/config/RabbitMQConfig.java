package rabbit.test.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue myQueue() {
        return new Queue("my-queue", false);
    }
    
    @Bean
    public Queue emailQueue() {
        return new Queue("email-queue", false);
    }
}