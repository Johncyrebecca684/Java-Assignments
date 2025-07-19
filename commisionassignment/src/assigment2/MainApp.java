package assigment2;

public class MainApp {
    public static void main(String[] args) {
        // Creating a Student object (calls default constructor)
        Student student = new Student();

        // Creating Commission object and calling methods
        Commission commission = new Commission();
        commission.acceptDetails();
        commission.calculateCommission();
    }
}
