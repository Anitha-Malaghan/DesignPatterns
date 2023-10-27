package ProdBuilderPattern;

public class Client {
    public static void main(String[] args){
        Student.StudentBuilder b = Student.getBuilder();
        b.name = "nikhil";
        b.age = 31;
        //student is building the object taking all row material from the builder
        Student st = b.build();

        Student.StudentBuilder b1 = Student.getBuilder();
        b1.name = "Shubham";
        b1.age = 27;
        //student is building the object taking all row material from the builder
        Student st1 = b1.build();

        System.out.println("Debug");
    }

}
