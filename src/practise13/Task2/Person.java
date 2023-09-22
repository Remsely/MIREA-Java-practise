package practise13.Task2;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();
        if(lastName != null)
            fullName.append(lastName);

        if(firstName != null){
            if(!fullName.isEmpty())
                fullName.append(" ");
            fullName.append(firstName.charAt(0));
            fullName.append(".");
        }
        if(middleName != null){
            if (firstName == null)
                fullName.append(" ");
            fullName.append(middleName.charAt(0));
            fullName.append(".");
        }
        return fullName.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Прокопчук", "Роман", "Олегович");
        Person person2 = new Person("Иванов", null, "Иванович");
        Person person3 = new Person("Смирнов", "Сергей", null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}
