public class Student {
    private int studentID;
    private String name;
    private String address;
    private String phoneNumber;
    private int issuedBookID;
    private double lateFee;

    public Student(int studentID, String name, String address, String phoneNumber) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.issuedBookID = -1; // No book issued
        this.lateFee = 0.0;
    }

    public int getStudentID() { return studentID; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public int getIssuedBookID() { return issuedBookID; }
    public double getLateFee() { return lateFee; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setIssuedBookID(int bookID) { this.issuedBookID = bookID; }
    public void setLateFee(double lateFee) { this.lateFee = lateFee; }

    public void displayStudent() {
        System.out.println("Student ID: " + studentID + "\nName: " + name + "\nAddress: " + address + "\nPhone: " + phoneNumber + "\nIssued Book ID: " + (issuedBookID == -1 ? "None" : issuedBookID) + "\nLate Fee: $" + lateFee);
    }
}
