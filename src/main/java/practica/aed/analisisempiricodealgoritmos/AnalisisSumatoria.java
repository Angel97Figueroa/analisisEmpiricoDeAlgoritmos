package practica.aed.analisisempiricodealgoritmos;

public class AnalisisSumatoria {
    public static int sumatoriaIterativa(int n){
        int total=0;
        for(int i=1; i<=n; i++){
            total+=i;
        }
        return total;
    }
    public static int sumatoriaRecursiva(int n){
        if(n<0) return -1;
        if(n==0) return 0;
        if(n==1) return 1;
        return 1+sumatoriaRecursiva(n, 2);
    }

    private static int sumatoriaRecursiva(int n, int i){
        if(i==n) return i;
        return i+sumatoriaRecursiva(n, i+1);
    }

    public static int sumatoriaGauss(int n){return n*(n+1)/2;}

}
