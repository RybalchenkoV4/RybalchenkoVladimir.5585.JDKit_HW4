public class Employee {

    private final String name;
    private final int number;
    private final String phoneNumber;
    private final int experience;

    public int getNumber() {
        return number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public Employee(int number, String name, String phoneNumber, int experience) {
        this.number = number;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nEmployee № " + number + " {\n" +
                "name = " + name +
                ", \nphoneNumber = " + phoneNumber +
                ", \nexperience = " + experience +
                "}";
    }
}
