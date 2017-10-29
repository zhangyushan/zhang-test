package zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import zhang.domain.Person;
import zhang.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	/**
	 * 插入单条Person记录
	 * @param person
	 * @return
	 */
	@RequestMapping(value="person/savePerson",method=RequestMethod.POST)
	@ResponseBody
	public String savePerson(Person person) {
		
		try {
			personService.insertPerson(person);
			return "success";
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			return "fail";
	}
	
	/**
	 * 更新单条Person记录
	 * @param person
	 * @return
	 */
	@RequestMapping(value="person/updatePerson",method=RequestMethod.PUT)
	@ResponseBody
	public String updatePerson(Person Person) {
		
		try {
			personService.updatePerson(Person);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
			return "fail";
	}
	
	/**
	 * 删除单条Person记录
	 * @param person
	 * @return
	 */
	@RequestMapping(value="person/removePerson/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String removePerson(@PathVariable("id") Integer id) {
		try {
			personService.removePerson(id);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
			return "fail";
	}
	
	/**
	 * 查询单条Person记录
	 * @param person
	 * @return
	 */
	@RequestMapping(value="person/selectPerson/{id}",method=RequestMethod.GET)
	@ResponseBody
	public String getPerson(@PathVariable("id") Integer id) {
		try {
			Person person = personService.selectPersonById(id);
			String result = person.toString();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
			return null;
	}

}
