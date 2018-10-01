package converter;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;

class ConvertToArrayTest {

  @Test
  void convertStreamToArray() {
    Stream<Object> stream = Stream.of("AAA", "BBB", "CCC");
    Object[] objArray = ConvertToArray.convertStreamToArray(stream);
    assertThat(objArray, arrayContaining("AAA", "BBB", "CCC"));
  }
}
