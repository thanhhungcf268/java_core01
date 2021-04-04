import java.util.Scanner;

public class FindMin_2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("nhập giá trị " + i + "," + j + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        int u = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max > array[i][j]) {
                    u = i;
                    k = j;
                    max = array[i][j];
                }
            }
        }
        System.out.println("min = " + max + " Tại vị trí " + u + "," + k);

    }
}
