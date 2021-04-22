import java.util.LinkedList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a String : ");
        String str = input.nextLine();
        LinkedList<Character> max =new LinkedList<>();
        for (int i=0;i<str.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j=1+i;j<str.length();j++){
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch:max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
