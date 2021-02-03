package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public DomesticCat() {
        super();
        this.setSetting("domestic");
        this.setAverageHeight(23);
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    public String eat(String randomComment) {
        return this.eat() + " " + randomComment;
    }
}
