package Service;

import java.util.List;
import java.util.Random;
import java.util.LinkedList;

import Interface.ICollection;

public class LinkedListTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    List<Integer> Setup() {
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(random(0, 100));
        }
        return linkedList;
    }

    @Override
    public void add(int a) {
        List<Integer> linkedList = Setup();
        long startTime = System.nanoTime();
        linkedList.add(a);
        long endTime = System.nanoTime();
        System.out.println("Time add cua " + a + " là " + (endTime - startTime));

    }

    
}
