package oops;
	class hospital {
	    String hospitalName = "City Hospital";
	    String location = "Patna";

	    void hospitalInfo() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Location: " + location);
	    }
	}

	// Child class
	class Doctor extends hospital {
	    String doctorName = "Dr. Akash";
	    String specialization = "Cardiologist";

	    void doctorInfo() {
	        System.out.println("Doctor Name: " + doctorName);
	        System.out.println("Specialization: " + specialization);
	    }
	}

	public class test {
	    public static void main(String[] args) {
	        Doctor d = new Doctor();

	       
	        d.hospitalInfo();

	        System.out.println();

	        d.doctorInfo();
	    }
	}
	
	    
	    