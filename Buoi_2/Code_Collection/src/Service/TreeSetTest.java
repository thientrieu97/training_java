package Service;

import java.util.Set;
import java.util.Random;
import java.util.TreeSet;

import Interface.ICollection;

public class TreeSetTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    Set<Integer> Setup() {
        Set<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i <= 1000000; i++) {
            treeSet.add(i);
        }
        return treeSet;
    }

    @Override
    public void add() {
        Set<Integer> treeSet = Setup();
        long startTime = System.nanoTime();
        treeSet.add(random(0, 100));
        long endTime = System.nanoTime();
        System.out.println("Time add : " + (endTime - startTime));

    }

    @Override
    public void remove() {
        Set<Integer> treeSet = Setup();
        long startTime = System.nanoTime();
        treeSet.remove(random(0, 1000000));
        long endTime = System.nanoTime();
        System.out.println("Time remove : " + (endTime - startTime));
    }

    @Override
    public void find() {
        Set<Integer> treeSet = Setup();
        long startTime = System.nanoTime();
        treeSet.contains(random(0, 1000000));
        long endTime = System.nanoTime();
        System.out.println("Time find : " + (endTime - startTime));
    }
    
}

