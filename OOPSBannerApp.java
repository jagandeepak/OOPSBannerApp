<<<<<<< HEAD
=======
/**
 * OOPSBannerApp
 * UC3: Display OOPS in Banner Format using String.join()
 * @author Jagandeepak
 * @version 3.0
 */

>>>>>>> 05ccc94ed684e0073633dfa9fb1e56f7465ed566
public class OOPSBannerApp {

    // Method to generate the pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate the pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
            "*****  ",
            "*    * ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to generate the pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    // Main Method
    public static void main(String[] args) {

<<<<<<< HEAD
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print OOPS
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  "
                    + oPattern[i] + "  "
                    + pPattern[i] + "  "
                    + sPattern[i]);
        }
    }
}
        
=======
        System.out.println(String.join("",
                "  *****     ",
                " *****     ",
                " *****     ",
                " *****  "));

        System.out.println(String.join("",
                " *     *   ",
                "*     *   ",
                "*     *   ",
                "*     * "));

        System.out.println(String.join("",
                " *     *   ",
                "*     *   ",
                "*     *   ",
                "*       "));

        System.out.println(String.join("",
                " *     *   ",
                " ******    ",
                " ******    ",
                " ******* "));

        System.out.println(String.join("",
                " *     *   ",
                "*         ",
                "*               * "));

        System.out.println(String.join("",
                " *     *   ",
                "*         ",
                "*         *     * "));

        System.out.println(String.join("",
                "  *****    ",
                "*         ",
                "*          *****  "));
    }
}


>>>>>>> 05ccc94ed684e0073633dfa9fb1e56f7465ed566
