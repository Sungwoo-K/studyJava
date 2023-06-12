package ch04;

public class ArrayEx {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[2] = 7;
        System.out.println(numbers[2]);

        String[] str = new String[3];
        str[0] = "Java";
        str[1] = "Python";
        str[2] = "C++";
        for(String string: str){
            System.out.println(string);
        }

        int[] num = new int[7];
        for (int i = 0; i < num.length; i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }

        //5번문제 오류

        int[] num1 = new int[5];
        for(int number: num1){
            System.out.println(number);
        }

        //////////////////////////////////////////

        char[][] numArray = new char[4][4];
        char al = 'A';
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                numArray[i][j] = al++;
                System.out.print(numArray[i][j]);
            }
            System.out.println();
        }

        int[][] numbers1 = new int[2][2];
        int[][] numbers2 = new int[2][2];
        int[][] result = new int [2][2];
        int globalNumber = 1;
        for(int i = 0; i < numbers1.length; i++){
            for(int j = 0; j < numbers1[i].length; j++){
                numbers1[i][j] = globalNumber++;
                System.out.print(numbers1[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < numbers2.length; i++){
            for(int j = 0; j < numbers2[i].length; j++){
                numbers2[i][j] = globalNumber++;
                System.out.print(numbers2[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                result[i][j] = numbers1[i][j] + numbers2[i][j];
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
