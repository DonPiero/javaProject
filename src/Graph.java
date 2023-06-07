import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int count = 1;
    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private Node source;
    private Node destination;

    private boolean solved = false;

    public List<Node> getNodes(){
        return nodes;
    }

    public void setNodes(List<Node> nodes){
        this.nodes = nodes;
    }

    public void addNode(Point coordinates){
        Node node = new Node(coordinates);
        addNode(node);
    }

    public void addNode(Node node){
        node.setId(count++);
        nodes.add(node);
        if(node.getId()==1)
            source = node;
    }

    public void deleteNode(Node node){
        List<Edge> delete = new ArrayList<>();
        for (Edge edge : edges){
            if(edge.hasNode(node)){
                delete.add(edge);
            }
        }
        for (Edge edge : delete){
            edges.remove(edge);
        }
        nodes.remove(node);
    }

    public List<Edge> getEdges(){
        return edges;
    }

    public void setEdges(List<Edge> edges){
        this.edges = edges;
    }

    public void addEdge(Edge new_edge){
        boolean added = false;
        for(Edge edge : edges){
            if(edge.equals(new_edge)){
                added = true;
                break;
            }
        }
        if(!added)
            edges.add(new_edge);
    }

    public Node getSource(){
        return source;
    }

    public void setSource(Node node){
        if(nodes.contains(node))
            source = node;
    }

    public boolean isSource(Node node){
        return node == source;
    }

    public Node getDestination(){
        return destination;
    }

    public void setDestination(Node node){
        if(nodes.contains(node))
            destination = node;
    }

    public boolean isDestination(Node node){
        return node == destination;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public boolean isSolved() {
        return solved;
    }

    public boolean isNodeReachable(Node node){
        for(Edge edge : edges)
            if(node == edge.getNodeOne() || node == edge.getNodeTwo())
                return true;

        return false;
    }

    public void clear(){
        count = 1;
        nodes.clear();
        edges.clear();
        solved = false;

        source = null;
        destination = null;
    }

}