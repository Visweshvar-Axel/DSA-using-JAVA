package com.ust.LP4.a3;

public class MuseumTour {
    public static class Exhibit {
        private String name;
        private int id;

        public Exhibit(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
