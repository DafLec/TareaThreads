public class Main {
    public static void main(String args[]) {
        Storage s = new Storage();
        new Counter(s).start();
        new Printer(s).start();
    }
}
