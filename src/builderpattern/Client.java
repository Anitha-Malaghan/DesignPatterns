package builderpattern;

public class Client {
    public static void main(String[] args){
        Builder b = new Builder();
        b.name = "nikhil";
        b.age = 101;
        //student is building the object taking all row material from the builder
        Student st = new Student(b);

        System.out.println("Debug");
    }

}
