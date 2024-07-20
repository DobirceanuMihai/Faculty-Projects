package trianglelocalization.trianlgelocalization;

import javax.swing.*;

public class LocalizareTriunghiNetBeans {
    public double[] A = new double[2], B = new double[2], C = new double[2], M = new double[2];
    
    public  double detTriunghi (double A[], double B[], double C[]){
        double matriceDet[][] = {   {A[0], A[1], 1},
                                    {B[0], B[1], 1},
                                    {C[0], C[1], 1}     };
        double determinant = MatrixOperations.matrixDeterminant (matriceDet);
        return determinant;
    }

    public void CazDirectTrigonometric(double A[], double B[], double C[], double M[]){
        double det1 = detTriunghi(M, A, B), det2 = detTriunghi(M, B, C), det3 = detTriunghi(M, C, A);
        JOptionPane.showMessageDialog(null, "MAB " + det1 + "   " + "MBC " + det2 + "    " + "MCA " + det3);

        if(det1 > 0 && det2 > 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in INTERIORUL triunghiului, zona (1)");
        if(det1 < 0 && det1 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (2)");
        if(det1 < 0 && det2 < 0 && det3 >0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (3)");
        if(det1 > 0 && det2 < 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (4)");
        if(det1 > 0 && det2 < 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (5)");
        if(det1 > 0 && det2 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (6)");
        if(det1 < 0 && det2 > 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (7)");

        if(det1 > 0 && det2 == 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 5)");
        if(det1 > 0 && det2 > 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 6)");
        if(det1 == 0 && det2 > 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 7)");
        if(det1 == 0 && det2 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(2, 6)");
        if(det1 < 0 && det2 > 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(2, 7)");
        if(det1 < 0 && det2 == 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(3, 7)");
        if(det1 == 0 && det2 < 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(3, 5)");
        if(det1 > 0 && det2 < 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(4, 5)");
        if(det1 > 0 && det2 == 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(4, 6)");

        if(det1 == 0 && det2 > 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe pe punctul A");
        if(det1 == 0 && det2 == 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe punctul B");
        if(det1 > 0 && det2 == 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe punctul C");
    }

    public void CazInversTrigonometric(double A[], double B[], double C[], double M[]){
        double det1 = detTriunghi(M, A, C), det2 = detTriunghi(M, C, B), det3 = detTriunghi(M, B, A);
        JOptionPane.showMessageDialog(null, "MAC " + det1 + "   " + "MCB " + det2 + "    " + "MBA " + det3);

        if(det1 < 0 && det2 < 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in INTERIORUL triunghiului, zona (1)");
        if(det1 > 0 && det1 < 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (2)");
        if(det1 < 0 && det2 > 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (3)");
        if(det1 > 0 && det2 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (4)");
        if(det1 < 0 && det2 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (5)");
        if(det1 > 0 && det2 < 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (6)");
        if(det1 < 0 && det2 < 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla in EXTERIORIUL triunghiului, zona (7)");

        if(det1 < 0 && det2 == 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 5)");
        if(det1 == 0 && det2 < 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 6)");
        if(det1 < 0 && det2 < 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(1, 7)");
        if(det1 > 0 && det2 < 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(2, 6)");
        if(det1 == 0 && det2 < 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(2, 7)");
        if(det1 < 0 && det2 == 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(3, 7)");
        if(det1 < 0 && det2 == 0 && det3 > 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(3, 5)");
        if(det1 == 0 && det2 > 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(4, 5)");
        if(det1 > 0 && det2 == 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe FRONTIERA(4, 6)");

        if(det1 == 0 && det2 < 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe pe punctul A");
        if(det1 == 0 && det2 == 0 && det3 < 0)
            JOptionPane.showMessageDialog(null, "M se afla pe punctul B");
        if(det1 < 0 && det2 == 0 && det3 == 0)
            JOptionPane.showMessageDialog(null, "M se afla pe punctul C");
    }
    
    public void Verifica(){
        if(detTriunghi(A, B, C) < 0){
            JOptionPane.showMessageDialog(null, "Sens invers trigonometric (-)");
            CazInversTrigonometric(A, B, C, M);
        }else if(detTriunghi(A, B, C) > 0){
            JOptionPane.showMessageDialog(null, "Sens direct trigonometric (+)");
            CazDirectTrigonometric(A, B, C, M);
        }else if(detTriunghi(A, B, C) == 0){
            JOptionPane.showMessageDialog(null, "A, B, C coliniare");
        }
    }
}

