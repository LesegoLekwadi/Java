import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     System.out.println("Hello World!");

     Employee employee = new Employee(1,"Lesego","Lekwadi",30000.00);
     System.out.println(employee.getEmpNo());
        System.out.println(employee.getName() + " " + employee.getSurname());


        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(12);
        myList.add(30);
        myList.add(42);
        myList.remove(0);
        System.out.println(myList);
        //to remove everything you use clear
    }
}
