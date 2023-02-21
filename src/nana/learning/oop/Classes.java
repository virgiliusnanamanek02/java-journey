package nana.learning.oop;

public class Classes {
    public static void main(String[] args) {
        // Create a new object of type Person
        Person person = new Person();
        // Set the fields of the object
        person.setName("Nana");
        person.setAge(20);
        // Print the fields of the object
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Create a new object of type Occupation
        Occupation occupation = new Occupation();
        // Set the fields of the object
        occupation.setJob("Software Engineer");
        occupation.setSalary(100000);
        // Print the fields of the object
        System.out.println("Job: " + occupation.getJob());
        // Print the fields of the object
        System.out.println("Salary: Rp." + occupation.getSalary());
    }

    // Create a class called Person
    public static class Person { // public means that other classes can access this class
        // Create fields
        private String name; // private means that only this class can access this field
        private int age;

        // Create getters and setters
        public String getName() { // public means that other classes can access this method
            return name;
        }

        public void setName(String name) { // void means that this method does not return anything
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class Occupation { // static means that this class can be accessed without creating an object
        private String job;
        private int salary;

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
}
