import java.util.ArrayList;
import java.util.Scanner;

public class Array_Manipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitter = input.split(" ");
        int[] arr = new int[splitter.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(splitter[i]);
        }

        input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "exchange":
                    arr = exchange(arr, Integer.parseInt(commands[1]));
                    break;
                case "max":
                    maxEvenOdd(arr, commands[1]);
                    break;
                case "min":
                    minEvenOdd(arr, commands[1]);
                    break;
                case "first":
                    firstEvenOdd(arr, Integer.parseInt(commands[1]), commands[2]);
                    break;
                case "last":
                    lastEvenOdd(arr, Integer.parseInt(commands[1]), commands[2]);
                    break;
            }
            input = scanner.nextLine();
        }

        String arrayToString = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arrayToString += arr[i] + "]";
                break;
            }
            arrayToString += arr[i] + ", ";
        }
        System.out.println(arrayToString);
    }

    private static int[] exchange(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
            return arr;
        }
        int[] newArr = new int[arr.length];
        int count = 0;
        for (int i = index + 1; i < arr.length; i++) {
            newArr[count++] = arr[i];
        }
        for (int i = 0; i <= index; i++) {
            newArr[count++] = arr[i];
        }
        return newArr;
    }

    private static void maxEvenOdd(int[] arr, String command) {
        if (command.equals("even")) {
            int maxEvenIndex = maxEven(arr);
            if (maxEvenIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(maxEvenIndex);
            }
        } else {
            int maxOddIndex = maxOdd(arr);
            if (maxOddIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(maxOddIndex);
            }
        }
    }

    private static int maxEven(int[] arr) {
        int maxEvenIndex = -1;
        int maxEvenNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxEvenNumber) {
                maxEvenNumber = arr[i];
                maxEvenIndex = i;
            }
        }
        return maxEvenIndex;
    }

    private static int maxOdd(int[] arr) {
        int maxOddIndex = -1;
        int maxOddNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxOddNumber) {
                maxOddNumber = arr[i];
                maxOddIndex = i;
            }
        }
        return maxOddIndex;
    }

    private static void minEvenOdd(int[] arr, String command) {
        if (command.equals("even")) {
            int minEvenIndex = minEven(arr);
            if (minEvenIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(minEvenIndex);
            }
        } else {
            int minOddIndex = minOdd(arr);
            if (minOddIndex == -1) {
                System.out.println("No matches");
            } else {
                System.out.println(minOddIndex);
            }
        }
    }

    private static int minEven(int[] arr) {
        int minEvenIndex = -1;
        int minEvenNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minEvenNumber) {
                minEvenNumber = arr[i];
                minEvenIndex = i;
            }
        }
        return minEvenIndex;
    }

    private static int minOdd(int[] arr) {
        int minOddIndex = -1;
        int minOddNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minOddNumber) {
                minOddNumber = arr[i];
                minOddIndex = i;
            }
        }
        return minOddIndex;
    }

    private static void firstEvenOdd(int[] arr, int count, String command) {
        if (count <= 0 || count > arr.length) {
            System.out.println("Invalid count");
            return;
        }
        if (command.equals("even")) {
            firstEven(arr, count);
        } else {
            firstOdd(arr, count);
        }
    }

    private static void firstEven(int[] arr, int count) {
        String evenNums = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && count > 0) {
                count--;
                if (count == 0) {
                    evenNums += arr[i] + "]";
                    break;
                }
                evenNums += arr[i] + ", ";
            }
        }
        if (evenNums.equals("[")) {
            System.out.println("[]");
        } else if (count > 0) {
            evenNums = evenNums.substring(0, evenNums.length() - 2);
            evenNums += "]";
            System.out.println(evenNums);
        } else {
            System.out.println(evenNums);
        }
    }

    private static void firstOdd(int[] arr, int count) {
        String oddNums = "[";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && count > 0) {
                count--;
                if (count == 0) {
                    oddNums += arr[i] + "]";
                    break;
                }
                oddNums += arr[i] + ", ";
            }
        }
        if (oddNums.equals("[")) {
            System.out.println("[]");
        } else if (count > 0) {
            oddNums = oddNums.substring(0, oddNums.length() - 2);
            oddNums += "]";
            System.out.println(oddNums);
        } else {
            System.out.println(oddNums);
        }
    }

    private static void lastEvenOdd(int[] arr, int count, String command) {
        if (count <= 0 || count > arr.length) {
            System.out.println("Invalid count");
            return;
        }
        if (command.equals("even")) {
            lastEven(arr, count);
        } else {
            lastOdd(arr, count);
        }
    }

    private static void lastEven(int[] arr, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        String evenNums = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0 && count > 0) {
                count--;
                list.add(0, arr[i]);
                if (count == 0) {
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                evenNums += list.get(i) + "]";
                break;
            }
            evenNums += list.get(i) + ", ";
        }

        if (evenNums.equals("[")) {
            System.out.println("[]");
        } else{
            System.out.println(evenNums);
        }
    }

    private static void lastOdd(int[] arr, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        String oddNums = "[";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0 && count > 0) {
                count--;
                list.add(0, arr[i]);
                if (count == 0) {
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                oddNums += list.get(i) + "]";
                break;
            }
            oddNums += list.get(i) + ", ";
        }

        if (oddNums.equals("[")) {
            System.out.println("[]");
        } else {
            System.out.println(oddNums);
        }
    }
}
