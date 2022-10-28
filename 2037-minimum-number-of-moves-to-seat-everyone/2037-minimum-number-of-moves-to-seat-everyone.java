class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int diff;
        int sum  = 0;
        for(int i = 0; i<seats.length;i++){
          diff = seats[i] - students[i];
            if(diff < 0){
                diff = 0 - diff;
            }
            sum = sum + diff;
        }
        return sum;
    }
}