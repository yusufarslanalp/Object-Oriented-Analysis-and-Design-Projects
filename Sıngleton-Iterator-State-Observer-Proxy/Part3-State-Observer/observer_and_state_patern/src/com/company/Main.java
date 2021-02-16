package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
    	Traffic_dedector traffic_dedector = new Traffic_dedector();
    	Traffic_light tl = new Traffic_light( traffic_dedector );

		Scanner scanner = new Scanner(System.in);
		System.out.println( "Now there is no traffic" );
		System.out.println( "Press enter to continue..." );
		scanner.nextLine();

    	tl.turn_on_red();
	    tl.turn_on_green();
	    tl.turn_on_yellow();
		System.out.print( "You can see that green light turned on for 60 second" );
		System.out.println( " When there are no traffic.\n" );

		System.out.println( "Press enter to continue..." );
		scanner.nextLine();

	    traffic_dedector.change_traffic( true );
		System.out.println( "Now the traffic increased. And now there are traffic" );
		System.out.println( "Press enter to continue..." );
		scanner.nextLine();
	    tl.turn_on_red();
		tl.turn_on_green();
		tl.turn_on_yellow();
		System.out.print( "You can see that green light turned on for 90 second" );
		System.out.println( " When there are traffic.\n" );

		System.out.println( "Press enter to continue..." );
		scanner.nextLine();

		System.out.println( "Now the traffic turned normal. And now there are NO traffic" );
		System.out.println( "Press enter to continue..." );
		scanner.nextLine();
		traffic_dedector.change_traffic( false );
		tl.turn_on_red();
		tl.turn_on_green();
		tl.turn_on_yellow();

		System.out.print( "You can see that green light turned on for 60 second" );
		System.out.println( " When there are no traffic.\n" );
    }
}
