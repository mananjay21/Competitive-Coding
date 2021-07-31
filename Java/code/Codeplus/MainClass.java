public class MainClass {
    

    public static void main(String[] args) {
        int a=10;
        float b=a;
        System.out.println(a);
        a=100;
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(b);

        
    }
    static class Person{
        String name;
        Person(String name){
            this.name=name;
        }
        
    }
    
}
