package physics;

import java.util.ArrayList;
import java.util.List;
import assets.ValueHolder;

public class Physics 
{
    /*
     * @param velocity
     *  velocut (relaa0)
     */
    public double velocityWithTimeAndInit(double velocity, double time, double acc){
        return velocity + acc * time;
    }
    public double displaceWithAccAndTime(double x, double velocity, double time, double acc){
        return x + (velocity * time) + ((0.5) * acc * Math.pow(time, 2));
    }
    /**
     * @param initV
     * @param initAngle
     * @param gravity
     * @return
     */
    public ValueHolder allXY(double initV, double height, double gravity, double acc){
        List<Double> xs = new ArrayList<Double>();
        List<Double> y = new ArrayList<Double>();
        double x = 0;
        double prevx, velocity;
        for (double i = 0; i < 10.0; i++){
            velocity = velocityWithTimeAndInit(initV, i, acc);
            x = displaceWithAccAndTime(prevx, velocity, i, acc);
            prevx = x;
            xs.add(x);
        }
        prevx = height;
        for (double i = 0; i < 10.0; i++){
            velocity = velocityWithTimeAndInit(0, i, 9.8);
            x = displaceWithAccAndTime(prevx, velocity, i, 9.8);
            prevx = x;
            y.add(x);
        }
        return new ValueHolder(xs, y);
    }
}