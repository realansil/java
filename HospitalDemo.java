class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Doctor extends Person {
    Doctor(String name) {
        super(name);
        System.out.println("Doctor constructor called");
    }

    void diagnose() {
        System.out.println(name + " is diagnosing patients");
    }
}

class Nurse extends Person {
    Nurse(String name) {
        super(name);
        System.out.println("Nurse constructor called");
    }

    void carePatient() {
        System.out.println(name + " is taking care of patients");
    }
}

class Surgeon extends Doctor {
    Surgeon(String name) {
        super(name);
        System.out.println("Surgeon constructor called");
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        System.out.println("Creating Nurse object:");

        Nurse n = new Nurse("Anitha");
        n.displayName();
        n.carePatient();

        System.out.println("\nCreating Surgeon object:");

        Surgeon s = new Surgeon("Rahul");
        s.displayName();
        s.diagnose();
        s.performSurgery();
    }
}
