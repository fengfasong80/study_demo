package com.stydy.sort;

public class SonTest extends ParTest {

    public SonTest(Integer age) {
        super(age);
    }

    public SonTest() {
    }

    public static void main(String[] args) {

        SonTest sonTest = (SonTest) new ParTest(1);
    }
}
