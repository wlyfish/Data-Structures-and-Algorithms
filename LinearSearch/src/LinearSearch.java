/**
 * @author wly
 * @create 2022-08-31 16:31
 * @projectName Data Structures and Algorithms
 */
public class LinearSearch {
    public static int search(int[] data, int target){
        for(int i = 0; i < data.length; i++){
            if(data[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24, 18, 12, 8, 9, 66, 32, 4};

//        LinearSearch ls = new LinearSearch();
        int res = LinearSearch.search(data, 66);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 77);
        System.out.println(res2);
    }
}
