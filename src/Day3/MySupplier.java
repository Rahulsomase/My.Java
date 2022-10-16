package Day3;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String> {

    public String get() {
        return "Hello there";
    }
}
