package DSA.DSA_Practice_Problems;

public class p12 {
    //1491. Average Salary Excluding the Minimum and Maximum Salary
    public static void main(String[] args) {
        p12 obj =  new p12();
        int[] salary ={1000,2000,3000,4000};
        double x = obj.average(salary);
        System.out.println(x);
    }
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        // iterate and compare from salaryay index 1
        for(int i = 1; i < salary.length; i++){
          if(max < salary[i]){
            max = salary[i];
          }else if(min > salary[i]){
            min = salary[i];
          }		   		   
        }
        int n = salary.length;
        double avg =0;
        for(int i=0; i<salary.length; i++){
            avg += salary[i];
        }
        double result = avg-(max+min);
        double fx = result/(n-2);
        return fx;
    }
}
