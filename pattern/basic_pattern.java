package pattern;

public class basic_pattern {
  public static void main(String[] args) {
    /*
     * SPECIAL
     ****
     ****
     ****
     ****
     */

    // int n = 4;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int j = 1; j<=n; j++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    /*
     * 1 - SOLID RECTANGLE:-
     *****
     *****
     *****
     *****
     */
    // for(int i = 1; i<=4; i++){
    // for(int x = 1; x<=5; x++){
    // System.out.print("*");

    // }
    // System.out.print("\n");
    // }

    /*
     * 2 - HOLLOW RECTANGLE:-
     *****
     * *
     * *
     *****
     * 
     */
    // int n = 4;
    // int m = 5;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=m; j++){
    // if(i==1 || i==n || j==1 || j==m)
    // System.out.print("*");
    // else
    // System.out.print(" ");

    // }
    // System.out.print("\n");
    // }

    /*
     * 3 - HALF PYRAMID:- (row no. = total column)
     *
     **
     ***
     **** 
     */
    // int n = 4;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.print("\n");
    // }

    /*
     * 4 - INVERTED HALF PYRAMID:-
     ****
     ***
     **
     *
     */
    // int n = 4;
    // for(int i = 1; i<=n; i++){
    // for(int j = 4; j>=i; j--){
    // System.out.print("*");
    // }
    // System.out.print("\n");
    // }
    // OR
    // for(int i = n; i>=1; i--){
    // for(int j = 1; j<=i; j++){
    // System.out.print("*");
    // }
    // System.out.print("\n");
    // }

    /*
     * 5 - INVERTED HALF PYRAMID(rotated by 180 deg)
     *
     **
     ***
     ****
     */
    // int n = 4;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=n-i; j++){
    // System.out.print(" ");
    // }
    // for(int k = 1; k<=i; k++){
    // System.out.print("*");
    // }
    // System.out.print("\n");
    // }

    /*
     * 6 - NUMBER PYRAMID:-
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */

    // int n = 5;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=i; j++){
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    /*
     * 7 - INVERTED NUMBER PYRAMID:-
     * 12345
     * 1234
     * 123
     * 12
     * 1
     */

    // int n = 5;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=n-i+1 ; j++){
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    /*
     * 8 - FLYOD'S TRIANGLE:-
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */
    // int n = 5;
    // int count = 1;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=i; j++){
    // System.out.print(count + " ");
    // count++;
    // }
    // System.out.println();;
    // }

    /*
     * 9 - 0-1 TRIANGLE:-
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    // int n = 5;
    // int count1 = 0;
    // int count2 = 1;
    // for(int i = 1; i<=n; i++){
    // for(int j = 1; j<=i; j++){
    // if((i+j)%2!=0){
    // System.out.print(count1);
    // }else{
    // System.out.print(count2);
    // }
    // }
    // System.out.println();
    // }

    /*
    *****
       *
      *
     *
    *****
     */
    // int rows = 5;
    // int cols = 5;
    // for (int i = 1; i <= rows; i++) {
    // for (int j = 1; j <= cols; j++) {
    // if (i == 1 || i == rows) {
    // System.out.print("*");
    // } else if (i == cols - j + 1) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }

    // }
    // System.out.println();
    // }

  }
}
