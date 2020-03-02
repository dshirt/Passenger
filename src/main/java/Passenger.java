public class Passenger {

    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    public Passenger(String title, String name, String id, String phone, int age) {
        if((title.equals("Mr")) || (title.equals("Mrs")) || (title.equals("Ms")))
           this.title = title;
        else
            throw new IllegalArgumentException("Title not valid");
        if(name.length() < 3)
            throw new IllegalArgumentException("Name not long enough");
        else
        this.name = name;
        if(id.length() < 10)
            throw new IllegalArgumentException("Id not long enough");
        else
        this.id = id;
        if(phone.length() < 10)
            throw new IllegalArgumentException("Phone Number not long enough");
        else
        this.phone = phone;
        if(age < 17)
            throw new IllegalArgumentException("You are too young to fly alone");
        else
        this.age = age;
    }


    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }


}
