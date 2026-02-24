package co.edu.cesde.ga.app;
import co.edu.cesde.ga.model.person;

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
    }

}


