package practica.aed.analisisempiricodealgoritmos;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Grafica extends Stage {

    public Grafica(long[][] array, String nombre){
        super();
        NumberAxis xAxis=new NumberAxis();
        xAxis.setLabel("n");

        NumberAxis yAxis=new NumberAxis();
        yAxis.setLabel("Tiempo (ns)");

        LineChart<Number, Number> grafica=new LineChart<>(xAxis, yAxis);
        grafica.setTitle(nombre);
        grafica.setLegendVisible(false);
        grafica.setCreateSymbols(false);
        grafica.setAnimated(false);
        XYChart.Series<Number, Number> series=new XYChart.Series<>();
        series.setName(nombre);
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                long n=array[i][2];
                long tiempo=array[i][1];
                series.getData().add(new XYChart.Data<>(n, tiempo));
            }
        }
        grafica.getData().add(series);

        Scene scene=new Scene(grafica, 600, 400);
        this.setTitle(nombre);
        this.setScene(scene);
    }
}
