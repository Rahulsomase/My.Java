package Day9;

public class que3 {
    public static void main(String[] args) {
        Employee member=new Employee();
        member.Name="Rahul S";
        member.Age=22;
        member.Phone_number="9992223338";
        member.Adress="Aurangabad";
        member.Salary=60000;
        int x=member.printSalary();
        System.out.println(x);
    }
}
class Member{
    String Name;
    int Age;
    String Phone_number;
    String Adress;
    int Salary;
    public Integer printSalary() {
        return Salary;
    }
}
class Employee extends Member {
    String Specialisation;
    String Department;

}
class Manager extends Member{
    String Specialisation;
    String Department;
}
