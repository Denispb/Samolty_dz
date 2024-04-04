import java.util.*;
public class Main {
    public void main(String[] args) {
        PorhnevoiSamolet porhnevoiSamolet = new PorhnevoiSamolet("ПоршневойСамолет", "белый", 23, 90);
        System.out.println(porhnevoiSamolet);
        Reaktivnyi reaktivnyi = new Reaktivnyi("РеактивныйСамолет", "черный", 15, 360);
        System.out.println(reaktivnyi);
        Biznessdjet biznessdjet = new Biznessdjet("Бизнесджет", "желтый", 28, 200);
        System.out.println(biznessdjet);
        Kukuruznik kukuruznik = new Kukuruznik("Кукурузник", "синий", 10, 50);
        System.out.println(kukuruznik);
        Avialainer avialainer = new Avialainer("Авиалайнер", "оранжеый", 100, 150);
        System.out.println(avialainer);
        SportivnyiSamolet sportivnyiSamolet = new SportivnyiSamolet("СпортивныйСамолет", "зеленый", 18, 260);
        System.out.println(sportivnyiSamolet);
    }

    class Samolet {

        String name;
        String color;
        int dlina;
        int speed;

        public Samolet(String name, String color, int dlina, int speed) {
            this.name = name;
            this.color = color;
            this.dlina = dlina;
            this.speed = speed;
        }

        public void setDlina(int dlina) {
            this.dlina = dlina;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            String a = "Cамолет: " + name + ", цвет " + color + ", длина " + dlina + ", cкорость " + speed;
            return a;
        }

        public String getName() {
            return name;
        }

        public int getDlina() {

            return dlina;
        }

        public int getSpeed(int speed) {

            return speed;
        }

        public String getColor(String color) {

            return color;
        }
    }

    class PorhnevoiSamolet extends Samolet {

        public PorhnevoiSamolet(String name, String color, int dlina, int speed) {
            super(name, color, dlina, speed);
        }
    }

    class Reaktivnyi extends Samolet {

        public Reaktivnyi(String name, String color, int dlina, int speed) {
            super(name, color, dlina, speed);
        }
    }
    class Biznessdjet extends Samolet {
        public Biznessdjet(String name, String color, int dlina, int speed) {
            super(name, color, dlina, speed);
        }
    }
        class Kukuruznik extends Samolet {
            public Kukuruznik(String name, String color, int dlina, int speed) {
                super(name, color, dlina, speed);
            }
    }
    class Avialainer extends Samolet {
        public Avialainer(String name, String color, int dlina, int speed) {
            super(name, color, dlina, speed);
        }
    }
    class SportivnyiSamolet extends Samolet {
        public SportivnyiSamolet(String name, String color, int dlina, int speed) {
            super(name, color, dlina, speed);
        }
    }




}
