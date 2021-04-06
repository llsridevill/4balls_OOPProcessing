import processing.core.PApplet;

public class Ball {

    private PApplet sketch;

    private float x;
    private float y;

    public Ball(PApplet sketch, float x, float y){
        this.sketch = sketch;
        this.x = x;
        this.y = y;
    }


    public void drawCircle(int mouseX, int y, int diameter, int speed1) {
        sketch.ellipse(x, y, diameter, diameter);
        x += speed1;
    }

}