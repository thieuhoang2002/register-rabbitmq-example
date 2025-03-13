package rabbit.test.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "my-queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        // Xử lý message ở đây, ví dụ lưu vào database hoặc gửi email.
    }
}