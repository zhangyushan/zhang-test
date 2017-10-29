package zhang.service;

import zhang.domain.Person;

public interface PersonService {

	public void insertPerson(Person person);

	public void updatePerson(Person person);

	public void removePerson(Integer id);

	public Person selectPersonById(Integer id);

}
