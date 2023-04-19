
package com.example;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class JoglFrames implements GLEventListener {

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();        
            // Cabo
            gl.glColor3f(1f, 1f, 1f);
            gl.glBegin(GL2.GL_LINES);
            gl.glVertex2d(-0.02, -0.6);
            gl.glVertex2d(0.02, -0.6);
            gl.glVertex2d(0.02, -0.6);
            gl.glVertex2d(0.02, -0.4);
            gl.glVertex2d(0.02, -0.4);
            gl.glVertex2d(-0.02, -0.4);
            gl.glVertex2d(-0.02, -0.4);
            gl.glVertex2d(-0.02, -0.6);
            gl.glEnd();

            // Pomo
            gl.glBegin(GL2.GL_LINES);
            gl.glVertex2d(-0.02, -0.6);
            gl.glVertex2d(-0.025, -0.63);
            gl.glVertex2d(-0.025, -0.63);
            gl.glVertex2d(0.025, -0.63);
            gl.glVertex2d(0.025, -0.63);
            gl.glVertex2d(0.02, -0.6);
            gl.glEnd();        
            
            // Lamina
            gl.glBegin(GL2.GL_LINES);
            gl.glVertex2d(-0.02, -0.4);
            gl.glVertex2d(-0.092, -0.385);
            gl.glVertex2d(-0.092, -0.385);
            gl.glVertex2d(-0.065, 0.6);
            gl.glVertex2d(-0.065, 0.6);
            gl.glVertex2d(0.0, 0.75);
            gl.glVertex2d(0.0, 0.75);
            gl.glVertex2d(0.065, 0.6);
            gl.glVertex2d(0.065, 0.6);
            gl.glVertex2d(0.092, -0.385);
            gl.glVertex2d(0.092, -0.385);
            gl.glVertex2d(0.02, -0.4);     
            gl.glEnd();

            // Parte de dentro
            gl.glColor3f(0.65f, 0.65f, 0.65f);
            gl.glBegin(GL2.GL_LINES);
            gl.glVertex2d(-0.046, -0.3925);
            gl.glVertex2d(-0.0325, 0.6);
            gl.glVertex2d(-0.0325, 0.6);
            gl.glVertex2d(0.0, 0.675);
            gl.glVertex2d(0.0, 0.675);
            gl.glVertex2d(0.0325, 0.6);
            gl.glVertex2d(0.0325, 0.6);
            gl.glVertex2d(0.046, -0.3925);
            gl.glEnd();
    }


    @Override
    public void dispose(GLAutoDrawable arg0) {

    }

    @Override
    public void init(GLAutoDrawable arg0) {

    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {

    }

}