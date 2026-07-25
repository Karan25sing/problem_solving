class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List <int[]> res= new ArrayList<>();
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i=0; i<intervals.length;i++){
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(start2 <= end1){
                start1=start1;
                end1= Math.max(end1,end2);
                continue;
            } 
            else{
                res.add(new int[]{start1,end1});
                start1 = intervals[i][0];
                end1 = intervals[i][1]; 
            }
            
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
        
    }
}