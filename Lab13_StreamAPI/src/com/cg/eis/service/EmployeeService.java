package com.cg.eis.service;


import java.util.*;

import java.util.stream.Collectors;



import com.cg.eis.bean.*;

public class EmployeeService {

 Employee e1= new Employee();

 //sum of salaries

 public double getSumOfSalary(List<Employee> elist) {
 double sum=elist.stream().map(elist1->elist1.getSalary()).collect(Collectors.summingDouble(sal->sal));
 return sum;
 }

//	/list employees doesn't have  adept

 public List<Employee> getEmployeeWithoutDept(List<Employee> elist)
 {
 List<Employee> el1=elist.stream().filter(e->e.getDep()==null).collect(Collectors.toList());
 return el1;
 }

 //List employee name, salary and salary increased by 15%.

 public List<String> getSalInc(List<Employee> elist)
 {
 List<String> el3=elist.stream().map(e->e.getFirstName()+" "+e.getLastName() +"\t"+e.getSalary()+" "
   +(e.getSalary()+(e.getSalary()*0.15))).collect(Collectors.toList());
 return el3;
 }

 //Find employees who didn’t report to anyone (Hint: Employees without manager)

 public List<Employee> didnotHaveManager(List<Employee> elist){
 List<Employee> el2=elist.stream().filter(e->e.getManagerId()==null).collect(Collectors.toList());
 return el2;
 }

 //sort by employee names

 public List<Employee> sortName(List<Employee> elist)
 {
 Comparator<Employee> fistNameComparator= (e1,e2)->e1.getFirstName().compareTo(e2.getFirstName());
 List<Employee> el4=elist.stream().sorted(fistNameComparator).collect(Collectors.toList());
 return el4;
 }

 //sort by employee id's

 public List<Employee> sortEmpId(List<Employee> elist)
 {
 Comparator<Employee> empIdComparator= (e1,e2)->e1.getEmployeeId().compareTo(e2.getEmployeeId());
 List<Employee> el4=elist.stream().sorted(empIdComparator).collect(Collectors.toList());
 return el4;
 }

 //sort by department id's using dept id's

 public List<Employee> sortDeptId(List<Employee> elist)
 {
 Comparator<Employee> depIdComparator= (e1,e2)->e1.getDep().getDepartmentId().compareTo(e2.getDep().getDepartmentId());
 List<Employee> el4=elist.stream().filter(e->e.getDep()!=null).sorted(depIdComparator).collect(Collectors.toList());
 List<Employee> el5=elist.stream().filter(e->e.getDep()==null).collect(Collectors.toList());
 el4.addAll(el5);
 return el4;
 }

}