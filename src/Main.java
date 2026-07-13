import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều rộng: ");
        double w = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập chiều cao: ");
        double h = Double.parseDouble(sc.nextLine());

        Rectangle rect = new Rectangle(w, h);
        rect.printInfo();

        sc.close();
    }
}