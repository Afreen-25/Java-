interface sports{
    void score();
}
class students{
    int roll_no;
    students(int roll_no){
        this.roll_no=roll_no;
    }
}
class test extends students{
    int sem1;
    int sem2;
    test(int roll_no, int sem1, int sem2){
        super(roll_no);
        this.sem1=sem1;
        this.sem2=sem2;
    }
}
class results extends test implements sports{
    int total;
    results(int roll_no, int sem1, int sem2){
        super(roll_no, sem1, sem2);
    }
    public void score(){
        int sportsscore=50;
        total= sem1+sem2+sportsscore;
    }
    void displayResult() {
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Semester 1 Marks: " + sem1);
        System.out.println("Semester 2 Marks: " + sem2);
        System.out.println("Total Marks (including sports): " + total);
    }
}
public class result{
    public static void main(String[] args) {
        results r= new results(36, 90, 95);
        r.score();
        r.displayResult();
    }
}


