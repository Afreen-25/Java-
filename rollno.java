class stud{
    String name;
    int roll;
    stud(String name, int roll){
        this.name=name;
        this.roll=roll;
    }
    public String geString(){
        return name;
    }
    public int get(){
        return roll;
    }

}

public class rollno{
    public static void main(String[] args) {
        stud s1= new stud("john", 2);
        // s1.name="john";
        // s1.roll=2;

        System.out.println("name is:" +s1.name);
        System.out.println("roll no is:" +s1.roll);

        
    }
}