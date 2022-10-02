

interface A{
    default void print(){
        System.out.println("A");
    }
}
interface B{
    default  void print(){
        System.out.println("B");
    }
}
public class Question5 implements A,B{
    public void print(){
        System.out.println("Multiple Inheritance");
    }

    public static void main(String[] args) {
        Question5 obj = new Question5();
        obj.print();
    }

}