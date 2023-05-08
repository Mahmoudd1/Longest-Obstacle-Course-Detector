public class Solution {
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles)
    {
        final int len=obstacles.length;
        int [] dp=new int[len];
        int []answer =new int[len];
        int dplen=0;
        int i=0;
        for (int obstacle :obstacles)
        {
            int index=bs(dp,obstacle,dplen);
            if (index==dplen)
                dplen++;
            dp[index]=obstacle;
            answer[i] = index + 1;
            i++;
        }
        return answer;

    }
    int bs(int[]obstacles,int obstacle,int high)
    {
        if (high==0)
        {
            return 0;
        }
        int low=0;
        int mid=0;
        while (low<high)
        {
            mid=low+(high-low)/2;
            if (obstacles[mid]<=obstacle)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
}
