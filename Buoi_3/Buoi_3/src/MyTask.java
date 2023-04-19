public class MyTask implements Runnable {

    private int times;
    private String name;

    public MyTask (int times, String name){
        this.times = times;
        this.name = name;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < this.times; i++) {
            System.out.print(this.name + i + " ");
        }

    }
}
