package Service;

import java.util.Set;
import java.util.Random;
import java.util.TreeSet;

import Interface.ICollection;

public class TreeSetTest implements ICollection  {


    Set<Integer> Setup() {
        Set<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i <= 1000000; i++) {
            treeSet.add(i);
        }
        return treeSet;
    }


    @Override
    public void find(int a) {
        Set<Integer> treeSet = Setup();
        long startTime = System.nanoTime();
        treeSet.contains(a);
        long endTime = System.nanoTime();
        System.out.println("Time find cua "+ a + " la :" + (endTime - startTime));
    }
    
}

