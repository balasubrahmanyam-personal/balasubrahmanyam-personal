package assignment12;

public class Question2 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        String str = "Java is complex to learn";
        str = str.toLowerCase();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                sum1++;
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                sum2++;
            }
        }
        System.out.println("No of Vowels:"+sum1);
        System.out.println("No Of Consonants:"+sum2);
    }
}

/*
No of Vowels:8
No Of Consonants:12

Process finished with exit code 0

 */