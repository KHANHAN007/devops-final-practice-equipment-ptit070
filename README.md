# Đề luyện IT209 - Quản lý thiết bị

Mã nguồn tự viết cho bài luyện, không phải bài làm đã triển khai. Chưa có Dockerfile, Compose, Nginx hoặc CI/CD; sinh viên tự hoàn thành theo `../02_DE_LUYEN.md`.

- Spring Boot 4.0.0, Java 21, Gradle Wrapper 8.14.3.
- API `/api/equipment` đọc dữ liệu từ MySQL.
- API `/api/version` đọc `APP_VERSION`.
- Có hai test HTTP contract không cần MySQL.
- Database cố định: `equipment_practice`; SQL nằm trong `database/init.sql`.
- Khi tạo repository riêng, chỉ tạo Git trong thư mục này.

```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
chmod +x gradlew
./gradlew test
```

Tham khảo cấu trúc tình huống thi: https://github.com/Maihuy211/devops-final-de001-maivanhuy . Không sử dụng ảnh hoặc thông tin sinh viên của repository tham khảo làm minh chứng của mình.
