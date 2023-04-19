package Service;

import java.util.Map;
import java.util.HashMap;

import Interface.ICollection;

public class HashMapTest implements ICollection  {

    Map<Integer,Integer> Setup() {
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i <= 1000000; i++) {
            hashMap.put(i,i);
        }
        return hashMap;
    }

    @Override
    public void find( int a) {
        Map<Integer,Integer> hashMap = Setup();
        long startTime = System.nanoTime();
        hashMap.get(a);
        long endTime = System.nanoTime();
        System.out.println("Time find cua "+ a + " la :" + (endTime - startTime));
    }
    
}


