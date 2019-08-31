import java.util.Arrays;
import java.util.ArrayList;

public class KolmenSumma {
    int laske(int x) {
        ArrayList<int[]> combinations = new ArrayList<int[]>();

        for (int i = 1; i < x; ++i) {
            for (int j = 1; j < x; ++j) {
                if (j == i)
                    continue;

                for (int k = 1; k < x; ++k) {
                    if (k == i || k == j)
                        continue;

                    if (i + j + k == x) {       
                        int[] combination = new int[] { i, j, k };
                        Arrays.sort(combination);

                        boolean exists = combinations.stream()
                            .anyMatch(c -> Arrays.equals(c, combination));
                        
                        if (!exists)
                            combinations.add(combination);
                    }                  
                }
            }
        }

        return combinations.size();
    }
}
