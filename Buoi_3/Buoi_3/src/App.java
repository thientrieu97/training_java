public class App {
    public static void main(String[] args) throws Exception {
        MyTask task1 = new MyTask(10,"A");
        Thread t1 = new Thread(task1);
        MyTask task2 = new MyTask(10,"B");
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
    }

}
