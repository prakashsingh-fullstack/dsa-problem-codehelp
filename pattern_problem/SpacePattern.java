public class SpacePattern {
    
    /* Pattern Space with Start
     *    *
     *   **
     *  ***
     * ****
     */
    void spaceWithStart(int n) {
        int row = 1;
        while(row<=n) {
            int space = n - row;
            int col = 1;
            while(col <= space){
                System.out.print(" ");
                col++;
            }
            while(col <= n){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    /* Pattern Space with Start Problem 2 
     * ****
     * ***
     * **
     * *
    */
    void spaceWithStartHomeWork(int n) {
        int row = 1;
        while(row <= n) {
            int col = n-(row -1);
            while(col>0){
                System.out.print("*");
                col--;
            }
            System.out.println();
            row++;
        }
    }

    /* Pattern Space with Start Problem 2 
     * 1234
     *  234
     *   34
     *    4
    */
    void spaceWithStartHomeWork2(int n) {
        int row = 1;
        while(row <= n) {
           int space = row-1;
           int col = space;
           while(space > 0 ){
            System.out.print(" ");
            space--;
           }
           while(col<n){
            System.out.print(col+1);
            col++;
           }
           System.out.println();
           row++;
        }
    }

    /* Pattern Problem Assignment
     * 
     * 1234554321
     * 1234**4321
     * 123****321
     * 12******21
     * 1********1
     * 
     */
    void patternAssignment(int n){
        int row = 1;
        while(row<=n) {
            int col1 = 1;
            while(col1<= (n-(row-1))) {
                System.out.print(col1);
                col1++;
            }

            int col2 = (row-1)*2;
            while(col2>0){
                System.out.print("*");
                col2--;
            }

            int col = (n-(row-1));
            while(col>=1) {
                System.out.print(col);
                col--;
            }
            System.out.println();
            row++;
        }
    }

     /* Another Problem
     *    1   
     *   121  
     *  12321
     * 1234321
     */

    public static void main(String[] args) {
        SpacePattern pattern = new SpacePattern();
        pattern.spaceWithStart(4);
        pattern.spaceWithStartHomeWork2(4);
        pattern.patternAssignment(5);
    }
}
