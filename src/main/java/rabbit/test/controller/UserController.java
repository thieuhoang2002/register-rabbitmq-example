package rabbit.test.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/register")
    public String registerUser(@RequestBody String email) {
        // Giả lập lưu user vào database
        System.out.println("User registered with email: " + email);

        // Gửi email vào Queue
        rabbitTemplate.convertAndSend("email-queue", email);
        return "Registration successful. Confirmation email will be sent shortly.";
    }
}