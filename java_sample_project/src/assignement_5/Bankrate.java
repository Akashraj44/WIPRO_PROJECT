package assignement_5;
abstract class Bank {
    abstract double getInterestRate();
}

// SBI class
class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}

// ICICI class
class CANARA extends Bank {
    double getInterestRate() {
        return 6.8;
    }
}

public class Bankrate {

	public static void main(String[] args) {
		
		SBI b1 = new SBI();
        HDFC b2 = new HDFC();
        CANARA b3 = new CANARA();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate());
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate());
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate());
    }

	}


