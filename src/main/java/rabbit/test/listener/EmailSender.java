package rabbit.test.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    @Autowired
    private JavaMailSender mailSender;
	
    @RabbitListener(queues = "email-queue")
    public void sendEmail(String email) {
    	 try {
             // Thêm độ trễ 10 giây để giả lập gửi email chậm
             Thread.sleep(10000); // 10 giây
         } catch (InterruptedException e) {
             Thread.currentThread().interrupt();
         }
        // Giả lập việc gửi email
        //System.out.println("Sending confirmation email to: " + email);
        // Nếu muốn gửi email thật, bạn có thể dùng JavaMailSender tại đây
    	 
    	// Tạo email message
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("hoangthieu006@gmail.com"); // Thay bằng email của bạn
        message.setTo(email);
        message.setSubject("Xác nhận đăng ký tài khoản");
        message.setText("Chúc mừng bạn đã đăng ký thành công! Đây là email xác nhận từ hệ thống.");

        // Gửi email
        try {
            mailSender.send(message);
            System.out.println("Confirmation email sent to: " + email);
        } catch (Exception e) {
            System.err.println("Failed to send email to " + email + ": " + e.getMessage());
        }
    }
}