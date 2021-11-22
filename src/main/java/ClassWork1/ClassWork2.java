package ClassWork1;

import processing.core.PApplet;

public class ClassWork2 extends PApplet {

    public static void main(String[] args) {
        PApplet.main(ClassWork2.class);
    }

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void draw() {
        rect(0, 0, 100, 100);

    }
}

