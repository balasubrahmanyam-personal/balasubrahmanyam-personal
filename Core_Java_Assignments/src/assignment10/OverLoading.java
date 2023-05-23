package assignment10;

class Teacher{
    public int student(int a,int b){
        System.out.println("Nice....But.....");
        return a+b;

    }
    public int student(int f1,int f2,int f3){

        return f1+f2+f3;
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.student(54,67);
        teacher.student(43,45,67);

    }
}
/*Nice....But.....

Process finished with exit code 0
*/