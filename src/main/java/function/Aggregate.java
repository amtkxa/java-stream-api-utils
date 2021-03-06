package function;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/**
 * 集約操作
 *
 * @since 1.8
 */
public class Aggregate {
  private Aggregate() {}

  /**
   * 要素数の取得
   *
   * @param arrays
   * @return 要素数
   */
  public static long count(List<Integer> arrays) {
    long count = arrays.stream().count();
    return count;
  }

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

  /**
   * 最大値の取得
   *
   * @param arrays
   * @return 最大値
   */
  public static Integer max(List<Integer> arrays) {
    Optional<Integer> max = arrays.stream().max(Comparator.naturalOrder());
    return max.get();
  }

  /**
   * 平均値の取得
   *
   * @param arrays
   * @return 平均値
   */
  public static Double average(List<Integer> arrays) {
    OptionalDouble average = arrays.stream().mapToDouble(num -> num).average();
    return average.getAsDouble();
  }
}
