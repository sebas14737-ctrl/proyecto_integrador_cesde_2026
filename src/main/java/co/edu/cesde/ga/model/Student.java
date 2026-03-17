package co.edu.cesde.ga.model;

public class Student extends Person {

    private String birthDate;
    private Long studentId;

    public Student() {
    }

    public Student(Long userId, Long studentId, String code, String documentNumber,
                   String documentType, String firstName, String lastName,
                   String status, String birthDate) {
        super(userId, code, documentNumber, documentType, firstName, lastName, status);
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                "studentId=" + getStudentId() + '\n' +
                "userId=" + getUserId() + '\n' +
                "documentType=" + getDocumentType() + '\n' +
                "documentNumber=" + getDocumentNumber() + '\n' +
                "Names=" + getFirstName() + ' ' + getLastName() + '\n' +
                "Status=" + getStatus() + '}';
    }
}