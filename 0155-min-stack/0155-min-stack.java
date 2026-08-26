import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    int mini = Integer.MAX_VALUE;

    public void push(int value) {
        stack.push(value);

        if (mini >= value) {
            minStack.push(value);
            mini = value;
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();

            if (minStack.isEmpty()) {
                mini = Integer.MAX_VALUE;
            } else {
                mini = minStack.peek();
            }
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}