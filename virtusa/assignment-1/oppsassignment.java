import java.util.*;
import java.io.*;
import java.lang.*;
class Employee{
int phoneno,exp;
String salary,name,gender,emailid,dob,doj,address;
}
class oppsassignment
{
    static Scanner sc = new Scanner(System.in);
    static Dictionary<Integer,Employee> Employees= new Hashtable();
    static void add()
    {
        System.out.println("Enter Details:");
        Employee e = new Employee();
        System.out.print("Enter id:");
        int id=sc.nextInt();
        System.out.print("Enter name:");
        e.name=sc.next();
        System.out.print("Enter gender:");
        e.gender=sc.next();
        System.out.print("Enter dob:");
        e.dob=sc.next();
        System.out.print("Enter doj:");
        e.doj=sc.next();
        System.out.print("Enter salary :");
        e.salary= sc.next();
        System.out.print("Enter address:");
        e.address= sc.next();
        System.out.print("Enter emailid:");
        e.emailid=sc.next();
        System.out.print("Enter phoneno:");
        e.phoneno=sc.nextInt();
        System.out.print("Enter experience:");
        e.exp = sc.nextInt();
        Employees.put(id,e);
        System.out.print("Added succesfully");
    }
    static void view1(){
        if (Employees.size()==0){
            System.out.println("No data is available to display");
        }
        else{
        System.out.print("Enter the Employee id:");
        int n = sc.nextInt();
        Employee e = Employees.get(n);
        for(int i=0;i<111;i++){
            System.out.print("_");
        }
        System.out.printf("\n|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|\n","id","name","gender","dob","doj","salary","address","emailid","phoneno","experience");
        for(int i=0;i<111;i++){
            System.out.print("_");
        }
        System.out.printf("\n|%10d|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10d|%10d|\n",n,e.name,e.gender,e.dob,e.doj,e.salary,e.address,e.emailid,e.phoneno,e.exp);
        for(int i=0;i<111;i++){
            System.out.print("_");
        }
    }
    }
    static void view2(){
        
        // System.out.println(Employees);
        if (Employees.size()==0){
            System.out.println("No data is available to display");
        }
        else{
        for(int i=0;i<111;i++){
            System.out.print("_");
        }
        System.out.printf("\n|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10s|\n","id","name","gender","dob","doj","salary","address","emailid","phoneno","experience");
        for(int i=0;i<111;i++){
            System.out.print("_");
        }
        for (Enumeration k = Employees.keys(); k.hasMoreElements();)
        {
            Employee e = Employees.get(k.nextElement());
            System.out.printf("\n|%10d|%10s|%10s|%10s|%10s|%10s|%10s|%10s|%10d|%10d|\n",k,e.name,e.gender,e.dob,e.doj,e.salary,e.address,e.emailid,e.phoneno,e.exp);
            for(int i=0;i<111;i++){
            System.out.print("_");
        }
        }
        }
    }
    static void update(){
        if (Employees.size()==0){
            System.out.println("No data is available.So updation of specific field is not possible");
        }
        else{
        System.out.print("Enter the Employee id:");
        int n = sc.nextInt();
        Employee e = Employees.get(n);
        Boolean b = true;
        while(b){
            System.out.print("Enter which field you want to update:");
            String choice = sc.next();
            switch(choice){
                case "name":System.out.print("Enter the value:");e.name = sc.next();break;
                case "gender":System.out.print("Enter the value:");e.gender = sc.next();break;
                case "dob":System.out.print("Enter the value:");e.dob = sc.next();break;
                case "doj":System.out.print("Enter the value:");e.doj=sc.next();break;
                case "salary":System.out.print("Enter the value:");e.salary = sc.next();break;
                case "address":System.out.print("Enter the value:");e.address=sc.next();break;
                case "emailid":System.out.print("Enter the value:");e.emailid = sc.next();break;
                case "phoneno":System.out.print("Enter the value:");e.phoneno = sc.nextInt();break;
                case "experience":System.out.print("Enter the value:");e.exp = sc.nextInt();break;
            }
            System.out.print("Still continue:true/false?");
            b = Boolean.parseBoolean(sc.next());
        }
        }
    }
    static void delete(){
        if (Employees.size()==0){
            System.out.println("No data is available.So deletion is not possible");
        }
        else{
        System.out.print("Enter the Employee id:");
        int n = sc.nextInt();
        Employees.remove(n);
        System.out.println("Deleted succesfully");
        }
    }
    public static void main(String[] args) {    
        System.out.println("Employee Management System\nHere are the operations that can be performed.\n1. Add Employee Details\n2. View Single Employee Details\n3. View All Employee Details\n4. Update Employee Details\n5. Delete Employee Details\n6. exit");
        while(true){
            System.out.print("\nEnter choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:add();break;
                case 2:view1();break;
                case 3:view2();break;
                case 4:update();break;
                case 5:delete();break;
                case 6:System.exit(0);
            }
        }
}
}