**State Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern).
Nó cho phép một đối tượng thay đổi hành vi của nó khi trạng thái nội bộ của nó thay đổi. 
Đối tượng sẽ xuất hiện để thay đổi lớp của nó.**

```` Lợi ích 
Đảm bảo nguyên tắc Single responsibility principle (SRP) : tách biệt mỗi State tương ứng với 1 class riêng biệt.
Đảm bảo nguyên tắc Open/Closed Principle (OCP) : chúng ta có thể thêm một State mới mà không ảnh hưởng đến State khác hay Context hiện có.
Giữ hành vi cụ thể tương ứng với trạng thái.
Giúp chuyển trạng thái một cách rõ ràng.
````

```` lúc dùng
Khi hành vi của đối tượng phụ thuộc vào trạng thái của nó và nó phải có khả năng thay đổi hành vi của nó lúc run-time theo trạng thái mới.
Khi nhiều điều kiện phức tạp buộc đối tượng phụ thuộc vào trạng thái của nó.
````
