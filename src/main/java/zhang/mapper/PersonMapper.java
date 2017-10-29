package zhang.mapper;

import org.apache.ibatis.annotations.Param;
import zhang.domain.Person;

public interface PersonMapper {
	
	public void savePerson(Person person);
	
	public void updatePerson(Person person);
	
	public void deletePersonById(@Param("id")Integer id);
	
	public Person selectPersonById(@Param("id")Integer id);

}
