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
         //test1.remove(10101);


         HashMapTest test2 = new HashMapTest();

        //test2.remove(10101);


        TreeMapTest test4 = new TreeMapTest();

        test4.remove(10101);


        HashSetTest test3 = new HashSetTest();

        //test3.remove(101);
;

        TreeSetTest test5 = new TreeSetTest();

        //test5.remove(10101);


        LinkedListTest test6 = new LinkedListTest();
        //test6.remove(10101);


    }
}
