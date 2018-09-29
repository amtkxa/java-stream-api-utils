package function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AggregateTest {

  @Test
  void count() {
    List<Integer> arrays = Arrays.asList(200, 100, 300);
    long result = Aggregate.count(arrays);
    assertThat(result, is(3L));
  }

  @Test
  void min() {
    List<Integer> arrays = Arrays.asList(200, 100, 300);
    Integer result = Aggregate.min(arrays);
    assertThat(result, is(100));
  }

  @Test
  void max() {
    List<Integer> arrays = Arrays.asList(200, 100, 300);
    Integer result = Aggregate.max(arrays);
    assertThat(result, is(300));
  }

  @Test
  void average() {
    List<Integer> arrays = Arrays.asList(200, 100, 300);
    Double result = Aggregate.average(arrays);
    assertThat(result, is(200.0));
  }
}
