package practice;

public class flowerclass {
    private String flowername;
    private int no_petals;
    private double price;

    flowerclass(String fn, int n, double rate){
        flowername = fn;
        no_petals = n;
        price = rate;
    }
    // Setter
    public void setfname(String newname){this.flowername = newname;}
    public void setnumber(Integer newnumber){this.no_petals = newnumber;}
    public void setprice(Double newprice){this.price = newprice;}

    // Getter
    public String getName() {return flowername;}
    public int getNumber() {return no_petals;}
    public double getRate() {return price;}
    
    public static void main(String[] args) {
        flowerclass first = new flowerclass("Hibiscus", 6, 200.0);
        flowerclass second = new flowerclass("Lotus", 10, 1000.0);
        first.setfname("ROse");
        first.setnumber(9);
        first.setprice(500.2);
        System.out.println("FLower Name "+first.getName());
        System.out.println("Number of petals "+first.getNumber());
        System.out.println("Price "+first.getRate());
        System.out.println("\nFLower Name "+second.getName());
        System.out.println("Number of petals "+second.getNumber());
        System.out.println("Price "+second.getRate()+"\n");
    }
}
