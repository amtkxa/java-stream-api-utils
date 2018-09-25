package operator;

import java.util.List;
import java.util.stream.Collectors;
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
    public static Object[] convertStreamToArray(Stream<Object> stream) {
        return stream.toArray();
    }

    /**
     * Stream型をListに変換
     *
     * @param stream
     * @return 要素数
     */
    public static List<Object> convertStreamToList(Stream<Object> stream) {
        return stream.collect(Collectors.toList());
    }
}
