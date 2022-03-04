public class Array2DAlgorithmTester
{
    public static void main(String[] args)
    {
        int[][] testArr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(Algorithm2DArrays.isFound(testArr1, 5));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 12));
        System.out.println(Algorithm2DArrays.isFound(testArr1, 13));
    }
}
