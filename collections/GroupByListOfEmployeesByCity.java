package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
	private String name;
	private String city;
	
	public Employee1(String name, String city) {
        super();
        this.name = name;
        this.city = city;
    }		
	
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override	
    public String toString() {
        return "Employee1 [name=" + name + ", city=" + city + "]";
    }
}
public class GroupByListOfEmployeesByCity {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("A", "Bangalore");
        Employee1 emp2 = new Employee1("B", "Bangalore");
        Employee1 emp3 = new Employee1("C", "Pune");
        Employee1 emp4 = new Employee1("D", "Pune");
        Employee1 emp5 = new Employee1("E", "Mumbai");
        Employee1 emp6 = new Employee1("F", "Mumbai");
        Employee1 emp7 = new Employee1("G", "Noida");
        Employee1 emp8 = new Employee1("H", "Noida");
        Employee1 emp9 = new Employee1("I", "Delhi");
        Employee1 emp10 = new Employee1("J", "Delhi");

        ArrayList<Employee1> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        empList.add(emp8);
        empList.add(emp9);
        empList.add(emp10);
        //System.out.println(empList);
        
        Map<String, List<Employee1>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee1 :: getCity));
        
        groupByCity.forEach((key, value)-> System.out.println(String.format("%-10s %s", key, value)));
        //System.out.println(groupByCity);
	}

}
