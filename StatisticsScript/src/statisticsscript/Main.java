/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsscript;

import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Scanner;
import statisticsscript.Calclib.Statictics;

/**
 *
 * @author pc
 */
public class Main {

    static boolean exit;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exit = true;
        while (exit) {
            try {
                System.out.print(">");
                String input=new Scanner(System.in).nextLine();
                Reader.read(input);
            } catch (Exception e) {
                System.out.println("Error Command");
            }
        }
    }

}
