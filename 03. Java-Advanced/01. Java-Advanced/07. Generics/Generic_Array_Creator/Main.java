package Generic_Array_Creator;

class Main {
    public static void main(String[] args) {
        String[] arr1 = ArrayCreator.create(5, "ASD");
        Integer[] arr2 = ArrayCreator.create(Integer.class, 15,42);

        System.out.println();
    }
}
