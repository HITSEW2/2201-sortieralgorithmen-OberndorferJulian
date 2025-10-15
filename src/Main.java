public class Main {
    public static void main(String[] args) {

        String[] namen = {"Lukas", "Martha", "Noah", "Elias", "Sophie", "Finn", "Jonas", "Emma", "Paul", "Ben", "Mia", "Maximilian", "Hannah", "Felix", "Niklas"};


        System.out.println(" Bubble Sort");
        bubbleSort(namen);
        for (String name : namen) {
            System.out.print(name + " ");
        }


        String[] namen2 = {"Lukas", "Martha", "Noah", "Elias", "Sophie", "Finn", "Jonas", "Emma", "Paul", "Ben", "Mia", "Maximilian", "Hannah", "Felix", "Niklas"};

        System.out.printf("%n");

        System.out.println("Selection Sort ");
        selectionSort(namen2);
        for (String name : namen2) {
            System.out.print(name + " ");
        }

        System.out.printf("%n");
    }


    public static void bubbleSort(String[] namen) {
        for (int i = 0; i < namen.length - 1; i++) {
            for (int j = 0; j < namen.length - i - 1; j++) {
                if (namen[j].compareTo(namen[j + 1]) > 0) {
                    String temp = namen[j];
                    namen[j] = namen[j + 1];
                    namen[j + 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(String[] namen) {
        for (int i = 0; i < namen.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < namen.length; j++) {
                if (namen[j].compareTo(namen[minIndex]) < 0) {
                    minIndex = j;
                }
            }

        }
    }
}
