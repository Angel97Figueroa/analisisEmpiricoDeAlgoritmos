package practica.aed.analisisempiricodealgoritmos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalisisApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        long[][] sumatoriaIterativa=new long[7][3];
        int indice=0;
        for(int i=100; i<=100000000; i*=10){
            sumatoriaIterativa[indice]=AnalisisSumatoria.sumatoriaIterativa(i);
            indice++;
        }
        new Grafica(sumatoriaIterativa, "Método iterativo").show();
    }
    public static void main(String[] args){launch(args);}
}
