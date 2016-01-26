package QATest;

/**
 * Created by sewadeus on 13/12/2015.
 */
public class B extends A {
    B()
    {
        System.out.println(" constructor of B");
        int i = 7;
        super.create();
    }

    public void create() {
        System.out.println("class B creates method called");

    }
}