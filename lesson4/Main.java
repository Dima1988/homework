public class Main {
  public static void main (String[] args) {
    int a = 1;
    float b = 1.5f;
    String s = "Home work 4";
    System.out.println(a);
    System.out.println(b);
    System.out.println(s);

    screen();
    screen();
    screen();
    screen();
    screen();

    for (int i = 0; i < 5; i ++) {
      screen()
    }
  }

  public void screen(){
    System.out.println("*****");
  }
}
