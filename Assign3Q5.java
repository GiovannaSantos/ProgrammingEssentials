public class Assign3Q5 {
    public static void main(String args[]) {

     int asteriscosLines = 4;
     int asteriscosColumns = 10;
     int asteriscosLine = 0;
     while (asteriscosLine < asteriscosLines) {
         int asteriscosColumn = 0;
         while (asteriscosColumn < asteriscosColumns) {
             System.out.print("*");
             asteriscosColumn++;
         }
         System.out.println();
         asteriscosLine++;
    }

     int triangleLines = 5;
     int triangleLine = 0;
     while (triangleLine < triangleLines) {
         int triangleColumn = 0;
         while (triangleColumn <= triangleLine) {
             System.out.print("*");
             triangleColumn++;
         }
         System.out.println();
         triangleLine++;
     }
     
     int invertedLines = 5;
     int invertedLine = 0;
     while (invertedLine < invertedLines) {
         int invertedColumns = 0;
         while (invertedColumns < 4 - invertedLine) {
             System.out.print(" ");
             invertedColumns++;
         }
         int invertedColumn = 0;
         while (invertedColumn <= invertedLine) {
             System.out.print("*");
             invertedColumn++;
         }
         System.out.println();
         invertedLine++;
     }

        int lines = 5; 
        int spaces = lines - 1;
        int asteriscos = 1;
        
        int line = 1;
        while (line <= lines) {
            int spaceCounter = 1;
            while (spaceCounter <= spaces) {
                System.out.print(" ");
                spaceCounter++;
            }
            
            int asteriscosCounter = 1;
            while (asteriscosCounter <= asteriscos) {
                System.out.print("*");
                asteriscosCounter++;
            }
            
            System.out.println();
            spaces--;
            asteriscos += 2;
            line++;
        }
     
     int numericLines = 5;
     int numericLine = 0;
     while (numericLine < numericLines) {
         int numericColumns = 0;
         while (numericColumns < 5 - numericLine) {
             System.out.print(" ");
             numericColumns++;
         }
         int numericColumn = 0;
         while (numericColumn < 2 * numericLine + 1) {
             System.out.print(numericLine + 1);
             numericColumn++;
         }
         System.out.println();
         numericLine++;
        }

         int linesOne = 5;
         int lineOne = 1;
         while (lineOne <= linesOne) {
             int space = linesOne - lineOne;
             int spaceCounter = 1;
             while (spaceCounter <= space) {
                 System.out.print(" ");
                 spaceCounter++;
             }
             
             int numbersCounter = lineOne;
             while (numbersCounter >= 1) {
                 System.out.print(numbersCounter);
                 numbersCounter--;
             }
             
             numbersCounter = 2;
             while (numbersCounter <= lineOne) {
                 System.out.print(numbersCounter);
                 numbersCounter++;
             }
             
             System.out.println();
             lineOne++;
            }
        }
     }