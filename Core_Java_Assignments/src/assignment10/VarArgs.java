package assignment10;

class Vehicle{
    public void wheels(int ... n){
        int sum=1;
        for(int i=0;i<n.length;i++){
            sum = sum*n[i];
        }
        System.out.println(sum);
    }
}
public class VarArgs {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.wheels(3,2,3);

    }
}
/*
18

Process finished with exit code 0
 */