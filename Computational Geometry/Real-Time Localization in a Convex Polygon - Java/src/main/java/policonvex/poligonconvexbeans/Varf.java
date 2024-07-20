package policonvex.poligonconvexbeans;


public class Varf {
    int x, y;
    
    public Varf(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Varf(){}
    
    public int Cadran(){ 
        if(x > 0 && y >= 0){
            return 1;
        }
        if(x <= 0 && y > 0){
            return 2;
        }
        if(x < 0 && y <= 0){
            return 3;
        }
        if(x >= 0 && y < 0){
            return 4;
        }
        
        return 0;
    }
}
