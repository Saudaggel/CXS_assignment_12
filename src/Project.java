import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Philipp on 01.05.2016.
 */
public class Project {

    public Node source;
    public List<Node> nodes = new ArrayList<Node>();

    public static Project readProject(File f){
        return new Project(); //TODO
    }

    public void setMaxDur(int dur){
        // TODO 2
    }

    /**
     * LCA calculates the longest paths between a single node @source
     * and all other nodes @nodes.
     */
    public void labelCorrecting(){
        // init
        source.earliestStart = 1000;
        source.latestStart = 0;
        for (Node node : nodes){
            node.earliestStart = 1000;
            node.latestStart = 0;
        }

        // main
        helper(source, nodes);

        // output
        System.out.println(source);
    }

    private int helper(Node current, List<Node> nodes) {
        if(current.successors.isEmpty()){
            return 0;
        } else {
            int eS = current.earliestStart + current.arcweights.get(0) + helper(current.successors.get(0), current.successors.get(0).successors);
            if(eS > current.earliestStart){
                current.earliestStart = eS;
            }
            return eS;
        }
    }
}
