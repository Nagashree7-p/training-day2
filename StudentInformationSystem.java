class StudentInformationSystem {

    public static void main(String[] args) {

        // Student details
        String[] names = {"Arjun", "Bhavya", "Charan"};
        int[] ages = {20, 21, 19};
        int[] marks = {85, 90, 78};

        int totalMarks = 0;

        System.out.println("Student Information");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-5s %-6s%n", "Name", "Age", "Marks");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-10s %-5d %-6d%n", names[i], ages[i], marks[i]);
            totalMarks += marks[i];
        }

        double averageMarks = (double) totalMarks / 3;

        System.out.println("----------------------------------------");
        System.out.printf("Average Marks: %.2f%n", averageMarks);
    }
}