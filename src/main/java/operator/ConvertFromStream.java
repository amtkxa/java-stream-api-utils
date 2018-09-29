package operator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 変換
 */
public class ConvertFromStream {
    private ConvertFromStream() {}

    /**
     * Stream型を配列に変換
     *
     * @param stream
     * @return Array
     */
    public static Object[] convertStreamToArray(Stream<Object> stream) {
        return stream.toArray();
    }

    /**
     * Stream型をListに変換
     *
     * @param stream
     * @return List
     */
    public static List<Object> convertStreamToList(Stream<Object> stream) {
        return stream.collect(Collectors.toList());
    }
}
