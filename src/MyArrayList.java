public class MyArrayList {
    private int[] arr;
    private int size;
    private int cursor;


    public MyArrayList() {
        size = 5;
        arr = new int[size];
        cursor = 0;
    }

    public void add(int value){
        if(cursor == size){
            size *= 2;
            int[] temp = arr;           // Сохраняем ссылку на старый массив
            arr =  new int[size];       // Создали новый массив
            copyArray(temp);
        }
        arr[cursor] = value;
        cursor++;
    }

    private void copyArray(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public void out(){
        System.out.println("Массив: ");
        for (int i = 0; i < cursor; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void trace(){
        System.out.println("Трассивровка памяти: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void deleteArray(){
        cursor = 0;
    }

    public void eraseArray(){
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }
}
