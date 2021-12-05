package otherPattern.filter;

import java.util.ArrayList;
import java.util.List;

public class AgeEqualPersonFilter implements PersonFilter {
    
    int ageEqual;
    
    public AgeEqualPersonFilter(int ageEqual) {
        this.ageEqual = ageEqual;
    }

    @Override
    public List<Person> filter(List<Person> personList) {
        List<Person> personListReturn = new ArrayList<>();
        
        for (Person person : personList) {
            if(person.age == this.ageEqual) {
                personListReturn.add(person);
            }
        }

        return personListReturn;
   }

}