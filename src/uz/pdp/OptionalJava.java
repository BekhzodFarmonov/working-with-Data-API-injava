package uz.pdp;
import java.util.Optional;
public class OptionalJava {
    public static void main(String[] args) {
        Integer str=null;
        Optional<Integer> optionalStr = Optional.ofNullable(str);
        if (optionalStr.isPresent()) {
            System.out.println(optionalStr.get());
        } else {
            System.out.println("Value is absent this object .");
}}}
