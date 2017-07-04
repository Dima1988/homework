public class Main {
  public static void main (String[] args) {
    // создание переменных с типами int, float и String
    int a = 1;
    float b = 1.5f;
    String s = "Home work 4";

    // Вывод их значений
    System.out.println(a);
    System.out.println(b);
    System.out.println(s);

    // вызов метода который выводит строку ***** 5 раз
    screen();
    screen();
    screen();
    screen();
    screen();

    // вызов метода который выводит строку ***** 5 раз через цикл
    for (int i = 0; i < 5; i ++) {
      screen();
    }
    int year = 2001;
  while (year <= 2017) {
    intercalaryYear(year);
    year++;
  }

   //цикл do_while с оператором break
   int e = 1;
   do {
     System.out.println("На 5-й раз цикл прекратится: " + e);
     e++;
     if (e == 6) {break;}
   } while (true);

}

// метод, который выводит строку *****
  public static void screen() {
    System.out.println("*****");
    }

  // функция определения високосного года
  public static void intercalaryYear(int year) {
    if (year %400 == 0) {
      System.out.println(year + " год високосный");
      }

    else if (year %4 == 0 && year %100 != 0) {
      System.out.println(year + " год високосный");
    }
    else {
      System.out.println(year + " год не високосный");
    }
  }

}
