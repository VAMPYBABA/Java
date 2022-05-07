import java.util.*;

class LL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            // if(list.get(i) == value ) just to search something
            System.out.print(list.get(i) + " -> ");
            ;
        }
        System.out.println("null");

        /*
         * list.removeFirst();
         * System.out.println(list);
         * 
         * list.removeLast();
         * System.out.println(list);
         */

        list.remove(3);
        System.out.println(list);

    }
}
