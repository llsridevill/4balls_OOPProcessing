import java.util.ArrayList;
import processing.core.PApplet;

public class MySketch extends PApplet{

    private ArrayList<Ball> balls = new ArrayList<>();
    int x=1;
    public static final int HEIGHT = 480;
    public void settings(){
        size(500, 500);

        balls.add(new Ball(this, x, HEIGHT / 5));
        balls.add(new Ball(this, x, 2*HEIGHT/5));
        balls.add(new Ball(this, x, 3*HEIGHT/5));
        balls.add(new Ball(this, x, 4*HEIGHT/5));
    }

    public void draw(){

            balls.get(0).drawCircle(x,HEIGHT/5,10,1);
            balls.get(1).drawCircle(x, 2*HEIGHT/5, 10, 2 );
            balls.get(2).drawCircle(x, 3*HEIGHT/5, 10, 3);
            balls.get(3).drawCircle(x, 4*HEIGHT/5, 10, 4 );

    }


    public static void main(String[] args){
        String[] processingArgs = {"MySketch"};
        MySketch mySketch = new MySketch();
        PApplet.runSketch(processingArgs, mySketch);
    }
}