public class Counter extends Thread {
    private Storage stored;
    private Thread t;
    public Counter(Storage store){
        stored = store;
    }
    public void run(){
        try{
            int i = 0;
            while (true) {
                stored.setStored(i++);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex){
            System.out.println(ex.toString());
        }
    }
    public void start(){
        if(t == null){
            t = new Thread(this);
            t.start();
        }
    }
}
