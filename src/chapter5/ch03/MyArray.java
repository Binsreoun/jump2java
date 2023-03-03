package chapter5.ch03;

public class MyArray {

    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {

        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {

        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void AddElement(int num){
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num){
        int i;
        if(position <0 || position> count){
            System.out.println("not enough memory");
            return ;
        }
        if(count >= ARRAY_SIZE){
            System.out.println("insert Error");
            return;
        }
        for( i = count -1; i>= position; i++){
           intArr[i+1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }

    public int removeElement(int position){
        int ret =ERROR_NUM;

        if(isEmpty()){
            System.out.println("Arrays is empty");
            return ret;
        }
        if(position<0 || position > count-1){
            System.out.println("remove Error");
            return ret;
        }
        ret = intArr[position];
        for(int i = position; i<count-1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }
    public boolean isEmpty(){
        if(count == 0){
            return true;
        }
        return false;
    }
}
