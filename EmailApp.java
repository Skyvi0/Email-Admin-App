public class EmailApp {
  public static void main(String[] args) {
    Email em1 = new Email("John", "Doe");
    em1.setAlternateEmail("bob@gmail.com");
    System.out.println(em1.getAlternateEmail());
  }
}
