import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String a = scanner.next();
        System.out.println("Đây là chuỗi của bạn nhập : "+ a);
        System.out.print("Nhập từ để kiểm tra : ");
        String exam = scanner.next();
        char b = exam.charAt(0);
        int count =0;
        for (int k=0;k<a.length();k++){
            char u = a.charAt(k);
            if (b==u){
                count++;
            }
        }
        System.out.print("Số lần lập của kí tự là : "+count);
    }
}
