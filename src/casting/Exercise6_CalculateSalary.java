package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        double sal1 = Double.parseDouble(salary1);
        double sal2 = Double.parseDouble(salary2);
        double sal3 = Double.parseDouble(salary3);

        System.out.println("Min salary = $" + Math.min((Math.min(sal1, sal2)), sal3));
        System.out.println("Max salary = $" + Math.max((Math.max(sal1, sal2)), sal3));

    }
}
