ublic static List<Integer> getMax(List<String> operations) {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxstack = new Stack<>();
    List<Integer> lst = new ArrayList<>();

    for (String op : operations) {
        if (op.startsWith("1")) {
            String[] parts = op.split(" ");
            int value = Integer.parseInt(parts[1]);
            stack.push(value);
            if (maxstack.isEmpty()) {
                maxstack.push(value);
            } else {
                maxstack.push(Math.max(value, maxstack.peek()));
            }
        } else if (op.startsWith("2")) {
            stack.pop();
            maxstack.pop();
        } else {
            lst.add(maxstack.peek());
        }
    }

    return lst;
}
