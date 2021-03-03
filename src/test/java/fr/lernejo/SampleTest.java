package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {
    @Test
    void addition() {
        int dividend = 10;
        int divisor = 1;
        Sample s = new Sample();

        int sum = s.op(Sample.Operation.ADD, dividend, divisor);
        Assertions.assertThat(sum).as("Somme de 2 nombres")
            .isEqualTo(11);

    }

    @Test
    void multiplication() {
        int dividend = 10;
        int divisor = 2;
        Sample s = new Sample();

        int product = s.op(Sample.Operation.MULT, dividend, divisor);

        Assertions.assertThat(product).as("Produit de 2 nombres")
            .isEqualTo(20);
    }
}
