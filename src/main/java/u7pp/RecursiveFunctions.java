package u7pp;

public class RecursiveFunctions {
    RecursiveFunctions(){
    }
  //takes param and returns factorial
    public static double factorial(int input){
        if (input <= 1){
            return 1;
 }else {
return input*factorial((input-1));
}
}
    //takes base and returns it to the power it was raised too
    public static Double pow(double base, int exp) {
        if (exp == 0){
            return 1.0;
        }
        else{
            return base * pow(base, exp-1);
        }
    }
//takes param and returns position on fibonacci
    public static Integer fibonacci(int digit) {
        if(digit == 1 || digit == 0){
            return digit;
        }else{
        return fibonacci(digit-1) + fibonacci(digit -2);
        }
    }
//returns whether param is palindrome
    public static boolean isPalindrome(String string) {
        if (string.length() == 1 || string.length() == 0){
            return true;
        }
        else if (string.charAt(0) ==(string.charAt(string.length()-1))){
            return isPalindrome(string.substring(1,string.length()-1));
        }
        return false;
    }
//takes in array and returns count of adjacent int pairs
    public static Integer nextIsDouble(int[] data, int i) {
        if (data.length == 0 || data.length == 1 || data[i] == data[i+1]){
            return 0;
        }
        if (i+1 >= data.length-1){
            return 1;
        }
        else if(data[i+1] / data[i] == 2){
            return 1 + nextIsDouble(data, i+1);
        }
        return nextIsDouble(data, i+1);
    }
//param takes in number and returns string of position
    public static String getBinary(int num) {
        if (num == 0){
            return "0";
        }
        if (num == 1){
            return "1";
        }
        else {
            return getBinary(num/2) + getBinary(num%2);
        }
    }
//takes in param and int and returns it if it is in the array, otherwise -1
    public static Integer binarySearch(int[] list, int num, int start, int end) {
        if (start>end){
            return -1;
        }int mid = (start+end)/2;
        if (num == list[mid]){
        return mid; 
        }
        else if (num < list[mid]){
        return binarySearch(list, num, start, mid -1);
        }
        else {
        return binarySearch(list, num, mid + 1, end);
        }
    }
//returns true if at location given and false otherwise, coords can move drop
    public static boolean canFlowOffMap(int[][] map, int row, int col) {
        if (row + 1 >= map.length || row -1 < 0 || col + 1 >= map[0].length || col -1 < 0){
            return true;
        }
        else if (map[row][col - 1] < map [row][col] && canFlowOffMap(map, row, col-1)){
            return true;
        }
        else if (map[row][col + 1] < map [row][col] && canFlowOffMap(map, row, col+1)){
            return true;
        }
        else if (map[row - 1][col] < map [row][col] && canFlowOffMap(map, row -1, col)){
            return true;
        }
        else if (map[row + 1][col] < map [row][col] && canFlowOffMap(map, row +1, col)){
            return true;
        }
        else {
            return false;
        }
    }
}