public class Osajonot {
    int laske(String a, String b) {
        int matches = 0;
        int matchIndex = -1;

        while (true) {
            matchIndex = a.indexOf(b, matchIndex + 1);

            if (matchIndex == -1)
                break;

            ++matches;
        }

        return matches;
    }
}
