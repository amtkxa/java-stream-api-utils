package operator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 変換
 */
public class ConvertToStream {
    private ConvertToStream() {}

    /**
     * 配列をStream型に変換
     *
     * @param obj
     * @return Stream
     */
    public static Stream<Object> convertArrayToStream(Object[] obj) {
        return Arrays.stream(obj);
    }

    /**
     * Map型をStreamに変換
     *
     * @param map
     * @return Stream
     */
    public static Stream<Map.Entry<Object, Object>> convertMapToStream(Map<Object,Object> map) {
        return map.entrySet().stream();
    }
}
