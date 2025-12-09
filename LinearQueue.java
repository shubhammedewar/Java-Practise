
class Queues{
    int size;
    int arr[];
    int front,rear;

    public Queues(int s){
        size = s;
        arr = new int[s];
        front = rear = -1;
    }

    public boolean isFull(){
        return rear == size-1;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public void Add(int val){
        if(isFull()){
            System.out.println("queue full");
        }
        else{
            rear++;
            arr[rear] = val;
        }
    }

    public int remove(){
        int temp = -1;
        if(isEmpty()){
            return temp;
        }
        else{
            temp = arr[front+1];
            front++;
            if(front == rear)
				front = rear = -1;
            return temp;
        }
    }

    public int peek(){
        int temp =-1;
        if(isEmpty()){
            return temp;
        }
        else{
            temp = arr[front+1];
            return temp;
        }
    }
    
    public void display(){
        int t = front+1;
        while(t != rear+1){
            System.out.print(arr[t] + " ");
            t++;
        }
        System.out.println();
    }

}

public class LinearQueue {
    public static void main(String[] args){
        Queues q = new Queues(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);
        q.display();

    }

}
