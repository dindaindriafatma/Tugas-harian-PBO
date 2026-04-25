/*
Pembuat : Dinda Indria Fatma
Nim     : 2501081010
Tanggal : 23-April-2026
Program : Komposisi Point dan Line
 */
package pratikum230426;

/**
 *
 * @author USER
 */
public class point {
    private int x,y;
    
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x =x;
    }
    public void setY(int y){
        this.y = y;
    }
    public String toString(){
        return"("+this.x +","+this.y+")";
    }
    public int[]getXY(){
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance (int x, int y){
        int xDiff = this.x - x ;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff* yDiff);
    }
    public double distance (point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance (){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
            
}