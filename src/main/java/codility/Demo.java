package codility;

public class Demo {


    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[]{1,2,3,4}));


        System.out.println("--------------------------------------------------");
//        FrogRiverOne frogRiverOne=new FrogRiverOne();
//        System.out.println(frogRiverOne.solution(5, new int[]{1,2,3,4,5,1,2,2,2}));
//        System.out.println(frogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4}));
        System.out.println("--------------------------------------------------");
//       Arrays.stream((new MaxCounters()).solution(5, new int[]{3,4,4,6,1,4,4})).forEach(System.out::println);
//        System.out.println("--------------------------------------------------");
//        Arrays.stream((new MaxCounters()).solution(5, new int[]{3,4,4,6,6,6,1,4,4})).forEach(System.out::println);
//        System.out.println("--------------------------------------------------");
//        Arrays.stream((new MaxCounters()).solution(5, new int[]{6,6,6,6,6})).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        //       Arrays.stream((new MaxCounters()).solution(5, new int[]{1,2,2,6,6,6,6,6,6,6,6,6,1,6,6,4,6,1,1,2,6,1})).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
//        System.out.println((new PermMissingElem()).solution(new int[]{1,2,3,5}));
//        System.out.println((new PermMissingElem()).solution(new int[]{1,2,3,4,5}));
//        System.out.println((new PermMissingElem()).solution(new int[]{2,3,4,5}));
//        System.out.println((new PermMissingElem()).solution(new int[]{1,3}));
//        System.out.println((new PermMissingElem()).solution(new int[]{}));
//        System.out.println((new PermMissingElem()).solution(new int[]{1}));
//        System.out.println((new PermMissingElem()).solution(new int[]{2,3}));


        System.out.println("--------------------------------------------------");
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,2,3,4,5,5}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,3,4,100}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,7,1,100,3,5,78}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,7}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,7,4}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1,-1}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{1}));
//        System.out.println((new TapeEquilibrium()).findMinimalDifference(new int[]{-1,0}));

        System.out.println("--------------------------------------------------");





        int x = 529;
        int result = 0;
        String binary = Integer.toBinaryString(x);
        System.out.println(binary);
        boolean isOneAtTheEnd = binary.endsWith("1");
        String[] binaryArray = binary.split("1");
        if (binaryArray.length == 0) {
            result = 0;
        }
        if (isOneAtTheEnd) {
            for (int i = 0; i < binaryArray.length; i++) {
                if (binaryArray[i].length() > result) {
                    result = binaryArray[i].length();
                }
            }
        } else {
            if (binaryArray.length == 1) {
                result = 0;
            } else {
                for (int i = 0; i < binaryArray.length - 1; i++) {
                    if (binaryArray[i].length() > result) {
                        result = binaryArray[i].length();
                    }
                }

            }

        }


        System.out.println("Result " + result);

    }

}
