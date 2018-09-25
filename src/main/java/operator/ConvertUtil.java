package operator;

import java.util.stream.Stream;

/**
 * 変換
 */
public class ConvertUtil {
    private ConvertUtil() {}

    /**
     * Stream型を配列に変換
     *
     * @param stream
     * @return 要素数
     */
    public static Object[] convertStreamToArray(Stream<String> stream) {
        return stream.toArray();
    }

}
