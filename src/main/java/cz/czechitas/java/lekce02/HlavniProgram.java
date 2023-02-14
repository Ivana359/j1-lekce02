package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        zofka.setLocation(250,250);
        for (int i = 0; i < 10; i++) {
            nakresliDomek();
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.penDown();

        }

        zofka.setLocation(600,600);

        prasatko();
    }

    private void prasatko() {
        zofka.turnLeft(90);
        nakresliDomek();
        zofka.turnLeft(90);
        zofka.move(100);

        nozicky();

        zofka.move(150);
        zofka.turnLeft(90);

        nozicky();

        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnRight(180);
    }

    private void nozicky() {
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(45);
    }

    private void nakresliDomek() {
        nakresliObdelnik();
        zofka.move(150);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);
        zofka.turnLeft(30);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
    }

    public void nakresliObdelnik() {
        for (int i = 0; i < 2; i++) {
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }



    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
