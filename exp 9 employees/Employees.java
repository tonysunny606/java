import java.util.*;

class Employee{

          int empid,salary;
          String name,address;
          Employee(int empid,String name,int salary,String address){
             this.empid=empid;
             this.name=name;
             this.salary=salary;
             this.address=address;
             }
             Employee(){
             }}
 class Teacher extends Employee
 {
            String subject;
            String department;
            Teacher(int empid,String name,int salary,String address,String subject,String department){
              super(empid,name,salary,address);
              this.subject=subject;
              this.department=department;
               
              }
              Teacher(){
                 super();
                 }                  
              
              
 
void displayTeacher(Teacher[] teachers)
 {              
   String format="%-10s %-20s %-20s %-10s %-20s %-20s";
   System.out.format(format,"Empid","Emp_name","Emp_salary","Emp_address","Emp_subject","Emp_department");
   System.out.println();
   System.out.format(format,"------","-------","----------","-----------","----------","---------------");
   System.out.println();
   System.out.println();
   for(Teacher t: teachers)
     {
       System.out.format(format,t.empid,t.name,t.salary,t.address,t.subject,t.department);
       System.out.println();
       }}}
       
      class Employees{
      
      public static void main(String[] args)
       {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of employees : ");
        int size=sc.nextInt();
        Teacher[] teachers=new Teacher[size];
        for(int i=0;i<size;i++)
          {
          System.out.println("Enter the employee id : ");
          int empid=sc.nextInt();
          System.out.println("Enter the employee name : ");
          String name=sc.next();
          System.out.println("Enter the Salary : ");
          int salary=sc.nextInt();
          System.out.println("Enter the address : ");
          String address=sc.next();
          System.out.println("Enter the Subject : ");
          String subject=sc.next();
          System.out.println("Enter the department : ");
          String department=sc.next();
          teachers[i]=new Teacher(empid,name,salary,address,subject,department);
          }
          Teacher t1=new Teacher();
          t1.displayTeacher(teachers);
          }}
          
         
     
        
