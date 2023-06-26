package com.design.toher.builder;

import java.util.Arrays;

public class BuilderPatternTest {
    public static void main(String[] args) {
        GirlfriendBuilder builder = new GirlfriendBuilder();
        Girlfriend girlfriend = builder
                .setHeight(160)
                .setWeight(50)
                .setHairColor("Brown")
                .setHobbies(Arrays.asList("旅行", "电影", "美食"))
                .build();
    }
}
