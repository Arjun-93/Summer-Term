package practice;

public class encapsulation {
    //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must declare classs variables as private:
    // Get and set methods 
    private String name;
    public String getname(){
    return name;
    }
    public void setname(String newname){
         this.name = newname;
    }
    public static void main(String[] args) {
        encapsulation nme = new encapsulation();
        nme.setname("Arjun");
        nme.setname("Vanshika");
        System.out.println(nme.getname());
    }}
