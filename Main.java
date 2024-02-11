import java.util.Scanner;

class TruthTable{
    int var;
    int[][] masterArray = new int[(int)Math.pow(2, var)][var];

    public void TruthTableGenerator(){
        for(int i = 0 ; i < masterArray.length ; i++){
            int temp = i;
            for(int j = 0 ; j < masterArray[i].length ; j++){
                if((int)Math.pow(2, masterArray[i].length - j - 1) <= temp){
                    masterArray[i][j] = 1;
                    temp -= (int)Math.pow(2, masterArray[i].length - j - 1);
                }else{
                    masterArray[i][j] = 0;
                }
            }
        }
    }
    // Printing Truth Table
    public void DisplayTruthTable(){ 
        for(int i = 0 ; i < masterArray.length ; i++){
            System.out.print("| ");
            for(int j = 0 ; j < masterArray[i].length ; j++){
                System.out.print(masterArray[i][j] + " | ");
            }
            System.out.println();
            for(int k = 0 ; k < (var * 4) + 1 ; k ++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

class Main{
    public static void main(String[] args) {
        TruthTable obj = new TruthTable();// Declaring objects
        Scanner scan = new Scanner(System.in); // Declaring objects

        System.out.print("Enter number of variables : ");
        obj.var = scan.nextInt(); // Invoking members and methods
        obj.masterArray = new int[(int)Math.pow(2, obj.var)][obj.var];

        System.out.print("| ");
        for(char i = 65 ; i < 65 + obj.var ; i++){
            System.out.print(i + " | ");
        }
        System.out.println();
        for(int k = 0 ; k < (obj.var * 4) + 1 ; k ++){
            System.out.print("-");
        }
        System.out.println();
        

        obj.TruthTableGenerator();
        obj.DisplayTruthTable();
    }
}