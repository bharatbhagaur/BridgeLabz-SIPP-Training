import java.util.Scanner;

public class FriendStats {
    public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        int idx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                idx = i;
            }
        }
        return idx; // index of youngest
    }

    public static int findTallest(int[] heights) {
        int maxHeight = heights[0];
        int idx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                idx = i;
            }
        }
        return idx; // index of tallest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngestIdx = findYoungest(ages);
        int tallestIdx = findTallest(heights);

        System.out.println("Youngest friend is " + names[youngestIdx] + " (Age: " + ages[youngestIdx] + ")");
        System.out.println("Tallest friend is " + names[tallestIdx] + " (Height: " + heights[tallestIdx] + " cm)");
    }
}
