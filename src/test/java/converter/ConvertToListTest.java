package converter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

class ConvertToListTest {

  @Test
  void convertStreamToList() {
    Stream<Object> stream = Stream.of("AAA", "BBB", "CCC");
    List<Object> objList = ConvertToList.convertStreamToList(stream);
    assertThat(objList, contains("AAA", "BBB", "CCC"));
  }

  @Test
  void convertListToKeyOfMap() {
    Map<Object, Object> map =
        new HashMap<Object, Object>() {
          {
            put("1", "one");
            put("2", "two");
            put("3", "three");
          }
        };
    List<Object> objList = ConvertToList.convertListToKeyOfMap(map);
    assertThat(objList, contains("1", "2", "3"));
  }

  @Test
  void convertListToValueOfMap() {
    Map<Object, Object> map =
        new HashMap<Object, Object>() {
          {
            put("1", "one");
            put("2", "two");
            put("3", "three");
          }
        };
    List<Object> objList = ConvertToList.convertListToValueOfMap(map);
    assertThat(objList, contains("one", "two", "three"));
  }
}
