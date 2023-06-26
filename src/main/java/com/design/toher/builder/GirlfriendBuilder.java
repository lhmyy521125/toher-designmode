package com.design.toher.builder;

import java.util.List;

public class GirlfriendBuilder {
    private Girlfriend girlfriend;

    public GirlfriendBuilder() {
        girlfriend = new Girlfriend();
    }

    public GirlfriendBuilder setHeight(int height) {
        girlfriend.setHeight(height);
        return this;
    }

    public GirlfriendBuilder setWeight(int weight) {
        girlfriend.setWeight(weight);
        return this;
    }

    public GirlfriendBuilder setHairColor(String hairColor) {
        girlfriend.setHairColor(hairColor);
        return this;
    }

    public GirlfriendBuilder setHobbies(List<String> hobbies) {
        girlfriend.setHobbies(hobbies);
        return this;
    }

    public Girlfriend build() {
        return girlfriend;
    }
}

