/*
* File: MainConsole.java
* Author: Replülő Géza
* Copyright: 2023, Repülő Géza
* Group: Szoft I-1 N
* Date: 2023-02-06
* Github: https://github.com/repulogeza/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class MainConsole {

    public MainConsole() {
        about();
        task();
        doit();
    }
    private void task() {
        System.out.println("Feladat 0251 megoldása");
        System.out.println("Paralelogramma területe");        
    }
    private void about() {
        System.out.println("Repülő Géza");
        System.out.println("Szoft I-1 N");
        System.out.println("2023-02-06");
    }
    private String input(String msg) {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }
    private void doit() {
        String asideStr = input("A oldal: ");
        String bsideStr = input("B oldal: ");
        String gammaStr = input("Gamma: ");

        double aside = Double.parseDouble(asideStr);
        double bside = Double.parseDouble(bsideStr);
        double gamma = Double.parseDouble(gammaStr);

        Paralelogramma para = new Paralelogramma();
        double area = para.calcArea(aside, bside, gamma);
        System.out.printf("%.2f\n", area);
    }
}
