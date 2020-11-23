package inheritance;

public class Child extends Parent {
    String university="Southeast University";
    
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+getAge());
        System.out.println("University : "+university);
      }
    
}
