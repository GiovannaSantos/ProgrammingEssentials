public class Assign3Q2 {
    public static void main(String args[]) {
      String currentMonth = "January";
      System.out.println("The current month is: " + currentMonth);

      switch (currentMonth) {
          case "January":
          case "March":
          case "May":
          case "July":
          case "August":
          case "October":
          case "December":
              System.out.println("Number of days in " + currentMonth + ": 31");
              break;
          case "April":
          case "June":
          case "September":
          case "November":
              System.out.println("Number of days in " + currentMonth + ": 30");
              break;
          case "February":
              System.out.println("Number of days in " + currentMonth + ": 28 or 29");
              break;
          default:
              System.out.println("Invalid month entered.");
      }
    }
}
