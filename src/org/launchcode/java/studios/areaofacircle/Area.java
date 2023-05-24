package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        boolean areaInvalid = area == 0.00;

        if(areaInvalid){
            System.out.println("You cannot enter this radius.");
            while(areaInvalid){
                Area.main(new String[0]);
                areaInvalid = false;
            }
        } else {
        System.out.println("The area of this circle is: " + area); }
        input.close();
    }
}
