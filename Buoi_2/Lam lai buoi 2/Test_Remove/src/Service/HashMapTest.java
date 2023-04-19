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
            hashMap.put(i,i);
        }
        return hashMap;
    }

        @Override
    public void remove(int a) {
        Map<Integer,Integer> hashMap = Setup();
        long startTime = System.nanoTime();
        hashMap.remove(a);
        long endTime = System.nanoTime();
        System.out.println("Time remove cua " + a + " là " + (endTime - startTime));
    }

   
    
}


