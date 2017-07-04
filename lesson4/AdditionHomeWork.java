public class AdditionHomeWork {
    public static void main (String[] args) {

      convertBinToDec1("10011011");
    }

    public static int convertBinToDec1(String binary) {
        // your code here
        /*
         1. Это короткий путь:
        int t = Integer.parseInt(binary, 2);
         */

        // 2. А это длинный:
        int a = binary.length();  // определяю длину строки binary
        int[] b10 = new int[a];     // создаем массив int-ов длинной со строку binary для заполнения результатами возведения 2 в степень
        int[] b2 = new int[a];      // создаем массив int-ов длинной со строку binary для заполнения результатами преобразования строки binary в отдельные int-ы

         for (int z = 0; z < a; z++) {      // заполняем массив b[] результатами возведения 2 в степень  соотв. количество раз
            b10[z] = (int) Math.pow(2, z);
        }

        char[] ch = binary.toCharArray();			// строку binary превращаем в массив char-ов

        for(int c = 0; c < a; c ++ ) {     // с помощью цикла и метода digit преобразовываем массив char-ов в массив int-ов
            b2[c] = Character.digit(ch[c], 10);
        }

        int result = 0;

        int aForCycle = --a;   // создаем копи перменной а для отсчета с хвоста

        for(int d = 0; d <= a; d ++ ) {     // проверяем значения массива двоичных чисел на 0 и записываем в result сумму значений массива десятичных чисел с конца
          if (b2[d] == 1) {
          result = result + b10[aForCycle];
          }
          aForCycle --;
        }
        return result;
    }
}
