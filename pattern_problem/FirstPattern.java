class FirstPattern {

    /* Print Pattern like following
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     */

    void printSimpleSeriesform1(int count){
        int i=0;
        while(i<count) {
            int j = 1;
            while (j<=count) {
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    /* Print Home work problem
     * 3 2 1
     * 3 2 1
     * 3 2 1
     */

     void printSeriesReverse(int count) {
        int i=0;
        while(i<count) {
            int j=0;
            while(j <count) {
                System.out.print((count-j)+" ");
                j++;
            }
            System.out.println();
            i++;
        }
     }

     /* Increment the number as now of rows 
      * 1 2 3 4 5
      * 6 7 8 9 10
      * 11 12 13 14 15
     */
     void printCountNumber(int rows) {
        int i=0;
        int count = 1;
        while(i<rows) {
            int j = 0;
            while(j<rows) {
                System.out.print(count +" ");
                count ++;
                j++;
            }
            System.out.println();
            i++;
        }
     }

    public static void main(String[] args) {
        FirstPattern firstPattern = new FirstPattern();
        System.out.println("Print Normal Series: ");
        firstPattern.printSimpleSeriesform1(4);
        System.out.println("Print Reverse Series: ");
        firstPattern.printSeriesReverse(4);
        System.out.println(" Print Count Number ");
        firstPattern.printCountNumber(5);
    }

}