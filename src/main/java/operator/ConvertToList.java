package operator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * List への変換
 *
 * @since 1.8
 */
public class ConvertToList {
  private ConvertToList() {}

  /**
   * Stream型をListに変換
   *
   * @param stream
   * @return a list containing the elements of this stream
   */
  public static List<Object> convertStreamToList(Stream<Object> stream) {
    return stream.collect(Collectors.toList());
  }

  /**
   * Map の key から Listを生成
   *
   * @param map
   * @return a list containing key of map
   */
  public static List<Object> convertListToKeyOfMap(Map<Object, Object> map) {
    return map.keySet().stream().collect(Collectors.toList());
  }

  /**
   * Map の value から Listを生成
   *
   * @param map
   * @return a list containing value of map
   */
  public static List<Object> convertListToValueOfMap(Map<Object, Object> map) {
    return map.values().stream().collect(Collectors.toList());
  }
}
