package Service;

import java.util.Set;
import java.util.Random;
import java.util.HashSet;

import Interface.ICollection;

public class HashSetTest implements ICollection  {

    public static int random(int min, int max) {
        Random random = new Random();
        int randoms = random.nextInt(max - min + 1) + min;
        return randoms;
    }

    Set<Integer> Setup() {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i <= 1000000; i++) {
            hashSet.add(i);
        }
        return hashSet;
    }


    @Override
    public void remove(int a) {
        Set<Integer> hashSet = Setup();
        long startTime = System.nanoTime();
        hashSet.remove(a);
        long endTime = System.nanoTime();
        System.out.println("Time remove cua " + a + " là " + (endTime - startTime));
    }

}

