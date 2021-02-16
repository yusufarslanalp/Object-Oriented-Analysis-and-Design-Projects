public class MatrixInversion implements Solver {


    @Override
    public double[] solve(double[][] linear_equations) {
        int size = linear_equations.length;
        double temp;

        double[] right_side = take_right_side( linear_equations );
        double[][] inverse_matrix = new double[size][size];
        double[] roots;

        //initialize inverse matrix as unit matrix
        for( int i = 0; i < size; i++ )
        {
            for( int j = 0; j < size; j++ )
            {
                inverse_matrix[i][j] = 0;
            }
        }
        for( int i = 0; i < size; i++ )
        {
            inverse_matrix[i][i] = 1;
        }


        //make bottom triangle of matrix linear_equation zero
        for( int c = 0; c < size-1; c++ )
        {
            for(int r=c+1; r < size; r++)
            {
                temp = linear_equations[r][c];
                for(int i = 0; i < size; i++)
                {
                    linear_equations[r][i] = linear_equations[r][i] * linear_equations[c][c];
                    inverse_matrix[r][i] = inverse_matrix[r][i] * linear_equations[c][c];

                }
                for(int i = 0; i < size; i++)
                {
                    linear_equations[r][i] += linear_equations[c][i] * temp * -1;
                    inverse_matrix[r][i] += inverse_matrix[c][i] * temp * -1;

                }
            }

        }

        double coefficent;

        //make diagonal line of matrix linear_equation 1
        for(int r = 0; r < size; r++)
        {
            coefficent = linear_equations[r][r];
            for(int c = 0; c < size; c++)
            {
                linear_equations[r][c] /= coefficent;
                inverse_matrix[r][c] /= coefficent;
            }

        }

        //make top triangle of matrix linear_equation zero
        for( int c = size-1; c > 0; c-- )
        {
            for(int r=c-1; r >= 0; r--)
            {
                temp = linear_equations[r][c];
                for(int i = 0; i < size; i++)
                {
                    linear_equations[r][i] = linear_equations[r][i] * linear_equations[c][c];
                    inverse_matrix[r][i] = inverse_matrix[r][i] * linear_equations[c][c];

                }
                for(int i = 0; i < size; i++)
                {
                    linear_equations[r][i] += linear_equations[c][i] * temp * -1;
                    inverse_matrix[r][i] += inverse_matrix[c][i] * temp * -1;

                }
            }

        }

        roots = matrix_multiplication( inverse_matrix, right_side );
        return roots;
    }

    private double[]
    take_right_side( double[][] matrix )
    {
        int size = matrix.length;
        double[] right_side = new double[size];

        for( int i = 0; i < size; i++ )
        {
            right_side[i] = matrix[i][size];
        }

        return right_side;
    }

    private double[]
    matrix_multiplication( double[][] matrix, double[] right_side )
    {
        int size = matrix.length;
        double[] roots = new double[size];

        for( int i = 0; i < size; i++ )
        {
            roots[i] = 0;
        }

        for( int i = 0; i < size; i++ )
        {
            for( int j = 0; j < size; j++ )
            {
                roots[i] += matrix[i][j] * right_side[j];
            }
        }
        return roots;
    }
}
