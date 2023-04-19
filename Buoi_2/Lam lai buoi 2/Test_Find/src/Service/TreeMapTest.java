package Service;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import Interface.ICollection;

public class TreeMapTest implements ICollection  {


    Map<Integer,Integer> Setup() {
        Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
        for (int i = 0; i <= 1000000; i++) {
            treeMap.put(i,i);
        }
        return treeMap;
    }

    @Override
    public void find(int a) {
        Map<Integer,Integer> treeMap = Setup();
        long startTime = System.nanoTime();
        treeMap.get(a);
        long endTime = System.nanoTime();
        System.out.println("Time find cua "+ a + " la :" + (endTime - startTime));
    }
    
}


