package calc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CalcMin {
    private CalcMin() {}

    public static Integer min(List<Integer> arrays) {
        Optional<Integer> min = arrays.stream().min(Comparator.naturalOrder());
        return min.get();
    }
}
