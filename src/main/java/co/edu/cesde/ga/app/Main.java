package co.edu.cesde.ga.app;
import co.edu.cesde.ga.model.person;
import co.edu.cesde.ga.model.teacher;
import co.edu.cesde.ga.model.student;

public class Main {
    public static void main(String[] args) {

        //crea una persona con un costructor vacio
        person person = new person();
        person.setUserId(1L);
        person.setCode("123");
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setDocumentNumber("123456");
        person.setStatus("Active");

        // imprime los datos
        System.out.println("User Id: " + person.getUserId());
        System.out.println("Code:  " + person.getCode());
        System.out.println("FirstName:  " + person.getFirstName());
        System.out.println("LastName:  " + person.getLastName());
        System.out.println("DocumentNumber: " + person.getDocumentNumber());
        System.out.println("Status:  " + person.getStatus());

        // crea una persona con un constructor lleno
        person person1 = new person(2L, "456", "456789", "Juan", "Lopez", "JuanLP", "Activo");
        System.out.println("User Id: " + person1.getUserId());
        System.out.println("Code:  " + person1.getCode());
        System.out.println("FirstName:  " + person1.getFirstName());
        System.out.println("LastName:  " + person1.getLastName());
        System.out.println("DocumentNumber:  " + person1.getDocumentNumber());
        System.out.println("Status:  " + person1.getStatus());

        // Crea un profesor desde un cosntructor vacio e imprime
        teacher teacher = new teacher();
        teacher.setUserId(0024L);
        teacher.setFirstName("Jaime");
        teacher.setLastName("Duque");
        teacher.setDocumentNumber("789456");
        teacher.setStatus("Active");
        System.out.println("User Id: " + teacher.getUserId());
        System.out.println("Code:  " + teacher.getCode());
        System.out.println("FirstName:  " + teacher.getFirstName());
        System.out.println("LastName:  " + teacher.getLastName());
        System.out.println("DocumentNumber:  " + teacher.getDocumentNumber());
        System.out.println("Status:  " + teacher.getStatus());

        // crea un profesor desde un constructor lleno e imprime
        teacher teacher1 = new teacher(0024L, "45688", "778454", "Diana", "Tamayo", "Dianapa", "Activo");
        System.out.println("User Id: " + teacher1.getUserId());
        System.out.println("Code:  " + teacher1.getCode());
        System.out.println("FirstName:  " + teacher1.getFirstName());
        System.out.println("LastName:  " + teacher1.getLastName());
        System.out.println("DocumentNumber:  " + teacher1.getDocumentNumber());
        System.out.println("Status:  " + teacher1.getStatus());

        //crea un estudiando con un constructor vacio
        student student = new student();
        student.setUserId(124L);
        student.setCode("1234");
        student.setFirstName("Daniel");
        student.setLastName("Osorio");
        student.setDocumentNumber("123456");
        student.setStatus("Active");
        student.setBirthDate("25/05/2021");
        System.out.println("User Id: " + student.getUserId());
        System.out.println("Code:  " + student.getCode());
        System.out.println("FirstName:  " + student.getFirstName());
        System.out.println("LastName:  " + student.getLastName());
        System.out.println("DocumentNumber:  " + student.getDocumentNumber());
        System.out.println("Status:  " + student.getStatus());
        System.out.println("BirthDate:  " + student.getBirthDate());

        // Crea un estudiante con un constructor lleno
        student student1 = new student(126L,"45545", "1004121222", "Jonathan", "Rios","Jntn" ,"Activo","12/02/2002");
        System.out.println("User Id: " + student1.getUserId());
        System.out.println("Code:  " + student1.getCode());
        System.out.println("FirstName:  " + student1.getFirstName());
        System.out.println("LastName:  " + student1.getLastName());
        System.out.println("DocumentNumber:  " + student1.getDocumentNumber());
        System.out.println("Status:  " + student1.getStatus());
        System.out.println("BirthDate:  " + student1.getBirthDate());


    }

}


