package Service;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import Interface.ICollection;

public class ArrayListTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    List<Integer> Setup() {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random(0, 100));
        }
        return arrayList;
    }

    @Override
    public void add() {
        List<Integer> arrayList = Setup();
        long startTime = System.nanoTime();
        arrayList.add(random(0, 100));
        long endTime = System.nanoTime();
        System.out.println("Time add : " + (endTime - startTime));

    }

    @Override
    public void remove() {
        List<Integer> arrayList = Setup();
        long startTime = System.nanoTime();
        arrayList.remove(random(0, 1000000-1));
        long endTime = System.nanoTime();
        System.out.println("Time remove : " + (endTime - startTime));
    }

    @Override
    public void find() {
        List<Integer> arrayList = Setup();
        long startTime = System.nanoTime();
        arrayList.contains(random(0, 100));
        long endTime = System.nanoTime();
        System.out.println("Time find : " + (endTime - startTime));
    }
    
}
