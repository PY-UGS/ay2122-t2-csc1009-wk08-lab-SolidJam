import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleException {
    private double radius;

    public CircleException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        //RETURNS RADIUS
        return radius;
    }

    public void setRadius(double radius){
        //SETS RADIUS
        this.radius = radius;
    }

    public double getArea(){
        //RETURNS NEW AREA
        //double area = Math.PI * Math.pow(radius, 2);
        //return area;
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getDiameter(){
        //RETURNS DIAMETER OF CIRCLE
        //double diameter = 2 * radius;
        //return diameter;
        return (2 * radius);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            //USER INPUT
            System.out.print("Enter a radius for circle: ");
            double input = sc.nextDouble();

            //IF NUMBER NEGATIVE, THROW EXCEPTION
            if (input < 0)
                throw new IllegalArgumentException("Input must be a positive number");

            //IF VALID
            CircleException cwe = new CircleException(input);
            System.out.println("The radius is " + cwe.getRadius());
            System.out.println("The diameter is " + cwe.getDiameter());

            //IF AREA IS BIGGER THAN 1000
            if (cwe.getArea() > 1000)
                throw new Exception("Area is bigger than 1000");
            else
                System.out.println("The area is " + cwe.getArea());

        } catch (InputMismatchException e) {
            //IF INPUT IS NOT A NUMBER, TYPE MISMATCH
            System.out.println("Input must be a number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}