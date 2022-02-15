import java.util.*;

class StackOfIntegers{
    private int[] elements;
    private int size;

    public StackOfIntegers(){
        this.elements = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capacity){
        int temp[] = new int[capacity];
        this.elements = temp;
        this.size = 0;
    }

    public boolean empty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return (this.elements[this.size]);
    }

    public void push(int value){
        int temp[] = new int[this.size+1];
        for (int index = 0; index< this.size; index++){
            temp[index] = this.elements[index];
        }
        temp[this.size] = value;
        this.size += 1;
        this.elements = temp;
    }

    public int pop(){
        int temp[] = new int[this.size-1];
        int return_this = this.elements[this.size-1];
        for (int index = 0; index< this.size-1; index++){
            temp[index] = this.elements[index];
        }
        this.size -= 1;
        this.elements = temp;
        return return_this;
    }

    public int getSize(){
        return this.size;
    }

    public void printAll(){
        for(int index = 0; index<this.size; index++){
            System.out.print(this.elements[this.size-index-1] + " ");
        }
    }
}
public class qns2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many elements do you want to PUSH:");
        int inputSize = scan.nextInt();
        StackOfIntegers stackObject = new StackOfIntegers(inputSize);

        int value;
        for(int index=0; index<inputSize; index++){
            stackObject.push(index);
        }
        stackObject.printAll();
        System.out.print("\nHow many elements do you want to POP:");
        inputSize = scan.nextInt();
        for(int index=0; index<inputSize; index++){
            value = stackObject.pop();
            System.out.println(value + " has been popped");
        }
        
        stackObject.printAll();
        scan.close();
    }
}
