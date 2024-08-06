import java.util.Scanner;

public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle() {}

        // Getter và Setter cho radius
        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Phương thức tính chu vi
        public double chuVi() {
            return 2 * Math.PI * radius;
        }

        // Phương thức tính diện tích
        public double dienTich() {
            return Math.PI * radius * radius;
        }

        // Phương thức nhập dữ liệu từ người dùng
        public void inputData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập bán kính: ");
            radius = scanner.nextDouble();
            scanner.nextLine();
        }

        // Phương thức hiển thị thông tin
        public void displayData() {
            System.out.println("Thông tin hình tròn:");
            System.out.println("Bán kính: " + radius);
            System.out.println("Chu vi: " + chuVi());
            System.out.println("Diện tích: " + dienTich());
        }

        public static void main(String[] args) {
            Circle circle = new Circle(); // Tạo đối tượng Circle
            circle.inputData(); // Nhập dữ liệu từ người dùng
            circle.displayData(); // Hiển thị thông tin
        }
    }
