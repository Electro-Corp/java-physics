package assets;

import java.util.ArrayList;
import java.util.List;
public class ValueHolder {
    public List<Double> xs = new ArrayList<Double>();
    public List<Double> y = new ArrayList<Double>();
    public ValueHolder(List<Double> x, List<Double> y){
        this.xs = x;
        this.y = y;
    }
}
