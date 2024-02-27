Chain of responsibility
Chain of Responsiblity cho phép một đối tượng gửi một yêu cầu nhưng không biết đối tượng nào sẽ nhận và xử lý nó.
Điều này được thực hiện bằng cách kết nối các đối tượng nhận yêu cầu thành một chuỗi (chain) và gửi yêu cầu theo chuỗi đó cho đến khi có một đối tượng xử lý nó.

*Hiểu đơn giản như linked list các interface chưa nhau và xử lý tiếp tục theo vòng tròn đến khi class tiếp theo thực hiện được*


```**Lợi ích**
Giảm kết nối (loose coupling): Thay vì một đối tượng có khả năng xử lý yêu cầu chứa tham chiếu đến tất cả các đối tượng khác, nó chỉ cần một tham chiếu đến đối tượng tiếp theo. Tránh sự liên kết trực tiếp giữa đối tượng gửi yêu cầu (sender) và các đối tượng nhận yêu cầu (receivers).
Tăng tính linh hoạt : đảm bảo Open/Closed Principle.
Phân chia trách nhiệm cho các đối tượng: đảm bảo Single Responsibility Principle.
Có khả năng thay đổi dây chuyền (chain) trong thời gian chạy.
Không đảm bảo có đối tượng xử lý yêu cầu.
```

```Khi nào dùng**
Có nhiều hơn một đối tượng có khả thực xử lý một yêu cầu trong khi đối tượng cụ thể nào xử lý yêu cầu đó lại phụ thuộc vào ngữ cảnh sử dụng.
Muốn gửi yêu cầu đến một trong số vài đối tượng nhưng không xác định đối tượng cụ thể nào sẽ xử lý yêu cầu đó.
Khi cần phải thực thi các trình xử lý theo một thứ tự nhất định..
Khi một tập hợp các đối tượng xử lý có thể thay đổi động: tập hợp các đối tượng có khả năng xử lý yêu cầu có thể không biết trước, có thể thêm bớt hay thay đổi thứ tự sau này.
```
