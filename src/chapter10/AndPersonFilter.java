package chapter10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AndPersonFilter implements PersonFilter {
    
    List<PersonFilter> personFilterList = new ArrayList<>();
    
    public AndPersonFilter and(PersonFilter personFilter) {
        this.personFilterList.add(personFilter);
        return this;
    }

    @Override
    public List<Person> filter(List<Person> personList) {
        List<List<Person>> personListList = new ArrayList<List<Person>>();
        for (PersonFilter personFilter : personFilterList) {
            personListList.add(personFilter.filter(personList));
        }
        
        Set<Person> personSet = new HashSet<Person>();
        for (List<Person> personList1 : personListList) {
            for (Person person : personList1) {
                personSet.add(person);
            }
        }

        return new ArrayList<Person>(personSet);
    }

}
