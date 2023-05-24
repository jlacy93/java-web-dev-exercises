package org.launchcode.java.studios.areaofacircle;

public class Circle {
    public static Double getArea(Double radius){
        if(radius.isNaN()){
            return 0.00;
        } else if(radius < 0) {
            return 0.00;
        } else {
        return 3.14 * radius * radius;}
    }
}
