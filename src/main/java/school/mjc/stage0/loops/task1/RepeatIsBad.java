
package school.mjc.stage0.loops.task1;


public class RepeatIsBad {
    public void repeatIsBad(){
        Supplier<String> supplierStr = () ->  "writing the same code doesn't have much impact, and it's also time consuming";
        Stream.generate( supplierStr).limit(20).forEach(System.out::println);
    }
}
