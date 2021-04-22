public class BinarySearch {
    static int[] array = {1,23,4,4,6,54,76,67,77,6,7,34};
    public static void main(String[] args) {
        System.out.println(binarySearch(array,77));
    }
    static int binarySearch(int[] array,int key){
        int low =0;
        int high = array.length-1;
        while (high>=low){
            int mid = (low+high)/2;
            if (key<array[mid]){
                high = mid-1;
            }else if (key ==array[mid]){
                return mid;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}
