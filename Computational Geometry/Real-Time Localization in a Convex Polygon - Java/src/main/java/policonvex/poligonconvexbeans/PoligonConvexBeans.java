package policonvex.poligonconvexbeans;

import javax.swing.JOptionPane;


public class PoligonConvexBeans {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul de varfuri: "));
        
        Varf[] varfuri = new Varf[n];
        Varf Mi = new Varf();
        Varf Mf = new Varf();
        Varf C = new Varf(0, 0);
        
        JOptionPane.showMessageDialog(null, "Introduceti coordonatele varfurilor");
        for(int i = 0; i < n; i++){
            varfuri[i] = new Varf();
            varfuri[i].x = Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonata x al varfului A" + (i+1)));
            varfuri[i].y = Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonata y al varfului A" + (i+1)));
        }
        
        Mi.x = Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonata x al punctului M"));
        Mi.y = Integer.parseInt(JOptionPane.showInputDialog("Introduceti coordonata y al punctului M"));
        
        Varf S = new Varf(0, 0);
        
        for(int i = 0; i < 3; i++){
            S.x = S.x + varfuri[i].x;
            S.y = S.y + varfuri[i].y;
        }
        
        S.x = S.x / 3;
        S.y = S.y / 3;
        Mf.x = Mi.x - S.x;
        Mf.y = Mi.y - S.y;
        
        for(int i = 0; i < n; i++){
            varfuri[i].x = varfuri[i].x - S.x;
            varfuri[i].y = varfuri[i].y - S.y;
        }
        
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(Operatii.Ord(varfuri[i], varfuri[j], C) > 0){
                    int auxx = varfuri[i].x;
                    varfuri[i].x = varfuri[j].x;
                    varfuri[j].x = auxx;
                    int auxy = varfuri[i].y;
                    varfuri[i].y = varfuri[j].y;
                    varfuri[j].y = auxy;
                }
            }
        }
        
        int localizare = Operatii.cautareBinara(varfuri, 0, n, Mf, S);
        
        if(Operatii.Det(Mf, varfuri[localizare + 1], varfuri[localizare]) > 0){
            JOptionPane.showMessageDialog(null, "M se afla in exteriorul poligonului!");
        }
        if(Operatii.Det(Mf, varfuri[localizare + 1], varfuri[localizare]) == 0){
            JOptionPane.showMessageDialog(null, "M se afla pe frontiera poligonului!");
        }
        if(Operatii.Det(Mf, varfuri[localizare + 1], varfuri[localizare]) < 0){
            JOptionPane.showMessageDialog(null, "M se afla in interioriul poligonului!");
        }
    }
}
