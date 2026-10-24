package practica.aed.analisisempiricodealgoritmos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalisisApplication extends Application{
    @Override
    public void start(Stage stage) throws IOException{
        long[][] sumatoriaIterativa=new long[99901][3];
        for(int i=100; i<=100000; i++) sumatoriaIterativa[i-100]=AnalisisSumatoria.sumatoriaIterativa(i);
        new Grafica(sumatoriaIterativa).show();
    }
    public static void main(String[] args){launch(args);}
}
