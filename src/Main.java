import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        MyClass myClass1 = new MyClass(){

        };

        MyClass[] myClasses = {
                new MyClass("Nurlan", "Kylychev", "manty", "Practice", "Technical", "english"),
                new MyClass("Zeinab", "Alapaeva", "lagman", "Practice", "Technical", "english"),
                new MyClass("Guli", "Eshektoto", "besh", "Practice", "Technical", "english"),
                new MyClass("Aiz", "Kylychev", "jjj", "Practice", "Technical", "english")
        };

        System.out.println(Arrays.toString(myClasses));


    }

}

