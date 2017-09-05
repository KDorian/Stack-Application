import java.util.Arrays;

public class Stack {

    int size;
    int stack[];
    int top = -1;
    int itemCount = 0;

    Stack(int size){

        this.size = size;
        stack = new int[size];
    }

    Stack(){

        this.size = 10;
        stack = new int[size];
    }

    boolean isEmpty(){

        if(top == -1){

            return true;
        } else {

            return false;
        }
    }

    boolean isFull(){

        if(top + 1 == size){

            return true;
        } else {

            return false;
        }
    }

    int peek(){

        return stack[top];
    }

    boolean pop(){

        if(!isEmpty()){

            top = top -1;
            stack[top+1] = 0;
            itemCount--;
            return true;
        } else {

            return false;
        }
    }

    boolean push(int data){

        if(!isFull()){

            top = top + 1;
            stack[top] = data;
            itemCount++;
            return true;
        } else {

            return false;
        }
    }

    public String toString(){

        return Arrays.toString(stack);
    }
}
