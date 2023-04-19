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
            arrayList.add(i);
        }
        return arrayList;
    }

    @Override
    public void remove(int a) {
        List<Integer> arrayList = Setup();
        long startTime = System.nanoTime();
        arrayList.remove(a);
        long endTime = System.nanoTime();
        System.out.println("Time remove cua " + a + " là " + (endTime - startTime));
    }

}
