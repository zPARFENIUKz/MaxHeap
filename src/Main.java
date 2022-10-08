public class Main {
    public static void main(String[] args){
        MaxHeap heap = new MaxHeap(10);
        heap.insert(2);
        heap.print();
        heap.insert(3);
        heap.print();
        heap.insert(4);
        heap.print();
        System.out.println("extractMax execution: Max = " + heap.extractMax());
        heap.print();
        heap.intercalateKey(1, 5);
        heap.print();
        heap.delete(1);
        heap.print();
    }
}
