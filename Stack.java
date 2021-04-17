// Stack interface with standard stack-like method
// February 8
public interface Stack {

	// Returns true if the stack doesn't contain anything
	public boolean isEmpty();

	// Returns the first object on the top of the stack,
	// but leaves it on top
	public Object peek();

	// Returns the first object on the top of the stack,
	// but removes it
	public Object pop();

	// Pushes the o argument onto the top of the stack
	public void push(Object o);

	// Returns the 0-based position of the object o in the
	// stack (the top of the stack is considered to be position 0)
	//public int search(Object o);

	// Prints the contents of the stack
	public void printStack();

	// Returns the size of the stack
   public int getSize();
}
