package operator;

import java.util.List;

/**
 * CSV作成関連
 *
 * @since 1.8
 */
public class CSVUtils {
  private CSVUtils() {}

  /**
   * List を delimiter 区切りの文字列に変換
   *
   * @param delimiter
   * @param list
   * @return 要素数
   */
  public static String convertListToSeparatedString(String delimiter, List<String> list) {
    return String.join(delimiter, list);
  }
}
