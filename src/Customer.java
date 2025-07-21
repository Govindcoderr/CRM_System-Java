

public class Customer { // data model
    private int id ;
    private String name ;
    private String email;
    private String phone ;
    private String address;

    public Customer(int id , String name , String email,String phone , String address){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId(){ return id ;}
    public String getName(){ return name;}
    public String getEmail(){ return email ;}
    public String getPhone(){ return phone ;}
    public  String getAddress(){ return address ;}

    public  void setName(String name){this.name = name ;}

    public String getDetails(){
        return id + ", " + name + ", " + email + ", " + phone + ", " + address;
    }
}
