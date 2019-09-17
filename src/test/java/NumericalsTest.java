import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class NumericalsTest {

    @Test
    public void given_one_letter_should_return_1(){
        assertThat(Numericals.of("a")).isEqualTo("1");
    }

    @Test
    public void given_same_two_letter_should_return_12(){
        assertThat(Numericals.of("aa")).isEqualTo("12");
    }

    @Test
    public void given_different_two_letter_should_return_11(){
        assertThat(Numericals.of("ab")).isEqualTo("11");
    }

    @Test
    public void given_aba_should_return_112(){
        assertThat(Numericals.of("aba")).isEqualTo("112");
    }

    @Test
    public void given_Hello_World_should_return_1112112131(){
        assertThat(Numericals.of("HelloWorld")).isEqualTo("1112112131");
    }



}
