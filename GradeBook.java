
public class GradeBook {
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
