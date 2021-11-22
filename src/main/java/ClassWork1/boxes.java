package ClassWork1;

import processing.core.PApplet;


public class boxes extends PApplet{

    public static void main(String[] args) {
        PApplet.main(boxes.class);
    }

    @Override
    public void settings() {
        size(700, 600);
    }

    @Override
    public void draw() {
        background(100);
        width=60;
        height=60;
        for(int x = 0;x < 10;x++)
        {
            for( int y = 0;y < 10;y++)
            {
                rect(x * width,y * height, width, height);
            }
        }
    }
}

