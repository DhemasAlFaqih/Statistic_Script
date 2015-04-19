/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsscript;

import java.util.Scanner;
import statisticsscript.Calclib.Statictics;

/**
 *
 * @author pc
 */
public class Function {
    public static void execute() throws Exception {
        System.out.print("function name :");
        String s = new Scanner(System.in).nextLine();
        String keyx;
        String keyy;
        String keyvar;
        double x[];
        double y[];
        double v;
        switch (s) {
            case "corel":
                System.out.print("arr1 :");
                keyx = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyx);
                System.out.print("arr1 :");
                keyy = new Scanner(System.in).nextLine();
                y = Variabel.getArray(keyy);
                System.out.println(Statictics.corel(x, y));
                break;
            case "count":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.count(x));
                break;
            case "covar":
                System.out.print("arr1 :");
                keyx = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyx);
                System.out.print("arr1 :");
                keyy = new Scanner(System.in).nextLine();
                y = Variabel.getArray(keyy);
                System.out.println(Statictics.covar(x, y));
                break;
            case "max":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.max(x));
                break;
            case "mean":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.mean(x));
                break;
            case "meangeo":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.meangeo(x));
                break;
            case "meanhar":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.meanhar(x));
                break;
            case "min":
                System.out.print("arr :");
                keyvar = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyvar);
                System.out.println(Statictics.min(x));
                break;
            case "range":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.range(x));
                break;
            case "regA":
                System.out.print("arr1 :");
                keyx = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyx);
                System.out.print("arr1 :");
                keyy = new Scanner(System.in).nextLine();
                y = Variabel.getArray(keyy);
                System.out.println(Statictics.rega(x, y));
                break;
            case "regB":
                System.out.print("arr1 :");
                keyx = new Scanner(System.in).nextLine();
                x = Variabel.getArray(keyx);
                System.out.print("arr1 :");
                keyy = new Scanner(System.in).nextLine();
                y = Variabel.getArray(keyy);
                System.out.println(Statictics.regb(x, y));
                break;
            case "sort":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                Statictics.sort(x);
                break;
            case "stdv":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.stdv(x));
                break;
            case "stdvp":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.stdvp(x));
                break;
            case "sum":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.sum(x));
                break;
            case "sumsqr":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.sumsqr(x));
                break;
            case "var":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.var(x));
                break;
            case "varp":
                System.out.print("arr :");
                keyvar=new Scanner(System.in).nextLine();
                x=Variabel.getArray(keyvar);
                System.out.println(Statictics.varp(x));
                break;
            default:
                System.out.println("Function not Found");
                break;
        }
    }
}
