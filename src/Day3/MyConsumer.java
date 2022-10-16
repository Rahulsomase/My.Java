package Day3;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

    public void accept(String str) {
        System.out.println("here" + str);
    }
}
