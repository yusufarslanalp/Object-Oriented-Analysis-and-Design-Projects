import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //roots: 5, 1, -2
        double[][] matrix = {
                { 1, 4, 1, 7 }, //x1 + 4x2 + x3 = 7
                { 1, 6, -1, 13 }, //x1 + 6x2 - x3 = 13
                { 2, -1, 2, 5 } //2x1 + -x2 + 2x3 = 5
        };

        //no solution
        double[][] matrix2 = {
                { 1, 4, 1, 7 }, //x1 + 4x2 + x3 = 7
                { 2, 8, 2, 14 }, //2x1 + 8x2 + 2x3 = 14
                { 3, 12, 3, 21 } //3x1 + 12x2 + 3x3 = 21
        };



        Scanner scanner = new Scanner(System.in);
        System.out.println( "Press enter to continue with default input..." );
        System.out.println( "If you want to enter your own input you can change matrix array in main." );
        //System.out.println( "You can change matrix array. Matrix array is in the main method of main class" );
        scanner.nextLine();

        System.out.println( "linear system in below will be solve" );
        print_equation( matrix );
        System.out.println( "Press enter to continue..." );
        scanner.nextLine();

        Solver gauss =  new GaussianElimination();
        Solver inverse =  new MatrixInversion();

        LinearEquationSystem linear_equation = new LinearEquationSystem( matrix, gauss );

        System.out.println( "the solution in below belongs to gauss elimination" );
        linear_equation.perform_solve();
        System.out.println( "Press enter to continue..." );
        scanner.nextLine();


        System.out.println( "the solution in below belongs to matrix inversion" );
        System.out.println( "the solution method changed dynamically" );
        linear_equation.set_solver( inverse );
        linear_equation.perform_solve();
        System.out.println( "Press enter to continue..." );
        scanner.nextLine();


        System.out.println( "linear system in below will be solve. But it has no solution" );
        print_equation( matrix2 );
        System.out.println( "Press enter to continue..." );
        scanner.nextLine();
        LinearEquationSystem no_solution_system = new LinearEquationSystem( matrix2, gauss );
        no_solution_system.perform_solve();



    }

    static void print_equation( double[][] equations )
    {
        int size = equations.length;
        for( int i = 0; i < size; i++ )
        {
            for( int j = 0; j < size-1; j++ )
            {
                System.out.print( equations[i][j] + "x" + j + "+ " );
            }
            System.out.print( equations[i][size-1] + "x" + (size-1) );
            System.out.println( " = " + equations[i][size] );
        }
    }
}
