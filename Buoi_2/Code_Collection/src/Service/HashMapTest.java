package Service;

import java.util.Map;
import java.util.Random;
import java.util.HashMap;

import Interface.ICollection;

public class HashMapTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    Map<Integer,Integer> Setup() {
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i <= 1000000; i++) {
            hashMap.put(i,random(0, 100));
        }
        return hashMap;
    }

    @Override
    public void add() {
        Map<Integer,Integer> hashMap = Setup();
        long startTime = System.nanoTime();
        hashMap.put(random(0, 10000000),random(0, 100));
        long endTime = System.nanoTime();
        System.out.println("Time add : " + (endTime - startTime));

    }

    @Override
    public void remove() {
        Map<Integer,Integer> hashMap = Setup();
        long startTime = System.nanoTime();
        hashMap.remove(random(0, 1000000));
        long endTime = System.nanoTime();
        System.out.println("Time remove : " + (endTime - startTime));
    }

    @Override
    public void find() {
        Map<Integer,Integer> hashMap = Setup();
        long startTime = System.nanoTime();
        hashMap.get(random(0, 1000000));
        long endTime = System.nanoTime();
        System.out.println("Time find : " + (endTime - startTime));
    }
    
}


