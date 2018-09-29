package operator;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;

class ConvertFromStreamTest {

    @Test
    void convertStreamToArray() {
        Stream<Object> stream = Stream.of("AAA", "BBB", "CCC");
        Object[] objArray = ConvertFromStream.convertStreamToArray(stream);
        assertThat(objArray, arrayContaining("AAA", "BBB","CCC"));
    }

    @Test
    void convertStreamToList() {
        Stream<Object> stream = Stream.of("AAA", "BBB", "CCC");
        List<Object> objList = ConvertFromStream.convertStreamToList(stream);
        assertThat(objList, contains("AAA", "BBB","CCC"));
    }
}