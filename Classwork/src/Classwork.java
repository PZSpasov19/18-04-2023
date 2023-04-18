import java.util.*;

public class Classwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListOfBoxes<Box<String>> boxesOfStrings = new ListOfBoxes<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            Box<String> box = new Box<>(data);
            boxesOfStrings.addElement(box);
        }
        String[] indexes = scanner.nextLine().split("\\s+");
        int firstIndex = Integer.parseInt(indexes[0]);
        int secondIndex = Integer.parseInt(indexes[1]);

        boxesOfStrings.swap(firstIndex, secondIndex);

        for (int i = 0; i < boxesOfStrings.size(); i++) {
            System.out.println(boxesOfStrings.get(i).toString());
        }
    }


}
