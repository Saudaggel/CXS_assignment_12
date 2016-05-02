import java.util.ArrayList;
import java.util.List;

/**
 * Created by Philipp on 01.05.2016.
 */
public class Node {

    public List<Node> successors = new ArrayList<Node>();
    public List<Integer> arcweights = new ArrayList<Integer>();
    public int earliestStart;
    public int latestStart;
    // TODO remove again
    public String name;

    public static void addArc(Node i, Node j, int weight){
        i.successors.add(j);
        i.arcweights.add(weight);
    }

    @Override
    public String toString(){
        String succs = successors == null ? "\n - " : "\n - " + successors.toString();
        return "Node (" + name + "): earliestStart: " + earliestStart
                + ", latestStart: " + latestStart
                + ", ancestors: " + succs;
    }

}
