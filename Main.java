import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2


        System.out.println("\n\n Q1 output: ");


        System.out.println("please determine the length of the array you want \n must be greater or equal to 2: ");
        int array_len = scanner.nextInt();

        if (array_len < 2 ) {
            System.out.println("Try again ... enter a number greater than 2 ");
            array_len = scanner.nextInt();
        }
        int[] numbers_array = new int[array_len];

        System.out.println("Please enter " + array_len + " numbers to the array: ");

        for (int i = 0; i < numbers_array.length; i++) {
            numbers_array[i] = scanner.nextInt();
        }

        if ( numbers_array[0] == numbers_array[numbers_array.length-1]) {
            System.out.println(true + ",  the first element = the last element.");
        }else System.out.println(false + ",  the first element != the last element.");





//        2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

        System.out.println("\n\n Q2 output: ");


        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Please enter 7 numbers to the array: ");

        for (int i = 0; i < 7; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("the entered array is: " + list);

        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());

        System.out.println("the array after sorted reversely: " + list);

        System.out.println("Now enter one number to print the largest elements of this number: ");
        int entered_number = scanner.nextInt();

        System.out.print(entered_number + " largest elements of the array are : ");
        for (int i = 0; i < entered_number; i++) {
            System.out.print(list.get(i) + " ");
        }





//        3.Write a Java program to find the numbers greater than the average of the numbers of a given array.


        System.out.println("\n\n Q3 output: ");


        System.out.println("please enter the size of the list: ");
        int list_size = scanner.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Please enter " + list_size + " numbers to get the average: ");

        for (int i = 0; i < list_size; i++) {
            arr.add(scanner.nextInt());
        }

        System.out.println("the array : " + arr);

        int sum = 0;
        double average = 0;

        for ( int num : arr ) {
            sum += num;
        }

        average = sum / (double) arr.size();
        System.out.println("the average of array is: " + average);

        System.out.print("And the numbers that greater than average: ");
        for ( int num : arr ) {
            if (num > average)
                System.out.print(num + " ");
        }





//        4.Write a Java program to get the larger value between first and last element of an array of integers.


        System.out.println("\n\n Q4 output: ");


        ArrayList<Integer> numbers_list = new ArrayList<>();
        System.out.println("Please enter 3 numbers to the array: ");

        for (int i = 0; i < 3; i++) {
            numbers_list.add(scanner.nextInt());
        }

        int largest = numbers_list.get(0);
        int t = 0;
        for (int i = 0; i < numbers_list.size(); i++) {

            if (largest <= numbers_list.get(i)) {
                t = numbers_list.get(i);
            }
        }
        System.out.println("Larger value between first and last element: " + t);




//        5.Write a Java program to swap the first and last elements of an array and create a new array.


        System.out.println("\n\n Q5 output: ");


        System.out.println("enter the size of array you want: ");
        int sizeOfArr = scanner.nextInt();

        int[] array1 = new int[sizeOfArr];

        System.out.println("now enter elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("the origin array: " + Arrays.toString(array1));

        int[] array2 = array1;

        int temp = 0;

        temp = array2[0];
        array2[0] = array2[array2.length-1];
        array2[array2.length-1] = temp;

        System.out.println("the new array after swapping the first and last elements: " + Arrays.toString(array2));



//        6.Write a Java program to find all of the longest word in a given dictionary.

        System.out.println("\n\n Q6 output: ");

        String[] words = new String[5];
        ArrayList<String> longest_words = new ArrayList<>();

        System.out.println("enter your dictionary to find all longest words: ");

        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }



        int longest = 0;

        for (int i = 0; i < words.length; i++) {
            int current_length = words[i].length();
            if (current_length > longest) {
                longest = current_length;
                longest_words.clear();
            }
            if (current_length == longest) longest_words.add(words[i]);
        }
        System.out.println("Result: " + longest_words);



//      7.Write a menu driven Java program with following option:

        System.out.println("\n\n Q7 output: ");


        ArrayList<Integer> user_array = new ArrayList<>();

        System.out.println("before start the menu .. enter the size of array you want: ");
        int arr_size = scanner.nextInt();

        do {
            System.out.println("\nPlease select one option: "
                    + "\n 1.Accept elements of an array."
                    + "\n 2.Display elements of an array. "
                    + "\n 3.Search the element within array. "
                    + "\n 4.Sort the array. "
                    + "\n 5.Stop.");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println("please enter " +arr_size+ " number of the array: ");
                for (int i = 0; i < arr_size; i++) {
                    user_array.add(scanner.nextInt());
                }
            } else if (option == 2) {
                if (user_array.isEmpty()) {
                    System.out.println("please enter " +arr_size+ " number of the array: ");
                    for (int i = 0; i < arr_size; i++) {
                        user_array.add(scanner.nextInt());
                    }
                }
                System.out.println("elements of array are: " + user_array);
            } else if (option == 3) {
                if (user_array.isEmpty()) {
                    System.out.println("please enter " +arr_size+ " number of the array: ");
                    for (int i = 0; i < arr_size; i++) {
                        user_array.add(scanner.nextInt());
                    }
                }
                System.out.println("please enter a number to search it in array: ");
                int search_element = scanner.nextInt();
                for ( int e : user_array ){
                    if (e == search_element)
                        System.out.println("the element is in index " + user_array.indexOf(e));
                }
            } else if (option == 4) {
                if (user_array.isEmpty()) {
                    System.out.println("please enter " +arr_size+ " number of the array: ");
                    for (int i = 0; i < arr_size; i++) {
                        user_array.add(scanner.nextInt());
                    }
                }
                System.out.println("the origin array: " + user_array);
                user_array.sort(Comparator.naturalOrder());
                System.out.println("the sorted array: " + user_array);
            } else if (option == 5) {
                System.out.println("you exit the menu...");
                break;
            } else System.out.println("invalid entry...");
        }while (true);




//        8. Write a program thats displays the number of occurrences of an element in the array.


        System.out.println("\n\n Q8 output: ");


        System.out.println("please enter the size of array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Now enter the " + size + " numbers: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("your array =  " + Arrays.toString(nums));

        System.out.println("enter a number to count how much times occurs: ");
        int number_search = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number_search) {
                count++;
            }
        }

        System.out.println(number_search + " occurs " + count + " times");




//        9. Write a program that places the odd elements of an array before the even elements.

        System.out.println("\n\n Q9 output: ");


        ArrayList<Integer> all_numbers = new ArrayList<>();
        ArrayList<Integer> even_numbers = new ArrayList<>();
        ArrayList<Integer> odd_numbers = new ArrayList<>();
        ArrayList<Integer> odd_even = new ArrayList<>();

        System.out.println("please enter 5 numbers in the array: ");
        for (int i = 0; i < 5; i++) {
            all_numbers.add(scanner.nextInt());
        }


        for ( int n : all_numbers ) {
            if(n % 2 == 0) {
                even_numbers.add(n);
            }else odd_numbers.add(n);
        }

        odd_even.addAll(odd_numbers);
        odd_even.addAll(even_numbers);

        System.out.println("result: " + odd_even);




//        10. Write a program that test the equality of two arrays.

        System.out.println("\n\n Q10 output: ");


        ArrayList<Integer> first_arr = new ArrayList<>();
        ArrayList<Integer> second_arr = new ArrayList<>();

        System.out.println("please enter 5 numbers in the first array: ");
        for (int i = 0; i < 5; i++) {
            first_arr.add(scanner.nextInt());
        }

        System.out.println("please enter 5 numbers in the second array: ");
        for (int i = 0; i < 5; i++) {
            second_arr.add(scanner.nextInt());
        }

        if (first_arr.equals(second_arr))
            System.out.println(true + ",  the two arrays are equal..");
        else System.out.println(false + ",  the two arrays are not equal..");


    }
}
