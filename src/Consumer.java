import java.util.*;
import java.util.ArrayList;

public class Consumer implements Runnable {
    private List<String> list;

    public Consumer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (!list.isEmpty()) {
                String str = list.remove(0);
                System.out.println("Consumed: " + str);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
