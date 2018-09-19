import java.util.Scanner;

public class Polygon
{
    private int sideLength;
    
    public Polygon(int theSideLength){
        sideLength = theSideLength;
    }
    
    public Polygon(){}
    
    public int getLength(){
        return sideLength;
    }    
    
    public void compilePolygon(){
        System.out.println("How many sides do you want to have?");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();
        System.out.println("What do you want your side length to be");
        Polygon poly = new Polygon(scanner.nextInt());
        if(sides<=4){
        System.out.println("You have created a quadtri with side length " + poly.getLength());
       }
        else{
        System.out.println("You have created an other with side length " + poly.getLength());    
       }
    }
}