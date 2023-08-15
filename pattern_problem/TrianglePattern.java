public class TrianglePattern {
    
    /* Print Start count as number of rows like
     *  *
     *  * *
     *  * * *
     *  * * * *
     */
    void printStartCount(int n) {
        int row= 1;
        while(row<=n) {
            int col = 1;
            while(col<=row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    /* Print Pattern as increment count
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10 
     */

     void printTriagleIncrement(int n) {
        int row = 1;
        int count =1;
        while(row <= n) {
            int col = 1;
            while(col <= row) {
                System.out.print(count +" ");
                count++;
                col++;
            }
            System.out.println();
            row ++;
        }
     }

     /* Print below pattern Problem 
      * 1
      * 2 3
      * 3 4 5
      * 4 5 6 7
      */
    void printNewPattern(int n) {
        int row =1;
        while(row <= n) {
            int col =0;
            while(col < row) {
                System.out.print((row + col) +" ");
                col ++;
            }
            System.out.println();
            row ++;
        }
    }

    /* Albhabets pattern like:
     * A A A
     * B B B
     * C C C
     */
    void printAlphbhetsPattern(int n){
        int row =1;
        while(row<=n){
            int col = 0;
            while(col<=n){
                char ch = (char) ('A' + (row -1));    
                System.out.print(ch +" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    /* Print counting Albhabets like
     * A
     * B C
     * D E F
     * G H I J
     */
    void printCountingAlphabets(int n) {
        int row = 1;
        int count = 0;
        while(row <= n) {
            int col = 0;
            while(col < row) {
                char ch = (char)('A'+ count);
                System.out.print(ch +" ");
                col++;
                count++;
            }
            System.out.println();
            row++;
        }
    }

    /* Print Alphabets problems
     * D
     * C D
     * B C D
     * A B C D
     */

    void printFinalAlphabetProblem(int n) {
        int row = 1;
        while(row <= n) {
            int col = 0;
            char ch = (char) ('A' + n-row);
            while(col < row) {
                char updatedCharacter = (char)(ch + col);
                System.out.print(updatedCharacter +" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Triagle Pattern Problem ");
        TrianglePattern pattern = new TrianglePattern();
        pattern.printStartCount(4);
        System.out.println("Triagle Pattern Problem Increment ");
        pattern.printTriagleIncrement(5);
        System.out.println("Triagle New Pattern Problem Increment ");
        pattern.printNewPattern(4);
        System.out.println("Print Alphabets Problem Pattern ");
        pattern.printAlphbhetsPattern(4);
        System.out.println("Print Counting Alphabets Problem Pattern ");
        pattern.printCountingAlphabets(4);
        System.out.println("Print Alphabets final Problem Pattern ");
        pattern.printFinalAlphabetProblem(4);
    }
}
