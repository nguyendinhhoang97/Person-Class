public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("John", "Seatle");
        Staff staff1 = new Staff("Dannie", "New York", "Califonia HighSchool", 1000);
        Student student1 = new Student("Lary White", "Wasington", "Math", 2018, 500);

        System.out.println(person1.toString());
        System.out.println(staff1.toString());
        System.out.println(student1.toString());
    }
}
