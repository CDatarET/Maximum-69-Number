class Solution {
    public int maximum69Number (int num) {
        int[] arr = new int[10];
        int i = 0;
        while(num > 0){
            arr[i] = num % 10;
            num = num / 10;
            i++;
        }

        for(int j = arr.length - 1; j >= 0; j--){
            if(arr[j] == 6){
                arr[j] = 9;
                break;
            }
        }

        int ret = 0;
        for(int j = 0; j < arr.length; j++){
            ret = ret + (arr[j] * (int)Math.pow(10,j));
        }
        return(ret);
    }
}
