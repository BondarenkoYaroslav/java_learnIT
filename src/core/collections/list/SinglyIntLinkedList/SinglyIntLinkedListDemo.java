package core.collections.list.SinglyIntLinkedList;

public class SinglyIntLinkedListDemo {
    public static void main(String[] args) {

        SinglyIntLinkedListRealization singlyList = new SinglyIntLinkedListRealization();
//        add elements
        singlyList.add(10);
        singlyList.add(11);
        singlyList.add(12);
        singlyList.add(13);
        singlyList.add(14);

        System.out.println(singlyList.size());  // 5

        System.out.println(singlyList.get(3));  // 13

        singlyList.remove(0);
        singlyList.remove(0);
        singlyList.remove(2);

        System.out.println(singlyList);  // [12, 13]

        System.out.println(singlyList.size());  // 2
    }
}
