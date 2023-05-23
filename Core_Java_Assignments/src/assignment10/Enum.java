package assignment10;


public class Enum {
    public enum RED {STOP};
    public enum GREEN {GO};
    public enum YELLOW {DRIVE};
    ///public enum YELLOW {VERY};
   // public enum YELLOW {SLOW};

    public static void main(String[] args) {
        System.out.println("Red :"+RED.valueOf("STOP"));
        System.out.println("GREEN:"+GREEN.valueOf("GO" ));
        System.out.println("YELLOW"+YELLOW.valueOf("DRIVE"));

    }
}
/*
Red :STOP
GREEN:GO
YELLOWDRIVE

Process finished with exit code 0
 */