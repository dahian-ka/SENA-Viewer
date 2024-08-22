import java.util.Scanner;

public class SenaViewer {
    private Scanner scanner;

    public SenaViewer() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    handleMovies();
                    break;
                case 2:
                    handleSeries();
                    break;
                case 3:
                    handleBooks();
                    break;
                case 4:
                    handleMagazines();
                    break;
                case 5:
                    generateGeneralReport();
                    break;
                case 6:
                    generateDailyReport();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("=== SENA Viewer ===");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("7. Exit");
        System.out.print("Please enter your choice: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    private void handleMovies() {
        System.out.println("Handling movies...");
        // Add code to manage movies
        // For example: listMovies(), viewMovie(), etc.
    }

    private void handleSeries() {
        System.out.println("Handling series...");
        // Add code to manage series
        // For example: listSeries(), viewSeries(), etc.
    }

    private void handleBooks() {
        System.out.println("Handling books...");
        // Add code to manage books
        // For example: listBooks(), viewBook(), etc.
    }

    private void handleMagazines() {
        System.out.println("Handling magazines...");
        // Add code to manage magazines
        // For example: listMagazines(), viewMagazine(), etc.
    }

    private void generateGeneralReport() {
        System.out.println("Generating general report...");
        // Add code to generate a general report
    }

    private void generateDailyReport() {
        System.out.println("Generating daily report...");
        // Add code to generate a daily report
    }

    public static void main(String[] args) {
        SenaViewer viewer = new SenaViewer();
        viewer.start();
    }
}

