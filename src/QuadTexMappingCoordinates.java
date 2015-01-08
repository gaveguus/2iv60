

/**
 *
 * @author Gebruiker
 */
public class QuadTexMappingCoordinates
{
    public double[] p1;
    public double[] p2;
    public double[] p3;
    public double[] p4;

    public QuadTexMappingCoordinates(double p1x, double p1y, double p2x, double p2y, 
                                    double p3x, double p3y, double p4x, double p4y)
    {
        this.p1 = new double[]{p1x, p1y};
        this.p2 = new double[]{p2x, p2y};
        this.p3 = new double[]{p3x, p3y};
        this.p4 = new double[]{p4x, p4y};
    }
}
