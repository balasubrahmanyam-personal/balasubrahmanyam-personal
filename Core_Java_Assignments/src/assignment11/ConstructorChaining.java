package assignment11;

import java.lang.reflect.Method;

class Constructor{
    private String name;
    private int id;

    public Constructor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        try {
            Constructor constructor = new Constructor("veera", 01);
            Method privateMethod1 = Constructor.class.getDeclaredMethod("getId");
            privateMethod1.setAccessible(true);
            int id = (int)privateMethod1.invoke(constructor);
            Method privateMethod2 = Constructor.class.getDeclaredMethod("getName");
            privateMethod2.setAccessible(true);
            String name = (String) privateMethod2.invoke(constructor);
            System.out.println("ID:" + id);
            System.out.println("Name:"+name);


        } catch (Exception constructor ) {
            constructor.printStackTrace();
        }


    }
}

/*
ID:1
Name:veera

Process finished with exit code 0

 */