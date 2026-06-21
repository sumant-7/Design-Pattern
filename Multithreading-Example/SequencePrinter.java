public class SequencePrinter {
    private static final Object lock = new Object();
    private static int turn = 0;

    public static void main(String[] args) {
        System.out.println("Hello");
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=3;i++){
                printNumber(i);
            }
        });
        Thread t2 = new Thread(() -> {
            char ch[] = {'a', 'b', 'c'};
            for(int i=0;i<3;i++){
                printCharacter(ch[i]);
            }
        });
        Thread t3 = new Thread(() -> {
            int test[] = {101, 102, 103};
            for(int i=0;i<3;i++){
                solve(test[i]);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        System.out.println("World");
    }

    private static void printNumber(int i) {
        synchronized (lock){
            while(turn != 0){
                try{
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i);
            turn = 1;
            lock.notifyAll();
        }
    }

    private static void printCharacter(char ch) {
        synchronized (lock){
            while(turn != 1){
                try{
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(ch);
            turn = 2;
            lock.notifyAll();

        }
    }
    private static void solve(int number) {
        synchronized (lock){
            while(turn != 2){
                try{
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(number);
            turn = 0;
            lock.notifyAll();

        }
    }
}
