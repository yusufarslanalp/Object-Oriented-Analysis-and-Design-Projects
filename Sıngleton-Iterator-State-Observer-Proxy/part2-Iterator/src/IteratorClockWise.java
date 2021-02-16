import java.util.Iterator;

public class IteratorClockWise implements Iterator {

    private String direction;
    Cordinate current;
    Cordinate next_crd;
    boolean[][] used_crds;
    int[][] arr_2d;
    boolean first_step = true;



    //Constructor
    IteratorClockWise(int[][] arr_2d )
    {
        this.arr_2d = arr_2d;
        current = new Cordinate( 0,0 );
        direction = "right";
        int num_of_row = arr_2d.length;
        int num_of_col = arr_2d[0].length;
        used_crds = new boolean[num_of_row][num_of_col];

        for( int i = 0; i < num_of_row; i++ )
        {
            for( int j = 0; j < num_of_col; j++ )
            {
                used_crds[i][j] = false;
            }
        }

    }

    public Object
    next()
    {
        int row, col;
        row = current.get_row_index();
        col = current.get_col_index();

        if( first_step ){
            first_step = false;
            return arr_2d[row][col];
        }

        if( hasNext() == true )
        {
            used_crds[row][col] = true;

            current = next_crd;
            row = current.get_row_index();
            col = current.get_col_index();
            return arr_2d[row][col];
        }

        System.out.println( "IteratorClockWise has no next element" );
        return -1;
    }

    boolean
    convenient( Cordinate crd )
    {
        int row = crd.get_row_index();
        int col = crd.get_col_index();

        if( row >= 0 && row < used_crds.length
            && col >= 0 && col < used_crds[0].length )
        {
            if( used_crds[row][col] == false ) return true;
        }

        return false;
    }


    boolean
    try_step()
    {
        next_crd = current.take_cordinate( direction );
        if( convenient(next_crd) == true )
        {
            return true;
        }
        return false;
    }

    public boolean
    hasNext()
    {
        int row, col;

        if( try_step() == true )
        {
            return true;
        }

        direction = "right";
        if( try_step() == true )
        {
            return true;
        }

        direction = "down";
        if( try_step() == true )
        {
            return true;
        }

        direction = "left";
        if( try_step() == true )
        {
            return true;
        }

        direction = "up";
        if( try_step() == true )
        {
            return true;
        }
        return false;
    }


}
