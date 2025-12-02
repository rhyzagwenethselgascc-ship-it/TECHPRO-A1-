import java.util.Scanner;

public class SeatworkFifteen {

    // Method 1: Based on percentage
        public static String calculateGrade(double percentage) {
                if (percentage >= 90) return "A";
                        else if (percentage >= 80) return "B";
                                else if (percentage >= 70) return "C";
                                        else if (percentage >= 60) return "D";
                                                else return "F";
                                                    }

                                                        // Method 2: Based on score and max score
                                                            public static String calculateGrade(int score, int maxScore) {
                                                                    double percentage = (double) score / maxScore * 100;
                                                                            return calculateGrade(percentage);
                                                                                }

                                                                                    // Method 3: Based on multiple subject scores
                                                                                        public static String calculateGrade(double[] subjectScores) {
                                                                                                double total = 0;
                                                                                                        for (double score : subjectScores) {
                                                                                                                    total += score;
                                                                                                                            }
                                                                                                                                    double average = total / subjectScores.length;
                                                                                                                                            return calculateGrade(average);
                                                                                                                                                }

                                                                                                                                                    public static void main(String[] args) {
                                                                                                                                                            Scanner scanner = new Scanner(System.in);

                                                                                                                                                                    // 1. Using percentage
                                                                                                                                                                            System.out.print("Enter percentage score: ");
                                                                                                                                                                                    double percent = scanner.nextDouble();
                                                                                                                                                                                            System.out.println("Grade: " + calculateGrade(percent));

                                                                                                                                                                                                    // 2. Using score and max score
                                                                                                                                                                                                            System.out.print("\nEnter raw score: ");
                                                                                                                                                                                                                    int score = scanner.nextInt();
                                                                                                                                                                                                                            System.out.print("Enter maximum score: ");
                                                                                                                                                                                                                                    int max = scanner.nextInt();
                                                                                                                                                                                                                                            System.out.println("Grade: " + calculateGrade(score, max));

                                                                                                                                                                                                                                                    // 3. Using multiple subjects
                                                                                                                                                                                                                                                            System.out.print("\nEnter number of subjects: ");
                                                                                                                                                                                                                                                                    int numSubjects = scanner.nextInt();
                                                                                                                                                                                                                                                                            double[] subjects = new double[numSubjects];

                                                                                                                                                                                                                                                                                    for (int i = 0; i < numSubjects; i++) {
                                                                                                                                                                                                                                                                                                System.out.print("Enter score for subject " + (i + 1) + ": ");
                                                                                                                                                                                                                                                                                                            subjects[i] = scanner.nextDouble();
                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                            System.out.println("Final Grade: " + calculateGrade(subjects));

                                                                                                                                                                                                                                                                                                                                    scanner.close();
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        }