package practica.aed.analisisempiricodealgoritmos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalisisApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        long[][] sumatoria=new long[7][3];
        int indice=0;
        for(int i=100; i<=100000000; i*=10){
            sumatoria[indice]=AnalisisSumatoria.sumatoriaIterativa(i);
            indice++;
        }
        new Grafica(sumatoria, "Método iterativo").show();

        sumatoria=new long[7][3];
        indice=0;
        for(int i=100; i<=100000000; i*=10){
            sumatoria[indice]=AnalisisSumatoria.sumatoriaGauss(i);
            indice++;
        }
        new Grafica(sumatoria, "Método de Gauss").show();

        sumatoria=new long[7][3];
        indice=0;
        for(int i=100; i<=10000000; i*=10){
            sumatoria[indice]=AnalisisSumatoria.sumatoriaRecursiva(i);
            indice++;
        }
        new Grafica(sumatoria, "Método recursivo").show();
    }
    public static void main(String[] args){launch(args);}
}
