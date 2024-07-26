
import java.util.Scanner;




import com.agencia.persons.application.CreatePersonUseCase;
import com.agencia.persons.application.DeletePersonUseCase;
import com.agencia.persons.application.UpdatePersonUseCase;
import com.agencia.persons.infraestructure.PersonController;
import com.agencia.persons.infraestructure.PersonRepository;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        PersonRepository personRepository = new PersonRepository();

        CreatePersonUseCase createPersonUseCase = new CreatePersonUseCase(personRepository);
        UpdatePersonUseCase updatePersonUseCase = new UpdatePersonUseCase(personRepository);
        DeletePersonUseCase deletePersonUseCase = new DeletePersonUseCase(personRepository);

        PersonController personController = new PersonController(createPersonUseCase, deletePersonUseCase, updatePersonUseCase);


        while (true) {
            
            System.out.println("2. Gestion Personas");

            System.out.println("12. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de nextInt
            
            switch (opcion) {
                case 1:

            
                    break;

                case 2:
                    personController.gestionPerson();
                    break;
                    
                
                
                default:

                    System.out.println("Opción inválida");
                    break;

            }
        }
    }
}