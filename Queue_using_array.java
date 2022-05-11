public class Queue_using_array{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1; //for array front = 0

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        
        public static boolean isEmpty() {
            return rear == -1;
        }

        //enqueue -> O(1)
        public static void add(int data) {
            if(rear == size-1){
                System.out.println("Full Queue");
                return;
            }
            
            rear++;
            arr[rear] = data;
        }

        //dequeue -> O(n)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for(int i =0; i<rear; i++){
                arr[i] = arr[i+1];
            } 

            rear--;
            return front;
        }

        //peek -> O(n)
        public static int peek() {
            if(isEmpty()){ 
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}