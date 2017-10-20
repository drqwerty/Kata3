package kata3;

import java.awt.Container;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }

    private Container createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios email",
                "Nº de emails",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(6, "", "gmail.com");
        dataSet.addValue(2, "", "hotmail.com");
        dataSet.addValue(8, "", "ull.es");
        dataSet.addValue(15, "", "ulpgc.es");
        return dataSet;
    }
}
