class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        
        boolean inserted = false;
        
        int startn = newInterval[0];
        int endn = newInterval[1];
        for(int i=0 ; i<intervals.length; i++){
            if(!inserted && newInterval[0] < intervals[i][0]){
                list.add(newInterval);
                inserted = true;
            }
            list.add(intervals[i]);
        }
        if(!inserted){
            list.add(newInterval);
        }
        List<int[]> res = new ArrayList<>();

        int start1 = list.get(0)[0];
        int end1 = list.get(0)[1];

        for(int i =1; i<list.size();i++){
            int start2 = list.get(i)[0];
            int end2 = list.get(i)[1];
            if(end1>= start2){
                start1 = start1;
                end1= Math.max(end1,end2);
                continue;
            }
            else{
                res.add(new int[]{start1,end1});
                start1 = list.get(i)[0];
                end1 = list.get(i)[1];
            }
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}