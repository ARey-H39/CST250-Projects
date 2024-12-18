import src.AreaCalculator.AreaCalculator;
import src.BubbleSort.BubbleSort;
import src.PhoneBook.PhoneBook;
import src.Recursive.Recursive;
import src.WordSet.WordSet;
import util.menu.MainMenu;
import util.menu.Menu;
import util.menu.MenuItem;
import util.program.Program;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Program> programs = createPrograms();
        Menu mainMenu = createMainMenu(programs);

        mainMenu.display();
    }

    private static ArrayList<Program> createPrograms() {
        ArrayList<Program> programs = new ArrayList<>();

        programs.add(new Program("Phone Book", """
                Object-oriented phonebook application with ArrayList storage.""",
                PhoneBook.class
        ));

        programs.add(new Program("Area Calculator", """
                Area calculator app for common shapes (circles, rectangles, and cylinders).""",
                AreaCalculator.class
        ));

        programs.add(new Program("Customer Entry", """
                Object-oriented customer entry application demonstrating class inheritance.""",
                src.CustomerEntry.Main.class
        ));

        programs.add(new Program("Test Scores", """
                Test scores average calculator with error handling.""",
                src.TestScores.Main.class
        ));

        programs.add(new Program("Recursive", """
                Recursive linear search implementation that demonstrates basics of recursion.""",
                Recursive.class
        ));

        programs.add(new Program("Bubble Sort", """
                Recursive bubble sort implementation and visualizer.""",
                BubbleSort.class
        ));

        programs.add(new Program("My List", """
                Enhanced ArrayList with comparable type restriction and added methods specifically
                for those types.""",
                src.MyList.Main.class
        ));

        programs.add(new Program("Word Set", """
                Program tokenizes a string and prints out all unique words in ascending order.""",
                WordSet.class
        ));

        return programs;
    }

    private static MainMenu createMainMenu(List<Program> programs) {
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        int i = 1;
        for (Program program : programs) {
            menuItems.add(new MenuItem(i, program.getTitle(), program));
            i++;
        }
        return new MainMenu("Main Menu", null, menuItems);
    }
}
