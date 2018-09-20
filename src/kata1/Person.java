
package kata1;

import java.util.Calendar;
import java.time.*;


public class Person {
    
    private final String name;
    private final LocalDate birthdate;
    
    public Person(String name,LocalDate birthdate){
        
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){
        
        return name;
    }
    
    public LocalDate getBirthdate(){
        
        return birthdate;
    }
    
    public int getAge(){
       
       LocalDate fecha = LocalDate.now();
       
       Period años = Period.between(birthdate, fecha);
       
       return años.getYears(); 
    }
    
}
