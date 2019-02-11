package chapter10;

import java.util.ArrayList;
import java.util.List;

public class OrPersonFilter implements PersonFilter {
    
    List<PersonFilter> personFilterList = new ArrayList<>();
    
    public OrPersonFilter and(PersonFilter personFilter) {
        this.personFilterList.add(personFilter);
        return this;
    }

    @Override
    public List<Person> filter(List<Person> personList) {
        List<List<Person>> personListList = new ArrayList<List<Person>>();
        for (PersonFilter personFilter : personFilterList) {
            personListList.add(personFilter.filter(personList));
        }
        
        for (Person person : personList) {
            int i = 0;
            for ( ; i < personListList.size() - 1; i++) {
                if (personListList.get(i).contains(person)) {
                    break;
                }
            }
            
            if (i == personListList.size()) {
                personList.remove(person);
            }
        }

        return personList;
   }

}