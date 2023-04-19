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
        // test1.find(101);
        // test1.find(1010);
        // test1.find(10101);
        HashMapTest test2 = new HashMapTest();
        //test2.find(101);
        //test2.find(1010);
        // test2.find(10101);

        HashSetTest test3 = new HashSetTest();
        // test3.find(101);
        // test3.find(1010);
        // test3.find(10101);
        TreeSetTest test5 = new TreeSetTest();
        // test5.find(10101);

        LinkedListTest test6 = new LinkedListTest();
        // test6.find(101);
        // test6.find(1010);
        //test6.find(10101);

        TreeMapTest test4 = new TreeMapTest();
        //  test4.find(10101);
    }
}
