package List_Utilities;

import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> list1 = List.of("f", "b", "c", "d", "a", "g");
        System.out.println(ListUtils.getMin(list1));

        List<Integer> list2 = List.of(1, 5, 87, 0, -55, 123);
        System.out.println(ListUtils.getMax(list2));
    }
}
