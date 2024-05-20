package ujicoba;

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Membuat stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Menambahkan elemen ke stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Mengeluarkan elemen dari stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    // Mendapatkan ukuran stack
    public int getSize() {
        return top + 1;
    }

    // Memeriksa apakah stack kosong
    public Boolean isEmpty() {
        return top == -1;
    }

    // Memeriksa apakah stack penuh
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // Menampilkan elemen stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("Stack: ");
        stack.printStack();

        // Mengeluarkan elemen dari stack
        stack.pop();
        System.out.println("\nAfter popping out");
        stack.printStack();
    }
}
