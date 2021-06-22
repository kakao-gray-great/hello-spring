package hello.hellospring.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCode {

    @Test
    public void test() {
        String title = "hello";

        Assertions.assertThat(title).isEqualTo("hello");
    }

    @Test
    public void test2() {
        String title = "hello";

        Assertions.assertThat(title).isEqualTo("hello");
    }
}
