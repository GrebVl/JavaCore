package buyer;

public class Buyer {
    protected String nameBuyer;
    protected int age;
    protected String phoneNumber;
    private Gender gender;

    public Buyer(String nameBuyer, int age, Gender gender, String phoneNumber) {
        this.nameBuyer = nameBuyer;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
