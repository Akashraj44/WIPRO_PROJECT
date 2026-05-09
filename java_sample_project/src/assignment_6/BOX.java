package assignment_6;

public class BOX {
	int length;

    BOX(int length) {
        this.length = length;
    }
}
class Test{
    static void modifyBox(BOX b) {
        b.length = b.length + 5;
    }

	public static void main(String[] args) {
		BOX C= new BOX(10);
        System.out.println("Before: " + C.length);
        modifyBox(C);
        System.out.println("After: " + C.length);
		
	}

}
