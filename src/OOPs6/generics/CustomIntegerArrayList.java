package OOPs6.generics;


public class CustomIntegerArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 3;
    private int index = 0;

    public CustomIntegerArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    void add(int num){
        if (isFull()){
            resize();
        }
        data[index++] = num;
    }

    boolean isFull(){
        return index == data.length;
    }
    void resize(){
//        System.out.println("resized it, You can add now!");
        int[] temp = new int[2* data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
//        System.arraycopy(data, 0, temp, 0, data.length);
    }
    public int get(int i){
        return data[i];
    }
    public void set(int index, int num){
        data[index] = num;
    }
    public void remove(int indx){
        for(int i = indx; i < data.length -1; i++ ){
            data[i] = data[i + 1];
        }
        index--;
    }
    public int size(){
        return index;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("[");
        for (int i = 0; i < index; i++) {
            output.append(data[i]);
            output.append(",");
        }
        output.deleteCharAt(output.length()-1);
        output.append("]");
       return output.toString();
    }

    public static void main(String[] args) {
      CustomIntegerArrayList list = new CustomIntegerArrayList();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(9);
      list.add(6);
      list.add(0);
      System.out.println(list);
      System.out.println(list.get(2));
      list.set(0,9);
      System.out.println(list);
      System.out.println(list.size());
      list.remove(2);
      System.out.println(list);

    }
}
