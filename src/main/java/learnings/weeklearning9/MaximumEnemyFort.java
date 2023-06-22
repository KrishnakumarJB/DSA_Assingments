package learnings.weeklearning9;

import org.junit.Test;

public class MaximumEnemyFort {

    int[] forts = {0,1,0,-1};
@Test
      public void forrt(){

    int r=0,j=0;
    for(int i=0;i<forts.length;i++){
        if(forts[i]!=0){
            if(forts[j]==-forts[i]) r=Math.max(r,i-j-1);
            j=i;
        }
    }
    System.out.println(r);
//        int left =0, right =0, count =0, max=0;
//
//        while(right < forts.length){
//
//            if(forts[left] == 1){
//                left++;
//
//            } else if (forts[right] == -1 || forts[right] == 1) {
//                count = right-left;
//                left= right+1;
//            }
//            max = Math.max(count, max);
//            right++;
//        }
//
//        System.out.println(max);
      }

}
