package proj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    public Person changeAsignee(String id, String Assignee) throws PersonException {
        Optional<Person> Operson = personRepository.findById(id);
        if(Operson.isPresent()) {
            Person person = Operson.get();
            person.setAsignee(Assignee);
            return person;
        } else {
            throw new PersonException(PersonError.Error.NO_PERSON_ID);
        }
    }

}
