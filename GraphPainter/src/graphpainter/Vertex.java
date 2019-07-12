package graphpainter;

import java.awt.Color;

public class Vertex {
	
    private String key;
    private String edgeKey;
    private String adjacentVertexKey;   
    private Vertex adjacentVertex;
    private Vertex next;
    
    private boolean dragging;
    protected int x;
    protected int y;
    protected int z;
    Color color;

    public Vertex(String key) {
    	
        this.key = key;
        this.edgeKey = "";
        this.next = null;
        this.adjacentVertex = null;
        this.dragging = false;
        color = new Color(0, 0, 0);
    }

    public Vertex() {
        this.edgeKey = "";
    }

    public String getKey() {
        return key;
    }

    public Vertex getNext() {
        return this.next;
    }

    public Vertex getAdjacentVertex() {
        return this.adjacentVertex;
    }
    
    public String getEdgeKey() {
        return edgeKey;
    }    


    public String getAdjacentVertexKey() {
        return this.adjacentVertexKey;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Color getColor() {
        return color;
    }

    public boolean isDragging() {
        return dragging;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDragging(boolean dragging) {
        this.dragging = dragging;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    public void setNext(Vertex next) {
        this.next = next;
    }

    public void setAdjacentVertex(Vertex vertex) {
        this.adjacentVertex = vertex;
    }
    
    public void setEdgeKey(String edgeKey) {
        this.edgeKey = edgeKey;
    }


    public void setAdjacentVertexKey(String vertexKey) {
        this.adjacentVertexKey = vertexKey;
    }

}
