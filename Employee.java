import java.util.Scanner;

public class Employee {

        private String employeeId;
        private String employeeName;
        private int age;
        private String gen;
        private double rate;
        private double salary;

        // Constructor không tham số
        public Employee() {
        }

        // Constructor có tham số
        public Employee(String employeeId, String employeeName, int age, String gen, double rate) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.age = age;
            this.gen = gen;
            this.rate = rate;
            this.salary = calSalary(); // Tính lương ngay khi khởi tạo
        }

        // Phương thức nhập thông tin nhân viên
        public void inputData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên: ");
            employeeId = scanner.nextLine();
            System.out.print("Nhập tên nhân viên: ");
            employeeName = scanner.nextLine();
            System.out.print("Nhập tuổi: ");
            age = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự newline
            System.out.print("Nhập giới tính: ");
            gen = scanner.nextLine();
            System.out.print("Nhập hệ số lương: ");
            rate = scanner.nextDouble();
        }

        // Phương thức hiển thị thông tin nhân viên
        public void displayData() {
            System.out.println("Mã nhân viên: " + employeeId);
            System.out.println("Tên nhân viên: " + employeeName);
            System.out.println("Tuổi: " + age);
            System.out.println("Giới tính: " + gen);
            System.out.println("Hệ số lương: " + rate);
            System.out.println("Lương: " + salary);
        }

        // Phương thức tính lương
        public double calSalary() {
            return rate * 1300000;
        }

        public static void main(String[] args) {
            Employee employee = new Employee();
            employee.inputData();
            employee.displayData();
        }
    }
