package L01_BasicJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Example 1: Type Casting */

		// double a = 5.3;
		// int b = (int) a;
		//
		// System.out.println("a = " + a);
		// System.out.println("b = " + b);

        /* Example 2: Type Casting */

		// String year = "2026";
		// int year_num = Integer.parseInt(year);
		//
		// String height = "1.55";
		// double height_num = Double.parseDouble(height);
		//
		// System.out.println("Next year is " + (year_num + 1));
		// System.out.println("Height: " + height_num);

        /* Example 3 */
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("What's your age?");
		// String userAge = sc.nextLine();
		//
		// System.out.println("Are you student? (yes/no)");
		// String userStatus = sc.nextLine();
		//
		// boolean isStudent = false;
		//
		// if (userStatus.equals("yes")){
		//    isStudent = true;
		// }
		//
		// int userAgeInt = Integer.parseInt(userAge);
		//
		// double bonus = 0;
		//
		// if (userAgeInt < 18 || userAgeInt > 65){
		//    bonus = 0.2;
		//
		//    if (isStudent){
		// 	   bonus = 0.3;
		//    }
		// }
		//
		// int day = 5; // get system time
		//
		// switch (day) {
		//    case 1:
		// 	   System.out.println("Today is Monday");
		// 	   break;
		//    case 2:
		// 	   System.out.println("Today is Tuesday");
		// 	   break;
		//    case 3:
		// 	   System.out.println("Today is Wednesday");
		// 	   break;
		//    case 4:
		//    case 5:
		//    case 6:
		// 	   System.out.println("Today is a special day, so you get double in bonus.");
		// 	   bonus = bonus * 2;
		// 	   break;
		//    case 7:
		// 	   System.out.println("Today is Sunday");
		// 	   break;
		// }
		//
		//
		// System.out.println("Your bonus is " + (bonus*100) + "%");

        /* Example 4: For loop */

		// for (int i = 0; i < 5; i++) {
		//    if (i == 2) continue;
		//    System.out.println(i);
		// }


        /* Example 5: While loop */

		// int i = 0;
		// while (i < 5) {
		//    System.out.println(i);
		//    i++;
		// }

        /* Example 6: Arrays */

        // option 1
		// int[] numbers = new int[5];
		// numbers[0] = 10;
		// numbers[1] = 20;
		// numbers[2] = 30;

		// option 2
		// int[] numbers = {10, 20, 30, 40};
		//
		// for (int i = 0; i < numbers.length; i++){
		//    System.out.println(numbers[i]);
		// }

        /* Example 7: Methods */

        sayHello();

        sayHello("John");
        sayHello("Hai");
        sayHello(5);

    }

    public static void sayHello(){
        System.out.println("Hello World!");
    }



    public static void sayHello(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Hello 2026!");
        }
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
