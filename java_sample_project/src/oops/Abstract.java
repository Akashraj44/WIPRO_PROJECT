package oops;
abstract class Hospital {

    // Concrete methods (common for all)
    void accounts() {
        System.out.println("Handling hospital accounts");
    }

    void ot() {
        System.out.println("Managing operation theatre");
    }

    // Abstract methods (must be implemented by child classes)
    abstract void payments();
    abstract void patients();
}


// Child Class: Doctor
class Doctor extends Hospital {

    @Override
    void payments() {
        System.out.println("Doctor receives consultation fees");
    }

    @Override
    void patients() {
        System.out.println("Doctor treats patients");
    }
}


// Child Class: Nurse
class Nurse extends Hospital {

    @Override
    void payments() {
        System.out.println("Nurse receives salary");
    }

    @Override
    void patients() {
        System.out.println("Nurse takes care of patients");
    }
}



public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital d = new Doctor();
        Hospital n = new Nurse();

        System.out.println("---- Doctor ----");
        d.accounts();
        d.ot();
        d.payments();
        d.patients();

        System.out.println("\n---- Nurse ----");
        n.accounts();
        n.ot();
        n.payments();
        n.patients();

	}

}
