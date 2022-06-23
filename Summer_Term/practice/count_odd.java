package practice;

public class count_odd {
    public static void main(String[] args) {
        count_odd obj = new count_odd();
        int count = obj.countodds(0, 10);
        System.out.println("No. of Odds : "+count);
    }
    public int countodds(int low, int high){
        int countodd = 0;
        for( int i=low; i<high+1; i++){
            if (i%2!=0){
                countodd += 1;
            }}
        return countodd ;
    }}
/*  public int countOdds(int low, int high) {
    // move low to previous even number
    if (low % 2 == 1) {
      low = low - 1;
    }
    // move high to next even number
    if (high % 2 == 1) {
      high = high + 1;
    }
    return (high - low) / 2;
  }
  Easiest solution in efficient way
  */
