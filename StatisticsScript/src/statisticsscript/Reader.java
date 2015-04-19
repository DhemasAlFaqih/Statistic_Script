/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsscript;

import java.util.LinkedList;
import java.util.Scanner;
import statisticsscript.Calclib.Statictics;

/**
 *
 * @author pc
 */
public class Reader {

    public static void read(String in) throws Exception {
        if (in.equals("mkvar")) {
            mkvar();
        } else if (in.equals("mkarray")) {
            mkarray();
        } else if (in.equals("function")) {
            Function.execute();
        }else if(in.equals("exit")){
            Main.exit=false;
        }else {
            System.out.println("Error Command");
        }
    }

    private static void mkvar() throws Exception {
        System.out.print("varname :");
        String s = new Scanner(System.in).nextLine();
        System.out.print("value :");
        double y = new Scanner(System.in).nextDouble();
        Variabel.addVar(y, s);
        System.out.println("Done");
    }

    private static void mkarray() throws Exception {
        System.out.print("arrayname :");
        String s = new Scanner(System.in).nextLine();
        System.out.print("length :");
        int n = new Scanner(System.in).nextInt();
        double data[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nilai " + (i + 1)+" :");
            data[i] = new Scanner(System.in).nextDouble();
        }
        Variabel.addArray(data, s);
        System.out.println("Done");
    }

    
}
