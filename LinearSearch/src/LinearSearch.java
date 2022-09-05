/**
 * @author wly
 * @create 2022-08-31 16:31
 * @projectName Data Structures and Algorithms
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target){
        for(int i = 0; i < data.length; i++){
//            需要判断值相等，故使用equals
            if(data[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data = {24, 18, 12, 8, 9, 66, 32, 4};

//        LinearSearch ls = new LinearSearch();
        int res = LinearSearch.search(data, 66);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 77);
        System.out.println(res2);

        Student[] students = {new Student("wly"),
                              new Student("Bobo"),
                              new Student("Alice")};
        Student bobo = new Student("Wly");
        int res3 = LinearSearch.search(students, bobo);
        System.out.println(res3);

        System.out.println("###########################");
//        int n = 1000000;
        int[] dataSize = {1000000, 10000000};

        for(int n : dataSize){
            data = ArrayGenerator.generateOrderedArray(n);
            int res4 = 0;

            long startTime = System.nanoTime();
            for (int i = 0; i < 100; i++) {
                res4 = LinearSearch.search(data, n);
            }

            long endTime = System.nanoTime();
            System.out.println(res4);
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("n = " + n + ", 100 runs : " + time + " s");
        }

    }
}
