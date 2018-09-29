package operator;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * Stream への変換
 *
 * @since 1.8
 */
public class ConvertToStream {
    private ConvertToStream() {}

    /**
     * 配列をStream型に変換
     *
     * @param obj
     * @return a {@code Stream} for the array
     * @since 1.8
     */
    public static Stream<Object> convertArrayToStream(Object[] obj) {
        return Arrays.stream(obj);
    }

    /**
     * Map型をStreamに変換
     *
     * @param map
     * @return a {@code Stream} for the map
     */
    public static Stream<Entry<Object, Object>> convertMapToStream(Map<Object,Object> map) {
        return map.entrySet().stream();
    }
}
