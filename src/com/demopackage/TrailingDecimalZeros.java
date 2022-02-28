package com.demopackage;

import java.text.DecimalFormat;

public class TrailingDecimalZeros {

    public static void main(String[] args) {
        Double number1 = 7.00;
        Double result = Math.sqrt(number1);

        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println(
            "SQRT formatted " + format.format(result)
        );
    }
}
