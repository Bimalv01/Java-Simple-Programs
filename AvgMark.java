import java.util.Scanner;
public class AvgMark{

public void Grade(float average){
String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else if (average >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
System.out.println("The Grade is :"+grade+" |Average Mark is :"+average);
}
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int[] MarkList = new int[5];
for(int i=0;i<5;i++){
System.out.println("The mark "+(i+1)+":");
MarkList[i] =input.nextInt();
}
int total=0;
for(int mark:MarkList){
total+=mark;
}
float avg;
avg = total/5;
AvgMark AM = new AvgMark();
AM.Grade(avg);
}
}