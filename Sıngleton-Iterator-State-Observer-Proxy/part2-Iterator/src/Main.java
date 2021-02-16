//Yusuf Abdullah ARSLANALP
//151044046

import java.util.Iterator;

public class Main
{
    public static void main( String args[] )
    {
        int[][] arr = new int[][]{  {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };

        Iterator itr = new IteratorClockWise(arr);


        //prints: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        while( itr.hasNext() )
        {
            System.out.print( itr.next() + " " );
        }
        System.out.println( "" );

    }
}
