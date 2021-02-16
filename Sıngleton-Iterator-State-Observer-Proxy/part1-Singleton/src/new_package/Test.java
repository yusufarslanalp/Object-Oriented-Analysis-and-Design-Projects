package new_package;

public class Test{
    public int a;
    public int b;
    protected int c;

    void foo() throws CloneNotSupportedException {
        clone();
    }

    protected void print(){
        System.out.println( "print of Testttt" );
    }

}
