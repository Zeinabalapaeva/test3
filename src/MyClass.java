public class MyClass {


    String name;
    String surname;
    String food;

     String  lesson ;
     String lesson2;
     String lesson3;



    public  MyClass(){

    }




    public MyClass(String name, String surname, String food, String lesson, String lesson2, String lesson3) {

        this.name = name;
        this.surname = surname;
        this.food = food;


    }


    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", food='" + food + '\'' +
                ", lesson='" + lesson + '\'' +
                ", lesson2='" + lesson2 + '\'' +
                ", lesson3='" + lesson3 + '\'' +
                '}';
    }
}

