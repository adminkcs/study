package stu01;

class Marathon {
    public static void printLapTime(String name, int time) {
      System.out.println(name + ": " + time + "(min)");
    }
    public static void printMarathonResults(String[] names, int[] times) {
      for (int i = 0; i < names.length; i++) {
        printLapTime(names[i], times[i]);
      }
    }
    public static void main (String[] arguments) {
      String[] names = {
        "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
        "Alex", "Emma", "John", "James", "Jane", "Emily",
        "Daniel", "Neda", "Aaron", "Kate"
      };
      int[] times = {
        341, 273, 278, 329, 445, 402,
        388, 275, 243, 334, 412, 393,
        299, 343, 317, 265
      };
      // 가장 빠른시간에 마라톤을 완주한 사람의 인덱스(배열의 번호)를 찾는 메쏘드
      int fastestRunnerIndex = getFastestRunnerIndex(times);
      // 결과출력
      printLapTime(names[fastestRunnerIndex], times[fastestRunnerIndex]);
    }
    private static int getFastestRunnerIndex(int[] times) {
        int fast =0;
        
        for(int i=0; i<times.length; i++){
            if(times[fast] > times[i] || fast == 0 )
            {
                fast = i;
            }
        }
        return fast;
    }
  }