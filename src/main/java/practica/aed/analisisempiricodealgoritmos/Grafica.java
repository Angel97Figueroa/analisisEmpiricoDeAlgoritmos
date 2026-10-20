package practica.aed.analisisempiricodealgoritmos;

import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Grafica extends Stage {

    public Grafica(long[][] array){
        super();
        CategoryAxis xAxis=new CategoryAxis();
        xAxis.setLabel("n");

        NumberAxis yAxis=new NumberAxis();
        yAxis.setLabel("Tiempo (ns)");

        LineChart<String, Number> grafica=new LineChart<>(xAxis, yAxis);
        grafica.setTitle("Grafica super genial");
        grafica.setLegendVisible(false);

        XYChart.Series<String, Number> series=new XYChart.Series<>();
        series.setName("Grafica super genial");
        for(int i=0; i<array.length-1; i++){
            if(array[i]!=null){
                String n=String.valueOf(array[i][2]);
                long tiempo=array[i][1];

                series.getData().add(new XYChart.Data<>(n, tiempo));
            }
        }
        grafica.getData().add(series);

        Scene scene=new Scene(grafica, 600, 400);
        this.setTitle("Gráfica de Numero en sistema");
        this.setScene(scene);
    }
}
