

	import java.util.Scanner;

public class Student{

private static double[] scores;

public Student(int numberOfScores){
    scores = new double[numberOfScores];
}


public void takeInput(){                              // Take inputs from user
    System.out.println("Please enter scores");
    Scanner scanner = new Scanner(System.in);
    for(int i=0;i<scores.length;i++){
        scores[i] = scanner.nextDouble();
    }
}

public double getAverageScore(){                       // Calculates AverageScore
    double sum = 0;
    for(int i=0;i<scores.length;i++){
        sum += scores[i];
    }
    return sum/scores.length;
}

public double getHighestScore(){
    double highest = 0;
    for(int i=0;i<scores.length;i++){
        if(highest<scores[i]){
            highest = scores[i];
        }
    }
    return highest;
}

public void printSummary(){
    double average = getAverageScore();
    double highest = getHighestScore();

    System.out.println("Your scores are :");
    for(int i=0;i<scores.length;i++){
        System.out.println(i + " : " + scores[i]);
    }
    System.out.println("");
    System.out.println("The Highest score is : " + highest);
    System.out.println("The Average score is : " + average);
}

public static void main(String args[]){
    Student student = new Student(7);
    student.takeInput();
    student.printSummary();
}
}


