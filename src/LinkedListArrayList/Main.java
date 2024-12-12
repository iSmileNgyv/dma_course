package LinkedListArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Tapshiriq 3: Elementləri silin ---");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.remove(2);
        list.remove(3);
        System.out.println("Qalan siyahı: " + list);

        System.out.println("\n--- Tapshiriq 2: Elementlərin axtarılması ---");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        numbers.add(45);
        int index = numbers.indexOf(25);
        System.out.println("25 rəqəminin indeksi: " + index);

        System.out.println("\n--- Müxtəlif əməliyyatlar ---");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        System.out.println("Siyahının ölçüsü: " + linkedList.size());
        System.out.println("İlk element: " + linkedList.getFirst());
        System.out.println("Son element: " + linkedList.getLast());
        System.out.println("200 siyahıda var? " + linkedList.contains(200));
        System.out.println("700 siyahıda var? " + linkedList.contains(700));
        System.out.println("500 siyahıda var? " + linkedList.contains(500));

        System.out.println("\n--- Tərsinə çap edin ---");
        LinkedList<Integer> reverseList = new LinkedList<>();
        reverseList.add(1);
        reverseList.add(2);
        reverseList.add(3);
        reverseList.add(4);
        reverseList.add(5);
        Iterator<Integer> descendingIterator = reverseList.descendingIterator();
        System.out.print("Tərsinə siyahı: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        System.out.println("\n--- Elementlərin əvvələ və ya sonuna əlavə edilməsi ---");
        LinkedList<String> words = new LinkedList<>();
        words.add("alma");
        words.add("armud");
        words.add("banan");
        words.add("nar");
        words.add("üzüm");
        words.addFirst("gavalı");
        words.addLast("şaftalı");
        System.out.println("Siyahı: " + words);
    }
}
