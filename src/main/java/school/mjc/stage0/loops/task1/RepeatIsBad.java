
package school.mjc.stage0.loops.task1;
import java.util.stream.Stream;
import java.util.function.Supplier;

public class RepeatIsBad {
    public void repeatIsBad(){
        Supplier<String> supplierStr = "writing the same code doesn't have much impact, and it's also time consuming"::toString;
        Stream.generate( supplierStr).limit(20).forEach(System.out::println);
    }
}
