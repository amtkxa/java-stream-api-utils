import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * 集約操作
 */
public class Aggregate {
    private Aggregate() {}

    /**
     * 最小値の取得
     *
     * @param arrays
     * @return 最小値
     */
    public static Integer min(List<Integer> arrays) {
        Optional<Integer> min = arrays.stream().min(Comparator.naturalOrder());
        return min.get();
    }
}
