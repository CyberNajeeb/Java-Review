public class Spartan {

    private int id;
    private String name;
    private String gender;
    private Long phone;

    public Spartan(int id, String name, String gender, Long phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    public int getId(){
        return id;
    }

    Spartan spartan = new Spartan(101, "Mohammed", "Male", 1234567890L);

}
