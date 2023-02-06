/*
* File: Paralelogramma.java
* Author: Replülő Géza
* Copyright: 2023, Repülő Géza
* Group: Szoft I-1 N
* Date: 2023-02-06
* Github: https://github.com/repulogeza/
* Licenc: GNU GPL
*/

public class Paralelogramma {

    public Paralelogramma() {
    }
    
    public double calcArea(
        double aside, double bside, double gamma) 
        {
            double rad = gamma * Math.PI / 180;
            double area = aside * bside * Math.sin(rad);
        return area;
    }
}
