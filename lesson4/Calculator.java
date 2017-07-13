public class Calculator {
public static void main(String[] args) {
  calc("2+2+2"); // =6
  calc("2-2+2"); // =2
  calc("2*2*2"); // =8
  calc("2+2*2"); // =6
  }

public int calc(String a) {
  char[] ch = a.toCharArray();

  int first = Character.digit(ch[0], 10);
  int second = Character.digit(ch[2], 10);
  int third = Character.digit(ch[4], 10);
  int res = 0;

        if (ch[1] == '+'){
          if (ch[3] == '+') {
            res = first + second + third;
          }
          else if (ch[3] == '-') {
            res =  first + second - third;
          }
          else if (ch[3] == '*') {
            res =  first + second * third;
          }
          else if (ch[3] == '/') {
            res =  first + second / third;
          }

        }
        else if (ch[1] == '-') {
          if (ch[3] == '+') {
            res =  first - second + third;
          }
          else if (ch[3] == '-') {
            res =  first - second - third;
          }
          else if (ch[3] == '*') {
            res =  first - second * third;
          }
          else if (ch[3] == '/') {
            res =  first - second / third;
          }
        }
        else if (ch[1] == '*') {
          if (ch[3] == '+') {
            res =  first * second + third;
          }
          else if (ch[3] == '-') {
            res =  first * second - third;
          }
          else if (ch[3] == '*') {
            res =  first * second * third;
          }
          else if (ch[3] == '/') {
            res =  first * second / third;
          }

        }
        else if (ch[1] == '/') {
          if (ch[3] == '+') {
            res =  first / second + third;
          }
          else if (ch[3] == '-') {
            res =  first /- second - third;
          }
          else if (ch[3] == '*') {
            res =  first / second * third;
          }
          else if (ch[3] == '/') {
            res =  first / second / third;
          }
        }
        return res;
     }
  }
