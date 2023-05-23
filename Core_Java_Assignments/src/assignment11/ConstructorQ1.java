package assignment11;

class Question1{
    int id;
    String name;
    char section;

    public Question1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Question1(int id, String name, char section) {
        this.id = id;
        this.name = name;
        this.section = section;
    }

    @Override
    public String toString() {
        return "Question1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", section=" + section +
                '}';
    }
}
public class ConstructorQ1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1(76,"Rahul");
        Question1 question11 = new Question1(34,"Ram",'A');
        System.out.println(question1);
        System.out.println(question11);


    }
}
/*
Question1{id=76, name='Rahul', section= }
Question1{id=34, name='Ram', section=A}

Process finished with exit code 0

 */