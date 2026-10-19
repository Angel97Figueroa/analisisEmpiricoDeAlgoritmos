package practica.aed.analisisempiricodealgoritmos;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalisisApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println(AnalisisSumatoria.sumatoriaIterativa(5));
        System.out.println(AnalisisSumatoria.sumatoriaRecursiva(5));

    }
}
