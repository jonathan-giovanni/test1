package com.test;

import processing.core.*;

public class Ventana extends PApplet {


    @Override
    public void settings() {
        size(640, 360, P3D);
    }

    @Override
    public void setup() {
        noStroke();
        fill(204);
    }

    @Override
    public void draw() {
        noStroke();
        background(0);
        float dirY = (mouseY / (float)(height - 0.5) * 2);
        float dirX = (mouseX / (float)(width - 0.5) * 2);
        directionalLight(204, 204, 204, -dirX, -dirY, -1);
        translate(width/2 - 100, height/2, 0);
        sphere(80);
        translate(200, 0, 0);
        sphere(80);
    }
}
