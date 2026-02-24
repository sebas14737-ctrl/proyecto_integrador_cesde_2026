package co.edu.cesde.ga.model;

public class student extends person {

    private String birthDate;

    public student() {
    }

    public student(Long userId, String code, String documentNumber, String firstName, String lastName, String userName, String status, String birthDate) {
        super(userId, code, documentNumber, firstName, lastName, userName, status);
        this.birthDate = birthDate;
    }
    public String getBirthDate() {return birthDate;}
    public void setBirthDate(String birthDate) {this.birthDate = birthDate;}
}
