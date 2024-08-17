import java.util.Scanner;

public class GradeBookApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating gradeBook1 using the default constructor
        GradeBook gradeBook1 = new GradeBook();

        // Display initial details of gradeBook1
        System.out.println("GradeBook 1 Initial Details:");
        System.out.println(gradeBook1.toString());

        // Getting input from user to create gradeBook2
        String[] moduleNames = new String[5];
        int[] marks = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter module name " + (i + 1) + ": ");
            moduleNames[i] = scanner.nextLine();
            System.out.print("Enter marks for " + moduleNames[i] + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Creating gradeBook2 with specific module names and marks
        GradeBook gradeBook2 = new GradeBook(moduleNames, marks);

        // Displaying details of gradeBook2
        System.out.println("GradeBook 2 Details:");
        System.out.println(gradeBook2.toString());

        // Update a specific mark in gradeBook2
        System.out.print("Enter the index of the module to update (0-4): ");
        int index = scanner.nextInt();
        System.out.print("Enter the new mark: ");
        int newMark = scanner.nextInt();

        gradeBook2.updateMark(index, newMark);

        // Display updated details of gradeBook2
        System.out.println("Updated GradeBook 2 Details:");
        System.out.println(gradeBook2.toString());

        scanner.close();
    }
}


 class GradeBook {
    private String[] moduleNames;
    private int[] marks;

    // Default constructor initializing with empty module names and zero marks
    public GradeBook() {
        this.moduleNames = new String[]{"", "", "", "", ""};
        this.marks = new int[5]; // Automatically initializes to 0
    }

    // Parameterized constructor to initialize with given module names and marks
    public GradeBook(String[] moduleNames, int[] marks) {
        if (moduleNames.length == 5 && marks.length == 5) {
            this.moduleNames = moduleNames;
            this.marks = marks;
        } else {
            throw new IllegalArgumentException("There must be exactly 5 module names and 5 marks.");
        }
    }

    // Method to update the mark for a specific module by index
    public void updateMark(int index, int newMark) {
        if (index >= 0 && index < 5) {
            this.marks[index] = newMark;
        } else {
            throw new IndexOutOfBoundsException("Index must be between 0 and 4.");
        }
    }

    // Getter for module names
    public String[] getModuleNames() {
        return moduleNames;
    }

    // Getter for marks
    public int[] getMarks() {
        return marks;
    }

    // Overriding the toString() method to display all module names and marks
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append("Module Name: ").append(moduleNames[i])
                  .append(", Mark: ").append(marks[i]).append("\n");
        }
        return result.toString();
    }
}

