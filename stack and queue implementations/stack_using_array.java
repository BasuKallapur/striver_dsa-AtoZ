class stack{
    int st[]= new int[10];
    int top= -1;
    // push
    void push(int x){
        top++;
        st[top]= x;
    }
    // pop
    int pop(){
        if(top == -1) return -1;
        int popVal= st[top];
        top--;
    return popVal;
    }
    // top
    int top(){
        return top;
    }
    // size
    int size(){
        return top+1;
    }
    // print stack
    @Override
    public String toString(){
        if(top == -1) return "stack is empty";
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<=top; i++){
            sb.append(st[i] + " ");
        }
    return sb.toString();
    }
}
    
public class stack_using_array {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println(s);  
        int x= s.pop();
        System.out.println("poped element is : " + x);
        System.out.println("modified stack: " + s);  
        s.push(108);
        System.out.println("modified stack after push: " + s);
        System.out.println("size of stack is: " + s.size());

    }
}

