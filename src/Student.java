public class Student {
    // 1. Khai báo các thuộc tính
    private int id;
    private String name;
    private int age;

    // 2. Constructor nhận đầy đủ tham số
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 3. Phương thức hiển thị thông tin theo định dạng yêu cầu
    public void display() {
        System.out.printf("ID: %d, Name: %s, Age: %d\n", id, name, age);
    }
}