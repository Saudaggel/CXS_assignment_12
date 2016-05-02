import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;

/**
 * Created by Philipp on 01.05.2016.
 */
public class Test {

    static Node a = new Node();
    static Node b = new Node();
    static Node c = new Node();
    static Node x = new Node();
    static Node end = new Node();

    public static void main(String[] args){
        // init
        Project project = new Project();
        a.name = "a";
        b.name = "b";
        c.name = "c";
        x.name = "x";
        end.name = "end";
        // add nodes
        project.source = a;
        project.nodes.add(b);
        project.nodes.add(c);
        project.nodes.add(x);
        // add arcs
        Node.addArc(a, b, 3);
        Node.addArc(b, c, 5);
        Node.addArc(a, x, 1);
        Node.addArc(x, c, 1);
        Node.addArc(c, end, 10);
        // LCA
        project.labelCorrecting();
    }

}
