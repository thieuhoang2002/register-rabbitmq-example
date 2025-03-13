# Đây là một ví dụ đơn giản mô phỏng xử lý đăng ký tài khoản sử dụng RabbitMQ.
## Để chạy được example trên thì trước hết cần làm các bước sau (Hướng dẫn dưới đây được thực hiện trên Windows 10):
### Bước 1: Cài đặt Erlang vì RabbitMQ được viết bằng Erlang.
- Tải Erlang từ trang web chính thức: https://www.erlang.org/downloads
- Cài đặt Erlang: Cài đặt như phần mềm thông thường: Chạy file .exe rồi nhấn Next liên tục.
### Bước 2: Cài đặt RabbitMQ.
- Tải RabbitMQ: https://www.rabbitmq.com/download.html
- Chạy file .exe vừa tải về và cài đặt bình thường.
### Bước 3: Kích hoạt RabbitMQ Management Plugin (giao diện web)
- Mở Command Prompt (cmd) với quyền admin.
- Sau đó chạy các lệnh sau:
    - Di chuyển tới đường dẫn (Thay <version> bằng phiên bản bạn vừa cài, ví dụ 3.13.0):
      ```sh
      cd "C:\Program Files\RabbitMQ Server\rabbitmq_server-<version>\sbin"
      ```
    - Tiếp theo chạy lần lượt các lệnh sau:
      ```sh
      rabbitmq-plugins enable rabbitmq_management
      ```
      ```sh
      rabbitmq-service stop
      ```
      ```sh
      rabbitmq-service start
      ```
- Tiếp theo là mở trình duyệt, truy cập http://localhost:15672. Nếu chưa hiển thị trang web thì thử load lại vài lần, hiển thị ra giao diện nghĩa là đã thành công.
- Đăng nhập với tài khoản mặc định: 
   - Username: guest
   - Password: guest
### Bước 4: Clone example về máy:
```sh
git clone https://github.com/thieuhoang2002/register-rabbitmq-example.git
```
### Bước 5: Cài đặt Extension Spring Boot cho Eclipse (mình sử dụng Eclipse) (nếu cài rồi thì bỏ qua bước này).
![image](https://github.com/user-attachments/assets/54dc86d4-a468-4743-93c6-42599a708a76)
### Bước 6: Import vào Eclipse:
File -> Import -> Maven -> Exitsting Maven Projects -> Browse... (Chọn example vừa clone) -> Finish
### Bước 7: Chờ IDE nạp và load các dependencies xong thì có thể chạy được.
- Chuột phải vào dự án.
- ![image](https://github.com/user-attachments/assets/5ed9d7a9-fd13-4e6c-93b4-74f5b26a5156)
### Bước 8: Chuẩn bị một email thật, mình vào https://temp-mail.org/vi/ để lấy một email test.
### Bước 9: Dùng Postman để test API. (Trước đó nhớ khởi chạy RabbitMQ trước -> Chạy example):
#### Màn hình Postman:
![image](https://github.com/user-attachments/assets/9fe445a2-6f29-44db-aefa-2c2aab3cba46)

#### Console Eclipse:
![image](https://github.com/user-attachments/assets/0eb5e4d1-1adc-4839-9667-0494fae5c7ba)


