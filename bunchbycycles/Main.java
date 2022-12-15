package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    if(cycles < 310){
      lowCount++; //increments the low usage battery count
    }
    else if(cycles >= 310 && cycles < 929 ){
      mediumCount++; // increments the medium used battery counts
    }
    else if(cycles >= 929){
      highCount++; // increments the high used battery count
    }
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}