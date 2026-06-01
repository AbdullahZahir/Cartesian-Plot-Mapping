public class XYPlotRunner
{
    public static void main(String[] args)
    {
        int[][] plot1 = {
            {1, 2},
            {2, 4},
            {3, 3},
            {2, 4},
            {5, 7},
            {6, 6},
            {7, 8},
            {8, 6},
            {9, 9},
            {10, 10}
        };

        // Create new XYPlot object
        XYPlot plot = new XYPlot(plot1);
        
        // Check to see if plot has duplicate coordinates
        System.out.println("Has duplicates: " + plot.hasDuplicates());
        
        
        // Check to see if all coordinates in plot are positive
        System.out.println("All positive coordinates: " + plot.allPositive());
        
        // Graph coordinates on X-Y plane
        plot.graphCoordinates();
        
        
    }
}
