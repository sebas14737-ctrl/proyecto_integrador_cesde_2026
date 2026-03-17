package co.edu.cesde.ga.app;

import co.edu.cesde.ga.model.*;
import co.edu.cesde.ga.model.GroupSubjects;

public class Main {

    public static void main(String[] args) {


        Student student = new Student();
        student.setUserId(12L);
        student.setCode("123456");
        student.setDocumentNumber("1036401402");
        student.setFirsName("Santiago");
        student.setLastName("Arenas");
        student.setStatus("Active");
        student.setBrithDate("05/06/1996");

        System.out.println("Student Id: " + student.getUserId());
        System.out.println("Student Code: " + student.getCode());
        System.out.println("Student Document Number: " + student.getDocumentNumber());
        System.out.println("First Name: " + student.getFirsName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Status: " + student.getStatus());
        System.out.println("Brith Date: " + student.getBrithDate());

        Teacher teacher = new Teacher();
        teacher.setUserId(1L);
        teacher.setCode("123456");
        teacher.setDocumentNumber("20202501");
        teacher.setFirsName("Pedro");
        teacher.setLastName("Ramirez");
        teacher.setStatus("Active");

        System.out.println("Teacher Id: " + teacher.getUserId());
        System.out.println("Teacher Code: " + teacher.getCode());
        System.out.println("Teacher Document Number: " + teacher.getDocumentNumber());
        System.out.println("First Name: " + teacher.getFirsName());
        System.out.println("Last Name: " + teacher.getLastName());
        System.out.println("Status: " + teacher.getStatus());

        Student student2 = new Student(2L, "23456", "15423969", "Banesa", "Quintero", "Active", "24/02/1996");

        // Creación de materias (Sebastian Ramirez)
        Subject subject = new Subject();
        subject.setSubjectId(101L);
        subject.setCode("MAT101");
        subject.setName("Matemáticas");
        subject.setCredits(3);
        subject.setProgramId(101L);

        System.out.println("Id de materia: " + subject.getSubjectId());
        System.out.println("Codigo de materia: " + subject.getCode());
        System.out.println("Nombre de materia: " + subject.getName());
        System.out.println("Creditos: " + subject.getCredits());
        System.out.println("Id de Programa: " + subject.getProgramId());

        // Asignacion de materias (Sebastian Ramirez)
        GroupSubjects groupSubject = new GroupSubjects();
        groupSubject.setGroupSubjectId(101L);
        groupSubject.setGroupId(1L);
        groupSubject.setSubjectId(subject.getSubjectId());
        groupSubject.setTeacherId(teacher.getUserId());

        System.out.println("Id de asignacion de materia: " + groupSubject.getGroupSubjectId());
        System.out.println("Group Id: " + groupSubject.getGroupId());
        System.out.println("Subject Id: " + groupSubject.getSubjectId());
        System.out.println("Teacher Id: " + groupSubject.getTeacherId());

        // Creacion de notas (Sebastian Ramirez)
        Grade grade = new Grade();
        grade.setGradeId(2L);
        grade.setGroupSubjectId(groupSubject.getGroupSubjectId());
        grade.setStudentId(student.getUserId());
        grade.setFinalScore(4);
        grade.setObservation("aprueba");

        System.out.println("Id de notas: " + grade.getGradeId());
        System.out.println("GroupSubject Id: " + grade.getGroupSubjectId());
        System.out.println("Student Id: " + grade.getStudentId());
        System.out.println("Calificación: " + grade.getFinalScore());
        System.out.println("Observación: " + grade.getObservation());
    }
}
