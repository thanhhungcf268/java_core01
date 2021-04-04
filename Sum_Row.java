import java.util.Scanner;

public class Sum_Row {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int m = scanner.nextInt();
        double[][] array = new double[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("nhập giá trị " + i + "," + j + " :");
                array[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("nhập số cột muốn tổng : ");
        int x = scanner.nextInt();
        if (x>m){
            System.out.print("chỉ được nhập số cột tối đa là "+m+"");
            return;
        }
        int sum = 0;
        for (double[] doubles : array) {
            for (int u = 0; u < x; u++) {
                sum += doubles[u];
            }
        }
        System.out.print("Tổng của "+x+" cột là "+sum);
    }
}
