package converter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ConvertToMapTest {

  @Test
  void convertArrayToMap() {
    Object[][] array =
        new Object[][] {
          {1, "one"},
          {2, "two"},
          {3, "three"}
        };
    Map<Object, Object> answer =
        new HashMap<Object, Object>() {
          {
            put(1, "one");
            put(2, "two");
            put(3, "three");
          }
        };
    Map<Object, Object> map = ConvertToMap.convertArrayToMap(array);
    assertThat(map, is(answer));
  }
}
