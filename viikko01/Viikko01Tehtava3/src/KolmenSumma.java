import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class KolmenSumma {
    int laske(int x) {
        Set<List<Integer>> combinations = new HashSet<List<Integer>>();

        for (int i = 1; i < x; ++i) {
            for (int j = 1; j < x; ++j) {
                if (j == i)
                    continue;

                for (int k = 1; k < x; ++k) {
                    if (k == i || k == j)
                        continue;

                    if (i + j + k == x)
                        continue;   
                          
                    List<Integer> combination = Stream.of(new Integer[] { i, j, k })
                        .sorted()
                        .collect(Collectors.toList());

                    combinations.add(combination);               
                }
            }
        }

        return combinations.size();
    }
}
