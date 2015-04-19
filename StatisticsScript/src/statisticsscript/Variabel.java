/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsscript;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author pc
 */
public class Variabel {
    private static Hashtable var=new Hashtable();
    private static Hashtable array=new Hashtable();
    
    
    public static void addVar(double x,String s){
        var.put(s, x);
    }
    public static void addArray(double []x,String s){
        array.put(s, x);
    }
    public static double getVar(String s){
        return (double)var.get(s);
    }
    public static double[] getArray(String s){
        return (double[]) array.get(s);
    }
    
}
