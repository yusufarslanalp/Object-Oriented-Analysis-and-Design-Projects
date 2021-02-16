public class LinearEquationSystem {
    private double[][] linear_equation;
    private Solver solver;

    public void perform_solve() {
       double[][] copy_array = copy_2D();
       print_solution( solver.solve( copy_array ) );
    }

    public void set_solver( Solver new_solver ) {
        solver = new_solver;
    }

    LinearEquationSystem( double[][] linear_equation, Solver solver_type )
    {
        this.linear_equation = linear_equation;
        this.solver = solver_type;
    }

    private double[][] copy_2D(  )
    {
        int size = linear_equation.length;
        double[][] copy_array = new double[size][size+1];

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j <= size; j++)
            {
                copy_array[i][j] = linear_equation[i][j];
            }
        }
        return copy_array;
    }

    private void print_solution( double[] roots )
    {
        boolean valid_solution = true;
        for( int i = 0; i < roots.length; i++ )
        {
            if( Double.isNaN( roots[i] ) == true )
            {
                valid_solution = false;
                break;
            }
        }

        if( valid_solution == true )
        {
            for( int i = 0; i < roots.length; i++ )
            {
                System.out.println( "x" + i + ": " + roots[i] );
            }
        }
        else
        {
            System.out.println( "No soLutuion for given equations" );
        }
    }
}
