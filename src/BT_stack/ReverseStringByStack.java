package BT_stack;

public class ReverseStringByStack {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        String string = "made by le hong quan";
        String[] strings = string.split("\\s");

        System.out.println("Integer array is: ");
        for (int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + "\t");
        }
        System.out.println();

        for (String s : strings){
            stringStack.push(s);
        }

        for (int i = 0; i < strings.length; i++){
            strings[i] = stringStack.pop();
        }

        System.out.println("Integer array after reverse is: ");
        for (int i = 0; i < strings.length; i++){
            System.out.print(strings[i] + "\t");
        }
    }
}
