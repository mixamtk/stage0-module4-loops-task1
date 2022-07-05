
package school.mjc.stage0.loops.task1;
import java.util.stream.Stream;
import java.util.function.Supplier;

public class RepeatIsBad {
    public void repeatIsBad(){
     Supplier<String> supplierStr = "writing the same code doesn't have much impact, and it's also time consuming"::toString;
        List<String> sup = Stream.generate(supplierStr).limit(20).collect(Collectors.toList());
        System.out.println(sup);
    }
}
