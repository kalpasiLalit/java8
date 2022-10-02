
    import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


    class Employee{
        String fullName;
        Long salary;
        String city;
        Employee(String fullName,Long salary,String city){
            this.fullName = fullName;
            this.salary = salary;
            this.city = city;

        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
        @Override
        public String toString(){
            return getFullName();
        }
    }


    public class    Question4 {
        public static void main(String[] args) {
            List<Integer> list =      Arrays.asList(10,13,15,16,17,20,22,25,40,43,67).stream()
                    .filter(e->e%2==0)
                    .collect(Collectors.toList());

            System.out.println("Even numbers are : " + list.toString());


            List<Employee> empList = new ArrayList<>();
            empList.add(new Employee("vipin ",30000L,"haldwani"));
            empList.add(new Employee("kapil ",2000L,"delhi"));
            empList.add(new Employee("rakesh",10000L,"delhi"));
            empList.add(new Employee("sumit ",200L,"delhi"));
            empList.add(new Employee("rohit",21000L,"bhimtal"));
            empList.add(new Employee("mohit" ,40000L,"haldwani"));

            Predicate<Employee> predicate = (e) -> {
                if(e.getSalary() < 5000 && e.getCity().equals("delhi")){
                    return true;
                }
                return false;
            };
            empList.stream().filter(predicate).forEach(e-> System.out.println(e));





        }
    }

