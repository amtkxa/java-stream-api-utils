package operator;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInOrder.arrayContaining;

class ConvertToStreamTest {

  @Test
  void convertArrayToStream() {
    String[] array = {"AAA", "BBB", "CCC"};
    Stream<Object> stream = ConvertToStream.convertArrayToStream(array);
    assertThat(stream.toArray(String[]::new), arrayContaining("AAA", "BBB", "CCC"));
  }
}
