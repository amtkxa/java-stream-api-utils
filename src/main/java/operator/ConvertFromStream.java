package operator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream からの変換
 *
 * @since 1.8
 */
public class ConvertFromStream {
    private ConvertFromStream() {}

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
     * Stream型をListに変換
     *
     * @param stream
     * @return a list containing the elements of this stream
     */
    public static List<Object> convertStreamToList(Stream<Object> stream) {
        return stream.collect(Collectors.toList());
    }
}
