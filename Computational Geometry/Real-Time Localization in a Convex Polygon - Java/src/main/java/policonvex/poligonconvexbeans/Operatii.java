package policonvex.poligonconvexbeans;

public class Operatii {
    
    public static int Det(Varf a, Varf b, Varf c){
        return ((a.x * b.y) + (b.x * c.y) + (c.x * a.y)) - ((b.y * c.x) + (c.y * a.x) + (a.y * b.x));
    }
    
    public static int Ord(Varf a, Varf b, Varf s){
        
        if(a.x == b.x && a.y == b.y){
            return 0;
        }
        if(a.Cadran() == b.Cadran() && Det(a, s, b) > 0){
            return 1;
        }
        if(a.Cadran() > b.Cadran()){
            return 1;
        }
        
        return -1;
    }
    
    public static int cautareBinara(Varf[] arr, int st, int dr, Varf p, Varf s){
        if(dr >= st){
            int mij = st + (dr - st) / 2;
            if(Ord(arr[mij], p, s) <= 0 && Ord(p, arr[mij + 1], s) < 0){
                return mij;
            }
            if(Ord(p, arr[mij + 1], s) >= 0){
                return cautareBinara(arr, mij + 1, dr, p, s);
            }
            if(Ord(p, arr[mij], s) < 0){
                return cautareBinara(arr, st, mij - 1, p, s);
            }
        }
        
        return 0;
    }
}
