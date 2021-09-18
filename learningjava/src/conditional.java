public class conditional {
    public static void main(String[] args) {
          float percent = 98.5f;
          char grade;
          if(percent >= 90){
              grade = '0';

          }
          else if(percent >= 80){
              grade = 'E';

          }
          else if(percent >=60){
              grade = 'A';
          }
          else if(percent >=40){
              grade = 'B';
          }
          else {
              grade = 'F';
          }
          System.out.println("Grade is -" + grade);
    }
}
