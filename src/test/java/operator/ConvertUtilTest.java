package operator;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;

class ConvertUtilTest {
    @Test
    void convertStreamToArray() {
        Stream<String> stream = Stream.of("AAA", "BBB", "CCC");
        Object[] objArray = ConvertUtil.convertStreamToArray(stream);
        assertThat(objArray, arrayContaining("AAA", "BBB","CCC"));
    }
}