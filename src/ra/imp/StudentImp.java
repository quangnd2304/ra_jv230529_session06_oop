package ra.imp;

import ra.entity.Student;

import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        //Syntax: ClassName objectName = new constructor
        //Khởi tạo đối tượng student1 mà không khởi tạo bất cứ thông tin gì
        Student student1 = new Student();
        //Khởi tạo đối tượng student2 và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B");
        //Khởi tạo đối tượng student3 và khởi tạo tất cả thông tin
        Student student3 = new Student("SV003", "Nguyễn Văn C", 25, true, "Hồ Chí Minh", true);
        //Truy cập phương thức: objectName.methodName(Arguments)
        //Sử dụng phương thức inputData để nhập dữ liệu cho student1
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 1:");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //Sử dụng các phương thức set để nhập dữ liệu cho tuổi, giới tính, địa chỉ, trạng thái của student2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        System.out.println("Nhập vào trạng thái sinh viên 2:");
        student2.setStatus(Boolean.parseBoolean(scanner.nextLine()));
        //Tính tuổi trung bình của 3 sinh viên và in ra console
        int ageOfStudent1 = student1.getAge();
        int ageOfStudent2 = student2.getAge();
        int ageOfStudent3 = student3.getAge();
        int avgAge = (ageOfStudent1 + ageOfStudent2 + ageOfStudent3) / 3;
        System.out.println("Tuổi trung bình của 3 sinh viên: " + avgAge);
        //Gọi phương thức displayData() để hiển thị thông tin các đối tượng
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
        Student student = new Student();

    }
}
