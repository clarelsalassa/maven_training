package fr.lernejo;


import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Division;
import org.junit.jupiter.api.Test;

import java.rmi.UnexpectedException;

class SampleTest {

    @Test
    void addition_1_plus_1_should_return_2() {
        int arg1 = 1;
        int arg2 = 1;
        int res = Sample.op(Sample.Operation.ADD, arg1, arg2);
        Assertions.assertThat(res).as("Addition of 1 and 1").isEqualTo(2);
    }

    @Test
    void multiplication_2_by_2_should_return_4() {
        int arg1 = 2;
        int arg2= 2;
        int res = Sample.op(Sample.Operation.MULT, arg1, arg2);
        Assertions.assertThat(res).as("Multiplication 2 by 2").isEqualTo(4);
    }

    @Test
    void fact_of_minus_number_should_produce_an_exception(){
        int arg = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> Sample.fact(arg));
    }

    @Test
    void fact_of_5_should_return_120() {
        int arg = 5;
        int res = Sample.fact(arg);
        Assertions.assertThat(res).as("Fact de 5").isEqualTo(120);
    }
}
