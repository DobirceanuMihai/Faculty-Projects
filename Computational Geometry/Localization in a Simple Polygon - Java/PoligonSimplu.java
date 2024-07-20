public class PoligonSimplu {

    public static double det (double x1, double y1, double x2, double y2, double x3, double y3){
        double matriceDet[][] = {   {x1, y1, 1},
                                    {x2, y2, 1},
                                    {x3, y3, 1}     };
        double determinant = MatrixOperations.matrixDeterminant (matriceDet);
        return determinant;
    }
    public static void main(String[] args){
        int c = 0;
        double xA = 0, yA = 0, xB = 0, yB = 0, xM = 4, yM = 2;
        double[] Ax = {0, 5, 8, 2, 2, -4, -5, -6, -9, -4, -2}, Ay = {0, 8, 3, -6, -3, -3, -1, -3, 7, 2, 5};
        boolean interior = false, exterior = false, frontiera = false;

        for (int i = 0; i < Ay.length-1; i++) {
            if((Ay[i] == Ay[i+1] && Ay[i+1] == yM) && ((xM - Ax[i])*(xM - Ax[i+1]) <= 0)){
                frontiera = true;
                break;
            }

            if(Ay[i] > Ay[i+1]){
                xA = Ax[i]; yA = Ay[i];
                xB = Ax[i+1]; yB = Ay[i+1];
            }

            if(Ay[i] < Ay[i+1]){
                xA = Ax[i+1]; yA = Ay[i+1];
                xB = Ax[i]; yB = Ay[i];
            }
            
            if(Ay[i] != Ay[i+1] && (yM > yB && yM < yA)){
                if(det(xA, yA, xM, yM, xB, yB) > 0){
                    c++;
                }else if(det(xA, yA, xM, yM, xB, yB) == 0){
                    frontiera = true;   break;
                }
            }

            if(Ay[i] != Ay[i+1] && yM == yA){
                if(xM < xA){
                    c++;
                }else if(xM == xA){
                    frontiera = true;   break;
                }
            }

            if(Ay[i] != Ay[i+1] && yM == yB && xM == xB){
                frontiera = true;   break;
            }

            
        }

        if(c%2 == 0){
            exterior = true;
        }else{
            interior = true;
        }

        System.out.println("M(" + xM + ", " + yM + ")");
        if(frontiera == true)   System.out.println("M se afla pe frontiera poligonului");
        else if(interior == true)    System.out.println("M se afla in interiorul poligonului");
        else if(exterior == true)    System.out.println("M se afla in exteriorul poligonului");
        
    }
}
