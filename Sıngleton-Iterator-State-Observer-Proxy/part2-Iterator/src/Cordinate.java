public class Cordinate
{
    private int row_index;
    private int col_index;


    Cordinate( int row, int col )
    {
        row_index = row;
        col_index = col;
    }

    Cordinate()
    {
        row_index = 0;
        col_index = 0;
    }

    Cordinate( Cordinate right )
    {
        row_index = right.row_index;
        col_index = right.col_index;
    }

    public int get_row_index() {
        return row_index;
    }

    public void set_row_index(int x) {
        this.row_index = x;
    }

    public int get_col_index() {
        return col_index;
    }

    public void set_col_index(int y) {
        this.col_index = y;
    }


    boolean equal( Cordinate crd )
    {
        if( row_index == crd.row_index && col_index == crd.col_index ) return true;
        else return false;
    }

    Cordinate up( )
    {
        Cordinate new_crd = new Cordinate( row_index -1 , col_index );
        return new_crd;
    }

    Cordinate left( )
    {
        Cordinate new_crd = new Cordinate( row_index , col_index -1 );
        return new_crd;
    }

    Cordinate right( )
    {
        Cordinate new_crd = new Cordinate( row_index , col_index +1 );
        return new_crd;
    }

    Cordinate down( )
    {
        Cordinate new_crd = new Cordinate( row_index +1 , col_index );
        return new_crd;
    }

    Cordinate
    take_cordinate( String direction )
    {
        if( direction.equals("up") )
        {
            return up();
        }

        if( direction.equals("down") )
        {
            return down();
        }

        if( direction.equals("right") )
        {
            return right();
        }

        if( direction.equals("left") )
        {
            return left();
        }

        return null;
    }


    void print()
    {
        System.out.print( "(" + row_index + "," + col_index + ")" );
    }


}
