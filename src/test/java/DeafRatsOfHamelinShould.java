import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DeafRatsOfHamelinShould {
    @Test
    public void be_zero_when_they_are_zero() {
        assertThat(DeafRatsOfHamelin.count("P")).isEqualTo(0);
    }

    @Test
    public void be_one_when_it_is_facing_right() {
        assertThat(DeafRatsOfHamelin.count("P")).isEqualTo(1);
    }

    private static class DeafRatsOfHamelin {
        public static int count(String rats) {
            return 0;
        }
    }
}
