package com.ust.LP6.c3_DESIGN_PATTERN.Decorator.a8;

public class Sandwich {
    private String bread;
    private String vegetables;
    private String meats;
    private String sauces;

    private Sandwich() {}

    public static class Builder {
        private String bread;
        private String vegetables;
        private String meats;
        private String sauces;

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setVegetables(String vegetables) {
            this.vegetables = vegetables;
            return this;
        }

        public Builder setMeats(String meats) {
            this.meats = meats;
            return this;
        }

        public Builder setSauces(String sauces) {
            this.sauces = sauces;
            return this;
        }

        public Sandwich build() {
            Sandwich sandwich = new Sandwich();
            sandwich.bread = this.bread;
            sandwich.vegetables = this.vegetables;
            sandwich.meats = this.meats;
            sandwich.sauces = this.sauces;
            return sandwich;
        }
    }

    @Override
    public String toString() {
        return "Sandwich [bread=" + bread + ", vegetables=" + vegetables + ", meats=" + meats + ", sauces=" + sauces + "]";
    }
}
