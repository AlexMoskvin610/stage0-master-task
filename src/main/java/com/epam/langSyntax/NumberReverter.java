package com.epam.langSyntax;

public class NumberReverter {

    //897
    public void revert(int number) {
        var value = String.valueOf(number);
        var reversed =  new StringBuilder(value).reverse().toString();

        System.out.println(reversed);
    }

}
