package physics;

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
    public double allXY(double initV, double initAngle, double gravity){
        
        for (double i = 0; i < 10.0; i++){

        }
    }
}
