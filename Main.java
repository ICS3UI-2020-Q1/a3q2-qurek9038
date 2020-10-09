import java.util.Scanner;
/**
 *This program will correctly name the animal based on the choices giving the user yes or no answers
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create the scanner for user input
    Scanner input = new Scanner (System.in);

    //Ask the user if the animal has feathers
    System.out.println("Does the animal have feathers?");
    String feathers = input.nextLine();
    if (feathers.equals("yes")){
      System.out.println("Does the animal swim?");
      String feathersSwim = input.nextLine();
    
      if (feathersSwim.equals("yes")){
        System.out.println("you have a Duck");
      }else if (feathersSwim.equals("no")){
        System.out.println("you have a Hen");

      }
    }else if (feathers.equals("no")){
      System.out.println("Does the animal have legs?");
      String feathersLegs = input.nextLine();

      if (feathersLegs.equals("yes")){
        System.out.println("you have a Lizard");
      }else if (feathersLegs.equals("no")){
        System.out.println("you have a Snake");
