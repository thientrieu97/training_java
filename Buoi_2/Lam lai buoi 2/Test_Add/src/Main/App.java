package Main;

import Service.ArrayListTest;
import Service.HashMapTest;
import Service.HashSetTest;
import Service.LinkedListTest;
import Service.TreeMapTest;
import Service.TreeSetTest;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayListTest test1 = new ArrayListTest();
        //test1.add(10101);


        HashMapTest test2 = new HashMapTest();
        //test2.add(101);


        HashSetTest test3 = new HashSetTest();
        //test3.add(101);

        TreeSetTest test5 = new TreeSetTest();
        //test5.add(101);

        LinkedListTest test6 = new LinkedListTest();
        //test6.add(10101);

        TreeMapTest test4 = new TreeMapTest();
        //test4.add(101);


    }
}
