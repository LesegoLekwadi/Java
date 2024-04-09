public class Employee {

    int empNo;

    String name;

    String surname;

    double salary;


    Employee(int empNumber,String firstName, String lastname, double salary){
        this.empNo = empNumber;
        this.name = firstName;
        this.surname = lastname;
        this.salary = salary;
    }

    //Employee(){}

    public void setEmpNo( int empNo){

        this.empNo=empNo;
    }

    public int getEmpNo(){
        return empNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname( String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setSalary(){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

}
