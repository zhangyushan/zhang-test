package zhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhang.domain.Person;
import zhang.mapper.PersonMapper;
import zhang.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;

	@Override
	public void insertPerson(Person person) {
		personMapper.savePerson(person);
	}

	@Override
	public void updatePerson(Person person) {
		personMapper.updatePerson(person);
	}

	@Override
	public void removePerson(Integer id) {
		personMapper.deletePersonById(id);
	}

	@Override
	public Person selectPersonById(Integer id) {
		return personMapper.selectPersonById(id);
		
	}

}
