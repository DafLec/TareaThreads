public class Printer extends Thread {
    Storage stored;
    Thread t;
    public Printer(Storage store){
        stored = store;
    }
    public void run(){
        try{
            while (true) {
				wait();
                System.out.println(stored.getStored());
            }
        }
        catch(Exception ex){
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
