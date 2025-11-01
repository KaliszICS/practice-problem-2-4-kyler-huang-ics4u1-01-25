public class PracticeProblem {

    public static void main(String[] args) {
        String[] names = {"Jacob", "Eric", "Tiffany", "Alice"};
        int[] ages = {17, 17, 17, 16};

        selectionSortName(names, ages);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + ages[i]);
        }

        selectionSortAge(names, ages);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + ages[i]);
        }
    }

    public static void selectionSortName(String[] names, int[] ages) {
        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareToIgnoreCase(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;

            int tempAge = ages[i];
            ages[i] = ages[minIndex];
            ages[minIndex] = tempAge;
        }
    }

    public static void selectionSortAge(String[] names, int[] ages) {
        for (int i = 0; i < ages.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] < ages[minIndex]) {
                    minIndex = j;
                }
            }
            int tempAge = ages[i];
            ages[i] = ages[minIndex];
            ages[minIndex] = tempAge;

            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;
        }
    }
}
