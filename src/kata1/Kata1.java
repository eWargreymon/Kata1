
package kata1;

import java.time.*;

public class Kata1 {

    
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.of(1998,10,17);
        Person person = new Person("Edu", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años." );
    }
    
}
