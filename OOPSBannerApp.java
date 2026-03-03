/**
 * OOPSBannerApp
 * UC4: Display OOPS in Banner Format using String Array and Loop
 * @author Jagandeepak
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String Array to store 7 lines
        String[] banner = new String[7];

        // Populate array using String.join()
        banner[0] = String.join("",
                "  *****     *****     ******    *****  ");
        banner[1] = String.join("",
                " *     *   *     *   *     *   *     * ");
        banner[2] = String.join("",
                " *     *   *     *   *     *   *       ");
        banner[3] = String.join("",
                " *     *   *     *   ******     *****  ");
        banner[4] = String.join("",
                " *     *   *     *   *               * ");
        banner[5] = String.join("",
                " *     *   *     *   *         *     * ");
        banner[6] = String.join("",
                "  *****     *****    *          *****  ");

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}