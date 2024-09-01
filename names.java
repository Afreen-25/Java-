class studentss{
    private String name;
    public studentss(String name){
        if(name!=null){
            this.name=name;
        }
        else{
            this.name="unknown";
        }
    }
    public String get(){
        return name;
    }

}
public class names{
    public static void main(String[] args) {
        studentss s1=new studentss("tom");
        studentss s2=new studentss(null);
        studentss s3=new studentss("som");
        System.out.println("Student 1 Name: " + s1.get());
        System.out.println("Student 2 Name: " + s2.get());
        System.out.println("Student 3 Name: " + s3.get());

        
    }

}