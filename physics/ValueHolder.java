package physics;
import java.util.ArrayList;
import java.util.List;
public class ValueHolder {
    List<Double> xs = new ArrayList<Double>();
    List<Double> y = new ArrayList<Double>();
    public ValueHolder(List<Double> x, List<Double> y){
        this.xs = x;
        this.y = y;
    }
}
