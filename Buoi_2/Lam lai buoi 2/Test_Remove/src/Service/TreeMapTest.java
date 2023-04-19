package Service;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import Interface.ICollection;

public class TreeMapTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    Map<Integer,Integer> Setup() {
        Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
        for (int i = 0; i <= 1000000; i++) {
            treeMap.put(i,i);
        }
        return treeMap;
    }


    @Override
    public void remove(int a) {
        Map<Integer,Integer> treeMap = Setup();
        long startTime = System.nanoTime();
        treeMap.remove(random(0, 1000000));
        long endTime = System.nanoTime();
        System.out.println("Time remove cua " + a + " là " + (endTime - startTime));
    }
    
    
}


