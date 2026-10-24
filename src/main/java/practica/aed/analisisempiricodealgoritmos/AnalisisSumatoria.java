package practica.aed.analisisempiricodealgoritmos;

public class AnalisisSumatoria {
    public static long[] sumatoriaIterativa(long n){
        long startTime=System.nanoTime();
        long[] resultado=new long[3]; //Indice 0=valor de la sumatoria, indice 1=tiempo de ejecucion (nS), Indice 2=n
        resultado[0]=0;
        for(long i=1; i<=n; i++){
            resultado[0]+=i;
        }
        long endTime=System.nanoTime();
        resultado[1]=endTime-startTime;
        resultado[2]=n;
        return resultado;
    }
    public static long[] sumatoriaRecursiva(long n){
        long startTime=System.nanoTime();
        if(n<0) return new long[]{-1, System.nanoTime()-startTime};
        if(n==0) return new long[]{0, System.nanoTime()-startTime};
        if(n==1) return new long[]{1, System.nanoTime()-startTime};
        long[] resultado=new long[3]; //Indice 0=valor de la sumatoria, indice 1=tiempo de ejecucion (nS), Indice 3=n
        resultado[0]=1+sumatoriaRecursiva(n, 2);
        long endTime=System.nanoTime();
        resultado[1]=endTime-startTime;
        resultado[2]=n;
        return resultado;
    }

    private static long sumatoriaRecursiva(long n, long i){
        if(i==n) return i;
        return i+sumatoriaRecursiva(n, i+1);
    }

    public static long[] sumatoriaGauss(long n){
        long startTime=System.nanoTime();
        long[] resultado=new long[3]; //Indice 0=valor de la sumatoria, indice 1=tiempo de ejecucion (nS), Indice 3=n
        resultado[0]=n*(n+1)/2;
        long endTime=System.nanoTime();
        resultado[1]=endTime-startTime;
        resultado[2]=n;
        return resultado;
    }

}
