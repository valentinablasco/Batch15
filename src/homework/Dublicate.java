package homework;

import java.util.Arrays;

class main {


    public int[] dublicates(int[] nums, int[] nums2){
        String commons = " ";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums[i] == nums2[j]){
                    commons += nums[i] + " ";
                }
            }
        }
        if (commons.length() == 0) {
            return null;

        }
        String[] commonArray = commons.trim().split(" ");

        String commonsWithoutDuplicate = " ";
        for (int i = 0; i < commonArray.length; i++) {
            if (!commonsWithoutDuplicate.contains(" " + commonArray[i] + " ")) {
                commonsWithoutDuplicate = commonArray[i] + " ";}
            }
            String[] commonsWithoutDublicateArray = commonsWithoutDuplicate.trim().split(" ");

            int[] commonNumbers = new int[commonsWithoutDublicateArray.length];
            for (int i = 0; i < commonNumbers.length; i++){
                commonNumbers[i] = Integer.parseInt(commonsWithoutDublicateArray[i]);
            }
            Arrays.sort(commonNumbers);
            return commonNumbers;
        }

}








