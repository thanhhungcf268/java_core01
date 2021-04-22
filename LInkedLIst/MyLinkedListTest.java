package LInkedLIst;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>("15");
        list.add("12");
        list.add("13");
//        list.add(0,"qe");
//        list.add("14");
//        list.add(1,"a");
//        System.out.println(list.indexOf("34"));
//        System.out.println(list.remove(0));
//        list.clone();
        list.addFirst("11");
//        list.addLast("12");
//        System.out.println(list.getLast());
        list.printList();
//        System.out.println( list.clone());
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        list.clear();
//        list.printList();
//        System.out.println(list.contains("11hj"));
//        System.out.println(list.indexOf("a"));
        System.out.println(list.remove(0));
        list.printList();


    }
}
