import java.util.Scanner;

public class Circle{
    private int radius;
    
    public Circle(int theRadius){
        radius = theRadius;
    }
    
    public Circle(){}
    
    public int getRadius(){
        return radius;
    }    
    
    public void compileCircle(){
        System.out.println("What do you want your radius to be?");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        Circle circle = new Circle(r);
        System.out.println("You have created a circle with radius " + circle.getRadius());
    }
}