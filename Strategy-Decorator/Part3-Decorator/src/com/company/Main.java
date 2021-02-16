package com.company;

public class Main {


    public static void main(String[] args) {

        Armored_suit suit1 = new Dec();
        suit1 = new Flamethrower( suit1 );
        suit1 = new AutoRifle( suit1 );
        suit1 = new AutoRifle( suit1 );
        suit1 = new RocketLauncher( suit1 );
        System.out.println( "Description suit1: " + suit1.getDescription() );
        System.out.println( "Cost of suit1: " + suit1.cost() + "k TL" );
        System.out.println( "Weight of suit1: " + suit1.weight() + "KG" );
        System.out.println( "" );

        Armored_suit suit2 = new Ora();
        suit2 = new Flamethrower( suit2 );
        suit2 = new AutoRifle( suit2 );
        suit2 = new RocketLauncher( suit2 );
        suit2 = new Laser( suit2 );
        System.out.println( "Description suit2: " + suit2.getDescription() );
        System.out.println( "Cost of suit2: " + suit2.cost() + "k TL" );
        System.out.println( "Weight of suit2: " + suit2.weight() + "KG" );
        System.out.println( "" );


        Armored_suit suit3 = new Tor();
        suit3 = new Flamethrower( suit3 );
        suit3 = new AutoRifle( suit3 );
        suit3 = new AutoRifle( suit3 );
        suit3 = new RocketLauncher( suit3 );
        System.out.println( "Description suit3: " + suit3.getDescription() );
        System.out.println( "Cost of suit3: " + suit3.cost() + "k TL" );
        System.out.println( "Weight of suit3: " + suit3.weight() + "KG" );
        System.out.println( "" );
    }
}
