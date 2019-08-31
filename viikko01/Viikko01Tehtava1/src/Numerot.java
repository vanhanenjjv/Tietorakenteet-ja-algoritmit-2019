import java.util.stream.Collectors;

public class Numerot {
    int summa(int x) {
        return Integer.toString(x).chars()
            .mapToObj(i -> (char)i)
            .collect(Collectors.summingInt(c -> 
                Integer.parseInt(Character.toString(c))));
    }
}
