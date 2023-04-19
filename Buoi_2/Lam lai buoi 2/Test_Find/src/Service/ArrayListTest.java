package Service;

import java.util.List;
import java.util.ArrayList;

import Interface.ICollection;

public class ArrayListTest implements ICollection  {

    List<Integer> Setup() {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    @Override
    public void find (int a) {
        List<Integer> arrayList = Setup();
        long startTime = System.nanoTime();
        arrayList.contains(a);
        long endTime = System.nanoTime();
        System.out.println("Time find cua "+ a + " la :" + (endTime - startTime));
    }
    
}
