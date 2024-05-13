package question6;

public class questionSix {

        public static int[] deleteElement(int[] array, int index) {

            if (index < 0 || index >= array.length) {
                System.out.println("Invalid index.");
                return array;
            }

            int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }

            return newArray;
        }
        public static void main(String[] args) {
            int[] array = {3, 7, 1, 9, 4};
            int indexToDelete = 2;

            int[] modifiedArray = deleteElement(array, indexToDelete);


            for (int num : modifiedArray) {
                System.out.print(num + " ");
            }


        }
}
