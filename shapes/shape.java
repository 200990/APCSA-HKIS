import java.util.Scanner;

public class shape{
    
    public shape(){}
    public void compileShape(){
        System.out.println("Would you like your shape to have more than one side. \nY or N");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equals("n")||response.equals("N")){
            Circle circle = new Circle();
            circle.compileCircle();
        }
        else if(response.equals("y")||response.equals("Y")){
            Polygon polygon = new Polygon();
            polygon.compilePolygon();
        }
    }
}