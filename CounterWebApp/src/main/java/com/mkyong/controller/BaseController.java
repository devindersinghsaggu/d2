package com.mkyong.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.DAO.Employee;
import com.mkyong.DAO.EmployeeDao;
import com.mkyong.DAO.EmployeeDaoImpl;
import com.mkyong.DAO.Work;


@Controller
public class BaseController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private final static org.slf4j.Logger logger = LoggerFactory
			.getLogger(BaseController.class);
	String saggu = "saggu";
	
	
	EmployeeDao emp = new EmployeeDaoImpl();
	
	public EmployeeDao getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDao emp) {
		this.emp = emp;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {/*
ApplicationContext app=new ClassPathXmlApplicationContext("spring_hibernate_config.xml");

SessionFactory factory=(SessionFactory)app.getBean("mySessionFactory");
Session session=factory.openSession();
session.beginTransaction();*/
		Work worked = new Work();
		Employee employee = new Employee();
		ApplicationContext context=	emp.initializesession();
		EmployeeDao studentDao = (EmployeeDao) context.getBean("employeeDAO");
		/*Work work = (Work) context.getBean("work");
		worked.setPosition("manager");
		worked.setType("managerial");
		worked.setWorkid(15);*//*
		employee.setWork(worked);*/
		//employee.setId((long) 16);
		employee.setName("saggu");
		employee.setSalary("10000");
		studentDao.addCustomer(employee);
/*session.save(emp);
session.clear();*/
		
		model.addAttribute("message", "Welcome");
		model.addAttribute("counter", ++counter);
		model.put("name", saggu);
		logger.debug("[welcome] counter : {}", counter);

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return VIEW_INDEX;

	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
		System.out.println("hello");
		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return VIEW_INDEX;

	}

	@ResponseBody
	@RequestMapping(value = "/ajax", method = RequestMethod.GET)
	public String ajaxcall(@RequestParam("hello") String name, ModelMap model,
			HttpServletRequest request) {

		// String nameArray[]=name.split(",");
		JSONParser parser = new JSONParser();
		Object obj;
		try {
			obj = parser.parse(name);
			JSONObject Jobj=(JSONObject)obj;
			System.out.println("obj = "+Jobj.get("a"));
			/*StringWriter out = new StringWriter();
			Jobj.writeJSONString(out);
			 name = out.toString();*/
			name=(String) Jobj.get("a");
			
		/*	JSONArray array = (JSONArray)obj;
			JSONObject Jobj=(JSONObject) array.get(1);
			for (int i = 0; i < array.size(); i++) {
				System.out.println(array.get(i));

			}*/
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		System.out.println("hello = " + name);

		String Name = "badbye";

		model.addAttribute("message", "Welcome " + name);
		model.addAttribute("counter", ++counter);
		logger.debug("[welcomeName] counter : {}", counter);
		return name;

	}
	
	@RequestMapping(value = "/upload.php", method = RequestMethod.POST)
	public String uploadFile(){
		return "upload";
	}	

}