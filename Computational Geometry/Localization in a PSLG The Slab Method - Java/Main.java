import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        Locate.polygon.add(new dcel(1, 6, 7, 1, 4, 4, 9));
        Locate.polygon.add(new dcel(2, 3, 4, 2, 3, 8, 6));
        Locate.polygon.add(new dcel(3, 4, 5, 4, 1, 9, 6));
        Locate.polygon.add(new dcel(4, 3, 6, 1, 2, 7, 8));
        Locate.polygon.add(new dcel(5, 1, 2, 3, 1, 6, 7));
        Locate.polygon.add(new dcel(6, 2, 4, 3, 1, 2, 5));
        Locate.polygon.add(new dcel(7, 1, 3, 1, 3, 5, 2));
        Locate.polygon.add(new dcel(8, 4, 6, 2, 4, 4, 1));
        Locate.polygon.add(new dcel(9, 5, 7, 4, 1, 1, 6));
    

        Locate.vertices.add(new Vertex(-3, -2));
        Locate.vertices.add(new Vertex(3, -1));
        Locate.vertices.add(new Vertex(-4, 0));
        Locate.vertices.add(new Vertex(1, 1));
        Locate.vertices.add(new Vertex(4, 2));
        Locate.vertices.add(new Vertex(-2, 3));
        Locate.vertices.add(new Vertex(2, 5));


        Face f = new Face();
        f.vertices.add(Locate.vertices.get(2));
        f.vertices.add(Locate.vertices.get(3));
        f.vertices.add(Locate.vertices.get(5));
        Locate.faces.add(f);

        f = new Face();
        f.vertices.add(Locate.vertices.get(0));
        f.vertices.add(Locate.vertices.get(1));
        f.vertices.add(Locate.vertices.get(3));
        f.vertices.add(Locate.vertices.get(2));
        Locate.faces.add(f);

        f = new Face();
        f.vertices.add(Locate.vertices.get(3));
        f.vertices.add(Locate.vertices.get(4));
        f.vertices.add(Locate.vertices.get(6));
        f.vertices.add(Locate.vertices.get(5));
        Locate.faces.add(f);


        Slab s = new Slab();
        s.edges.add(5);
        s.edges.add(7);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(6);
        s.edges.add(7);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(4);
        s.edges.add(2);
        s.edges.add(6);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(4);
        s.edges.add(8);
        s.edges.add(3);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(9);
        s.edges.add(8);
        s.edges.add(4);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(1);
        s.edges.add(9);
        Locate.slabs.add(s);

        s = new Slab();
        s.edges.add(1);
        s.edges.add(9);
        Locate.slabs.add(s);

        Locate.locate(new Vertex(Integer.parseInt(JOptionPane.showInputDialog(null, "x")), Integer.parseInt(JOptionPane.showInputDialog(null, "y"))));
    }
}