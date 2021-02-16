public class GaussianElimination implements Solver {

    @Override
    public double[] solve( double[][] linear_equations ) {
        int size = linear_equations.length;
        double temp;
        double[] roots = new double[size];

        //make bottom triangle of matrix zero
        for( int c = 0; c < size-1; c++ )
        {
            for(int r=c+1; r < size; r++)
            {
                temp = linear_equations[r][c];
                for(int i = 0; i <= size; i++)
                {
                    linear_equations[r][i] = linear_equations[r][i] * linear_equations[c][c];

                }
                for(int i = 0; i <= size; i++)
                {
                    linear_equations[r][i] += linear_equations[c][i] * temp * -1;

                }
            }

        }

        //make top triangle of matrix zero
        for( int c = size-1; c > 0; c-- )
        {
            for(int r=c-1; r >= 0; r--)
            {
                temp = linear_equations[r][c];
                for(int i = 0; i <= size; i++)
                {
                    linear_equations[r][i] = linear_equations[r][i] * linear_equations[c][c];

                }
                for(int i = 0; i <= size; i++)
                {
                    linear_equations[r][i] += linear_equations[c][i] * temp * -1;

                }
            }

        }

        //make diogonal of matrix one.
        double coefficent;
        for(int i = 0; i < size; i++)
        {
            coefficent = linear_equations[i][i];
            for(int j = 0; j <= size; j++)
            {
                linear_equations[i][j] /= coefficent;
                //System.out.print( linear_equations[i][j] + " " );
            }
            System.out.println( "" );
        }

        size = linear_equations.length;
        for( int i = 0; i < size; i++ )
        {
            roots[i] = linear_equations[i][size];
        }
        return roots;
    }
}
