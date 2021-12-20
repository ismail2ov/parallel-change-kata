package com.parallelchange.field;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ImagineThisIsAClientInADifferentRepositoryTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();
        String expected = "Total price is 50 euro";

        String actual = client.formattedTotalPrice(50);

        assertThat(actual).isEqualTo(expected);
    }

}
