package Service;

import java.util.List;
import java.util.LinkedList;

import Interface.ICollection;

public class LinkedListTest implements ICollection  {


    List<Integer> Setup() {
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    @Override
    public void find(int a) {
        List<Integer> linkedList = Setup();
        long startTime = System.nanoTime();
        linkedList.contains(a);
        long endTime = System.nanoTime();
        System.out.println("Time find cua "+ a + " la :" + (endTime - startTime));
    }
    
}
