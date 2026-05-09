package demo;

public class Parent {
	public int a = 10;        // Accessible everywhere
    protected int b = 20;     // Accessible in same package + subclasses
    int c = 30;               // Default (no keyword) → same package only
    private int d = 40;       // Accessible only inside this class

    public void showValues() {
        System.out.println("Public a = " + a);
        System.out.println("Protected b = " + b);
        System.out.println("Default c = " + c);
        System.out.println("Private d = " + d);
    }
}

class Child extends Parent {

    public void display() {
        System.out.println("Accessing in Child class:");
        System.out.println("a = " + a); // public
        System.out.println("b = " + b); // protected
        System.out.println("c = " + c); //  default
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
        p.showValues();

        System.out.println("\nAccessing in Main class:");

        System.out.println("a = " + p.a); // ✅ public
        System.out.println("b = " + p.b); // ✅ protected (same package)
        System.out.println("c = " + p.c); // ✅ default (same package)
        

        Child c = new Child();
        c.display();

}
}
