class Queue{
    int maxSize= 10;
    int q[]= new int[maxSize];
    int start= -1;
    int end= -1;
    int currSize= 0;

    // push
    void push(int x){
        if(currSize == maxSize) {
            System.out.println("not possible");
            System.exit(1);
        }
        if(currSize == 0){
            start=0;
            end=0;
        }
        else end= (end + 1) % maxSize;
        q[end]= x;
        currSize++;
    }

    // pop
    int pop(){
        int popEle= q[start];
        if(currSize == 0) {
            System.out.println("not possible as Queue is emepty");
            System.exit(1);
        }
        if(currSize == 1) {
            start= -1;
            end= -1;
        }
        else{
            start= (start + 1) % maxSize;
        }
        currSize--;
        return popEle;
    }

    // top
    int top(){
        if(currSize == 0) {
            System.out.println("not possible as Queue is empty");
            System.exit(1);
        }
        return q[start];
    }

    // size
    int size(){
        return currSize;
    }

    // // print
    // @Override
    // public String toString() {
    //     if (currSize == 0) return "Queue is empty";

    //     StringBuilder sb = new StringBuilder();
        
    //     for (int i = start; ; i = (i + 1) % maxSize) {
    //         sb.append(q[i]).append(" ");
    //         if (i == end) break;  // Stop when we reach the last inserted element
    //     }

    //     return sb.toString();
    // }

    // or
    @Override
    public String toString(){
        if(currSize == 0) return "Queue is empty";
        StringBuilder sb= new StringBuilder();
        int i= start;
        while (true) {
            sb.append(q[i]).append(" ");
            if(i == end) break;
            i= (i + 1) % maxSize;
        }
        return sb.toString();
    }
}

public class queue_using_arrays {
    public static void main(String[] args) {
        Queue qd= new Queue();
        qd.push(5);
        qd.push(6);
        qd.push(7);
        System.out.println("Queue is: " + qd);
        System.out.println("size of Queue is: " + qd.size());
        qd.pop();
        System.out.println("Queue after pop is: " + qd);
        
        System.out.println("size of Queue is: " + qd.size());
        System.out.println("top of Queue is " + qd.top());
    }
}
