public class Assign3Q4 {
    public static void main(String args[]) {

     for (int iteratePyramid  = 0; iteratePyramid < 4; iteratePyramid++) {
         for (int addAsteriscos = 0; addAsteriscos < 10; addAsteriscos++) {
             System.out.print("*");
         }
         System.out.println();
     }
     
     for (int iteratePyramid = 0; iteratePyramid < 5 ; iteratePyramid++) {
         for (int addAsteriscos = 0; addAsteriscos <= iteratePyramid; addAsteriscos++) {
             System.out.print("*");
         }
         System.out.println();
     }
     
     for (int iteratePyramid = 0; iteratePyramid < 5; iteratePyramid++) {
         for (int addleftSpace = 0; addleftSpace < 4 - iteratePyramid; addleftSpace++) {
             System.out.print(" ");
         }
         for (int addAsteriscos = 0; addAsteriscos <= iteratePyramid; addAsteriscos++) {
             System.out.print("*");
         }
         System.out.println();
     }

     for (int iteratePyramid  = 1; iteratePyramid <= 5; iteratePyramid++) {
      for (int addleftSpace = 1; addleftSpace <= 5 - iteratePyramid; addleftSpace++) {
          System.out.print(" ");
      }
      for (int addAsteriscos = 1; addAsteriscos <= 2 * iteratePyramid - 1; addAsteriscos++) {
          System.out.print("*");
      }
      System.out.println();
    }

    int startNum = 1;
     for (int iteratePyramid = 0; iteratePyramid < 5; iteratePyramid++) {
         for (int addleftSpace = 0; addleftSpace < 5 - iteratePyramid; addleftSpace++) {
             System.out.print(" ");
         }
         for (int addNumber = 0; addNumber < 2 * iteratePyramid + 1; addNumber++) {
             System.out.print(startNum);
         }
         System.out.println();
         startNum++;
     }
     
      for (int iteratePyramid = 1; iteratePyramid <= 5; iteratePyramid++) {
          for (int addleftSpace = 1; addleftSpace <= 5 - iteratePyramid; addleftSpace++) {
              System.out.print(" ");
          }
          for (int descNumber = iteratePyramid; descNumber >= 1; descNumber--) {
              System.out.print(descNumber);
          }
          for (int crescNumber = 2; crescNumber <= iteratePyramid; crescNumber++) {
              System.out.print(crescNumber);
          }
          System.out.println();
        }
     }
}