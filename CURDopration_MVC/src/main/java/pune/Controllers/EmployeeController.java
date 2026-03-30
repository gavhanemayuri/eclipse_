package pune.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pune.Dao.EmployeeDao;
import pune.beans.Employee;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Controller
public class EmployeeController
{
	
	@Autowired
	EmployeeDao ed;

	@RequestMapping("/show")
	public void one() {
	System.out.println("Welcome");	
	}
	
	@RequestMapping("/RegisterEmployee")
	public String two()
	{
		return "RegisterEmployee";
	}
	
	//SaveEmployeeInfo
	
	@RequestMapping("/SaveEmployeeInfo")
	public String three(@ModelAttribute Employee e1) 
	{
	
		System.out.println(e1);
		if(e1.getEpass().equals(e1.getEcpass())) 
		{
			
		
		
		int x=ed.registerinfo(e1);
		if(x>0)
		{
			return "redirect:/EmployeeInfo";
		}
		return null;
		
		}
		
		return null;	
	}
	
	@RequestMapping("/EmployeeInfo")
	public String four(Model m)
	{
		
		List<Employee>l1=ed.displayall();
		System.out.println(l1);
		m.addAttribute("temp",l1);
		
		return "EmployeeInfo";
	}
	
	@RequestMapping("/deletedata/{id}")
	public String five(@PathVariable String id)throws UnsupportedEncodingException {
	    int x = ed.del(id);
	    String message = (x > 0) ? "Employee deleted successfully." : "Failed to delete employee.";
	    return "redirect:/EmployeeInfo?message=" + URLEncoder.encode(message, "UTF-8");
	}
	
	@RequestMapping("/editData/{id}")
	public String editEmployee(@PathVariable String id, Model m) {
	    List<Employee> l1 = ed.editemp(id);
	    
	    if (!l1.isEmpty()) {
	        m.addAttribute("single", l1);
	        return "editData/edit";
	    } else {
	        // Handle the case where the employee is not found
	        m.addAttribute("errorMessage", "Employee not found.");
	        return "errorPage";  // Ensure "errorPage.jsp" exists in the correct directory
	    }
	}
	    
	    @RequestMapping("/UpdateEmployeeInfo")
		public String seven(@ModelAttribute Employee e1 )
		{

            ed.updatemployeeinfo(e1);
	    	
	    	return null;
		}
	



	



}
	
	

