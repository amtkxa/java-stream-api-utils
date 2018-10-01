package converter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Array への変換
 *
 * @since 1.8
 */
public class ConvertToArray {
  private ConvertToArray() {}

  /**
   * Stream型を配列に変換
   *
   * @param stream
   * @return an array containing the elements of this stream
   */
  public static Object[] convertStreamToArray(Stream<Object> stream) {
    return stream.toArray();
  }

    /**
     * Map を配列に変換
     *
     * @param array
     * @return a map containing the elements of array
     */
    public static Object[][] convertMapToArray(Map<Object, Object> map) {
        return Stream.of(map).collect(Collectors.(map.entrySet() -> map[0], value -> value[1]));
    }
}
