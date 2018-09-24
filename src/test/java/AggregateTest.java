import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

class AggregateTest {

    @Test
    void min() {
        List<Integer> arrays = Arrays.asList(200, 100, 300);
        Integer result = Aggregate.min(arrays);
        assertThat(result, is(100));
    }
}