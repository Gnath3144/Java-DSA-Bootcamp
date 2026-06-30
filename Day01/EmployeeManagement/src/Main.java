public class Main {
    public static void main(String[] args) {
         Employee employees[] = {
            new Manager(),
            new Developer(),
            new Tester()
         };
         for(Employee e : employees) {
             e.work();
         }
    }
}