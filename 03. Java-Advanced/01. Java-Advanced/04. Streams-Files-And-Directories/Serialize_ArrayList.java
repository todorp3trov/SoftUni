import java.io.*;
import java.util.ArrayList;

public class Serialize_ArrayList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(5.13);
        list.add(19.579);
        list.add(774.5);
        list.add(11.23);
        list.add(8.9);

        ArrayList<Double> newList = new ArrayList<>();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"))) {

            out.writeObject(list);

            newList = (ArrayList) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (double num : newList) {
            System.out.println(num);
        }
    }
}
