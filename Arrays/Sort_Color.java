/**
 * Sort_Color
 */
public class Sort_Color {

    public static void main(String[] args) {
        int n=nums.length;
        int countArray[] =new int[3];
        for(int i=0;i<n;i++){
            countArray[nums[i]]++;
        }

        int j=0;
        for(int i=0;i<3;i++){
            while(countArray[i]>0){
                nums[j++]=i;
                countArray[i]--;
            }
        }
    }
}