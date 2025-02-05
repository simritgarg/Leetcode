class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int j = 0;
        int count = 0;
        while(idx<chars.length){
            char ch = chars[idx];
            while(idx<chars.length && chars[idx] == ch){
                count++;
                idx++;
            }
            chars[j++] = ch;
            if(count>1){
                String s = count + "";
                for(char it: s.toCharArray()) chars[j++] = it;
            }
            count=0;
        }
        return j;

        // using if-else
        // int j = 0, count = 1;  
        // for (int i = 0; i < chars.length; i++) {
        //     if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
        //         count++;
        //     } else {
        //         chars[j++] = chars[i];
        //         if (count > 1) {
        //             String countStr = Integer.toString(count);
        //             for (char c : countStr.toCharArray()) {
        //                 chars[j++] = c; 
        //             }
        //         }
        //         count = 1;
        //     }
        // }

        // return j;

    }
}