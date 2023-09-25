package ra.entity;

import java.util.Scanner;

public class Student {
    /*
     * Xây dựng lớp sinh viên gồm:
     * 1. Các đặc điểm: mã sinh viên, tên sinh viên, tuổi, giới tính, địa chỉ, trạng thái
     * 2. Gồm 3 constructors: default, khởi tạo mã sinh viên, tên sinh viên và khởi tạo tất cả các thông tin sinh viên
     * 3. Các phương thức getter/setter cho phép truy câp các thuộc tính
     * 4. Xây dựng các hành vi:
     *   - Chào giảng viên
     *   - Tính tổng 2 số
     *   - Nhập thông tin cho sinh viên
     *   - Hiển thị thông tin sinh viên
     * */
    //1. Attributes / Fields
    //- private Datatype attributeName
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;

    //2. Constructors
    //- public ClassName(params){Block Statements}
    //-Default Constructor
    public Student() {
    }
    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //this.studentId: thuộc tính studentId của đối tượng mà chúng ta đang làm việc
    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }

    //3. Methods
    //-Access Modifier + ReturnData + methodName(params){Block Statements};
    //3.1. Getter/Setter
    //Get: Lấy dữ liệu thuộc tính
    public String getStudentId() {
        return this.studentId;
    }

    //set: gán giá trị cho thuộc tính
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void hello() {
        System.out.println("Xin chào thầy");
    }

    public int sumTwoNumbers(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi:");
        this.age = Integer.parseInt(scanner.nextLine());
        //"123"--> 123
        System.out.println("Nhập vào giới tính:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ:");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào trạng thái:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Mã SV: %s - Tên SV: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s - Trạng thái: %b\n", this.sex, this.address, this.status);
    }
}
