package operator;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Map への変換
 *
 * @since 1.8
 */
public class ConvertToMap {
  private ConvertToMap() {}

  /**
   * 配列を Map に変換
   *
   * @param array
   * @return a map containing the elements of array
   */
  public static Map<Object, Object> convertArrayToMap(Object[][] array) {
    return Stream.of(array).collect(Collectors.toMap(key -> key[0], value -> value[1]));
  }
}
