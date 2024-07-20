import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.*;

public class Locate {
    static ArrayList<dcel> polygon = new ArrayList<>();
    static ArrayList<Vertex> vertices = new ArrayList<>();
    static ArrayList<Slab> slabs = new ArrayList<>();
    static ArrayList<Face> faces = new ArrayList<>();

    public static void locate(Vertex m){
        int S = 0, F = 0;

        for(int i = 0; i < vertices.size()-1; i++){
            if(m.y >= vertices.get(i).y &&  m.y <= vertices.get(i+1).y){
                S = i+1;
                break;
            }
        }

        for(int i = 0; i < faces.size(); i++){
            Polygon p = new Polygon();
            for(int j = 0; j < faces.get(i).vertices.size(); j++){
                p.addPoint((int)faces.get(i).vertices.get(j).x, (int)faces.get(i).vertices.get(j).y);
            }
            if(p.contains(new Point((int) m.x, (int)m.y))){
                F = i + 2;
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "M: " + m.x + "," + m.y + " Slab: " + S + " Face: " + F);
    }
}
