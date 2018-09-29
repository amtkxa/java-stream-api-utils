package operator;

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
}
