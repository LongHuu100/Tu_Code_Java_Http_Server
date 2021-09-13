# Http in Java
Mục đích của repo này để làm rõ các in (Cách nhận request)- out (Trả kết qủa trên trình duyệt) của Http bằng ứng dụng java.

# Kết quả
- Xử lý được các request đến server
- Xử lý các path của request bằng các annotation như @GET, @POST ... <br />
  làm nền tảng cho việc khai phá (IOC) trong spring boot dựa trên Reflection của Java
- Thêm các controller không giới hạn

# Cần nâng cấp
- Xử lý cookie và session để nhận biết client và server.
- Xử lý non-blocking
- Tích hợp Loom để sử dụng thread ảo
- Tịch hợp Spring boot