class car{
    private String brandname;
    car(){
        this.brandname="ford";

    }
    public String getbrand(){
        return brandname;
    }

}
public class Sample{
    public static void main(String[] args) {
        car c=new car();
        String name=c.getbrand();
        System.out.println(name);
    }
}