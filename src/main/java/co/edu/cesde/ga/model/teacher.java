package co.edu.cesde.ga.model;

public class teacher extends person {
    public teacher() {
    }

    public teacher(long userId, String code, String documentNumber, String firstName, String lastName, String userName, String status) {
        super(userId, code, documentNumber, firstName, lastName, userName, status);
    }
}