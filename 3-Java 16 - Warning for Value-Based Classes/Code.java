public class APITester {
   public static void main(String[] args) {
      Double d = 10.0;
      synchronized (d) {
         System.out.println(d);
      } 
   }
}

Output
APITester.java:4: warning: [synchronization] attempt to synchronize on an instance of a value-based class
   synchronized (d) {
   ^
1 warning