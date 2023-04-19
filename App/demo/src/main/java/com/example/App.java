package com.example;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);
        GLCanvas gc = new GLCanvas(cap);
        JoglFrames jf = new JoglFrames();
        gc.addGLEventListener(jf);
        gc.setSize(350,350);
        JFrame frame = new JFrame("Dragon Slayer");
        frame.add(gc);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}