
public class Gop_Mang {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,12,11,13,14};
        int[] array2 = {4,5,6,7,8,9};
        int[] array3;
        array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3,array1.length, array2.length);
        for (int k : array3) {
            System.out.print(k + " ");

        }
    }
}
