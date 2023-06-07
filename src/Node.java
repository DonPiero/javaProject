import java.awt.*;
import java.util.List;

public class Node {
    private Point coordinates = new Point();
    private int id;
    private List<Node> path;

    public Node(){}

    public Node(int id){
        this.id = id;
    }

    public Node(Point p){
        this.coordinates = p;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCoordinates(int x, int y){
        coordinates.setLocation(x, y);
    }

    public Point getCoordinates(){
        return coordinates;
    }

    public void setPath(List<Node> path) {
        this.path = path;
    }

    public List<Node> getPath() {
        return path;
    }

    public int getX(){
        return (int) coordinates.getX();
    }

    public int getY(){
        return (int) coordinates.getY();
    }

    @Override
    public String toString() {
        return "Node " + id;
    }
}