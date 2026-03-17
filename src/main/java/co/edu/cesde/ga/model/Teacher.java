package co.edu.cesde.ga.model;

public class Teacher  extends Person{
    private Long teacherId;

    public Teacher() { super();
    }

    public Teacher(Long teacherId, Long userId, String code, String documentNumber, String documentType, String firsName, String lastName, String status) {
        super(userId, code, documentNumber, documentType, firsName, lastName, status);
        this.teacherId = teacherId;
    }
    public Long getTeacherId() {
        return teacherId;

    }
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;

    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "userId=" + getUserId() +
                "documentType=" + getDocumentType() + '\n' +
                "documentNumber " + getDocumentNumber() + '\n' +
                "Names= " + getFirsName() + ' ' +  getLastName() + '\n' +
                "Status= " + getStatus() + '}';


    }
}
