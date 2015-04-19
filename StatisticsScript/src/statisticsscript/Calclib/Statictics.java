/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statisticsscript.Calclib;

/**
 *
 * @author pc
 */
public class Statictics {
    // Quartil
    
    //Mean
    public static double mean(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y / x.length;
    }

    public static double mean(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y / x.length;
    }

    public static double mean(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y / x.length;
    }

    public static double mean(long[] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y / x.length;
    }
    //Mean Geommetri
    public static double meangeo(double [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 1;
        for (double i : x) {
            y *= i;
        }
        return Math.pow(y, (1/x.length));
    }
    public static double meangeo(float [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 1;
        for (double i : x) {
            y *= i;
        }
        return Math.pow(y, (1/x.length));
    }
    public static double meangeo(int [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 1;
        for (double i : x) {
            y *= i;
        }
        return Math.pow(y, (1/x.length));
    }
    public static double meangeo(long [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 1;
        for (double i : x) {
            y *= i;
        }
        return Math.pow(y, (1/x.length));
    }
    //Mean Harmonik
    public static double meanhar(double [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += (double)1/i;
        }
        return x.length/y;
    }
    public static double meanhar(float [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += (double)1/i;
        }
        return x.length/y;
    }
    public static double meanhar(int [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += (double)1/i;
        }
        return x.length/y;
    }
    public static double meanhar(long [] x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += (double)1/i;
        }
        return x.length/y;
    }
    //Variance Sample : Default
    public static double var(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double var(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double var(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double var(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    //Variance Populasi
    public static double varp(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double varp(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double varp(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length - 1);
    }

    public static double varp(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double m = mean(x);
        double y = 0;
        for (double i : x) {
            double s = i - m;
            y += s * s;
        }
        return y / (x.length);
    }

    //Standar Deviasi Sample
    public static double stdv(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdv(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdv(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdv(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    //Standar Deviasi Populasi
    public static double stdvp(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdvp(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdvp(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    public static double stdvp(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return Math.sqrt(var(x));
    }

    //Sum
    public static double sum(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y;
    }

    public static double sum(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y;
    }

    public static double sum(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y;
    }

    public static double sum(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i;
        }
        return y;
    }

    //Sum Square
    public static double sumsqr(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i * i;
        }
        return y;
    }

    public static double sumsqr(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i * i;
        }
        return y;
    }

    public static double sumsqr(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i * i;
        }
        return y;
    }

    public static double sumsqr(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = 0;
        for (double i : x) {
            y += i * i;
        }
        return y;
    }

    //n
    public static int count(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return x.length;
    }

    public static int count(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return x.length;
    }

    public static int count(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return x.length;
    }

    public static int count(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        return x.length;
    }

    //max
    public static double max(double[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        double y = x[0];
        for (double i : x) {
            if (y < i) {
                y = i;
            }
        }
        return y;
    }

    public static float max(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        float y = x[0];
        for (float i : x) {
            if (y < i) {
                y = i;
            }
        }
        return y;
    }

    public static int max(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        int y = x[0];
        for (int i : x) {
            if (y < i) {
                y = i;
            }
        }
        return y;
    }

    public static long max(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        long y = x[0];
        for (long i : x) {
            if (y < i) {
                y = i;
            }
        }
        return y;
    }

    //min
    public static double min(double[] x) throws Exception {
        double y = x[0];
        for (double i : x) {
            if (y > i) {
                y = i;
            }
        }
        return y;
    }

    public static float min(float[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        float y = x[0];
        for (float i : x) {
            if (y > i) {
                y = i;
            }
        }
        return y;
    }

    public static int min(int[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        int y = x[0];
        for (int i : x) {
            if (y > i) {
                y = i;
            }
        }
        return y;
    }
    public static long min(long[] x) throws Exception {
        if(x==null){
            throw new Exception("null parameter");
        }
        long y = x[0];
        for (long i : x) {
            if (y > i) {
                y = i;
            }
        }
        return y;
    }
    //Range
    public static double range(double []x) throws Exception{
        return (max(x)-min(x));
    }
    public static float range(float []x) throws Exception{
        return (max(x)-min(x));
    }
    public static int range(int []x) throws Exception{
        return (max(x)-min(x));
    }
    public static long range(long []x) throws Exception{
        return (max(x)-min(x));
    }
    

    //Sort
    public static void sort(int []x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        quickSort(x, 0, x.length-1);
    }
    private static void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void sort(long []x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        quickSort(x, 0, x.length-1);
    }
    private static void quickSort(long[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //pick the pivot
        int middle = low + (high - low) / 2;
        long pivot = arr[middle];

        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void sort(float []x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        quickSort(x, 0, x.length-1);
    }
    private static void quickSort(float[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //pick the pivot
        int middle = low + (high - low) / 2;
        float pivot = arr[middle];

        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void sort(double []x) throws Exception{
        if(x==null){
            throw new Exception("null parameter");
        }
        quickSort(x, 0, x.length-1);
    }
    private static void quickSort(double[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //pick the pivot
        int middle = low + (high - low) / 2;
        double pivot = arr[middle];

        //make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    //Korelasi
    public static double covar(double []x,double []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        double a=mean(x);
        double b=mean(y);
        double res=0;
        for(int i=0;i<x.length;i++){
            res+=(x[i]-a)*(y[i]-b);
        }
        return res;
    }
    public static double covar(float []x,float []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        double a=mean(x);
        double b=mean(y);
        double res=0;
        for(int i=0;i<x.length;i++){
            res+=(x[i]-a)*(y[i]-b);
        }
        return res;
    }
    public static double covar(int []x,int []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        double a=mean(x);
        double b=mean(y);
        double res=0;
        for(int i=0;i<x.length;i++){
            res+=(x[i]-a)*(y[i]-b);
        }
        return res;
    }
    public static double covar(long []x,long []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        double a=mean(x);
        double b=mean(y);
        double res=0;
        for(int i=0;i<x.length;i++){
            res+=(x[i]-a)*(y[i]-b);
        }
        return res/(x.length-1);
    }
    //Corellasi
    public static double corel(long []x,long []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/(stdv(x)*stdv(y));
    }
    public static double corel(int []x,int []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/(stdv(x)*stdv(y));
    }public static double corel(float []x,float []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/(stdv(x)*stdv(y));
    }
    public static double corel(double []x,double []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/(stdv(x)*stdv(y));
    }
    //Regresi b
    public static double regb(double []x,double []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/var(x);
    }
    public static double regb(float []x,float []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/var(x);
    }
    public static double regb(int []x,int []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/var(x);
    }
    public static double regb(long []x,long []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return covar(x, y)/var(x);
    }
    public static double rega(long []x,long []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return mean(y)-regb(x, y)*mean(x);
    }
    public static double rega(int []x,int []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return mean(y)-regb(x, y)*mean(x);
    }
    public static double rega(float []x,float []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return mean(y)-regb(x, y)*mean(x);
    }
    public static double rega(double []x,double []y) throws Exception{
        if(x==null||y==null){
            throw new Exception("null parameter");
        }else if(x.length!=y.length){
            throw new Exception("incompatible array");
        }
        return mean(y)-regb(x, y)*mean(x);
    }
}
