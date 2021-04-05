import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 2, 3);
        if (quadraticEquation.delta() > 0) {
            System.out.print("Phương trình có nghiệm thứ nhất là : ");
            System.out.println(quadraticEquation.getRoot1());
            System.out.print("Phương trình có nghiệm thứ hai là  : ");
            System.out.println(quadraticEquation.getRoot2());
        }else if (quadraticEquation.delta()==0){
            System.out.print("Phương trình có 2 nghiệm giống nhau là : ");
            System.out.print(quadraticEquation.getRoot1());
        }else {
            System.out.print("The equation has no roots");
        }
    }
    public double delta() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(((b * b) - 4 * a * c),0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(((b * b) - 4 * a * c),0.5)) / (2 * a);
    }
}
