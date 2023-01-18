import java.sql.SQLOutput;
import java.util.*;
public class Producer implements Runnable {
    private List<String> list;
    private long counter = 0;

    public Producer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            String str = "String number " + counter;
            list.add(str);
            counter++;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


