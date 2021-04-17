/**
  This class implements the Stack ADT using a linked structure.
  It is generic because it can store any type of object.
  The pop and getTop methods return an Object, so you may need
  to cast the return values to get you code to compile.
*/
import java.util.*;
public class LinkedStack implements Stack
{
  private class LinkNode
  {
    private Object data;     // These two public instance variables can
    private LinkNode next;   // be accessed from methods in LinkedStack

    public LinkNode( )
    {
      data = null;
      next = null;
    }

    public LinkNode(Object objectReference, LinkNode nextReference)
    {
      data = objectReference;
      next = nextReference;
    }
  } ////////// end class LinkNode /////////////

  private LinkNode my_top;

  // Construct an empty stack.
  public LinkedStack( )
  {
    my_top = null;
  }

  /** Find out if the stack is empty to help avoid popping an empty stack.
    * @returns true if there are zero elements in this stack.
    */
    public boolean isEmpty( )
    {
      return my_top == null;
    }

/** Put element on "top" of this Stack object.
  * Any class of object can be pushed.
  */
  public void push( Object element )
  {
    my_top = new LinkNode( element, my_top );
  }

  /** Return reference to the element at the top of this stack.
    * @returns A reference to the top element.
    * @throws EmptyStackException of the stack is empty.
    */
    public Object peek( )
    {
      if( this.isEmpty( ) )
        throw new EmptyStackException( );

      // If the stack is not empty, return a reference to the top element
      return my_top.data;
    }

    /** Removes the element at the top of this stack and returns a reference to it.
	  * @returns A reference to the top element.
	  * @throws EmptyStackException of the stack is empty.
	  */
	  public Object pop( )
	  {
	    if( this.isEmpty( ) )
	      throw new EmptyStackException( );

	    // Remove the top element and return a reference to the top element
	    Object result = my_top.data;
	    my_top = my_top.next;
	    return result;
	  }

	public int getSize()
	{      int count =0;
		   if(this.isEmpty())
				throw new EmptyStackException();
            LinkNode ref = my_top;
			while (ref != null)
			{            ref = ref.next;
				         count++;
		   }
		    return count;
     }
     public void printStack()
     {
	        for (int i = getSize() - 1; i >= 0; i--) {
	 			System.out.print(peek());
	 			if (i == getSize() - 1) {
	 				System.out.print(" <- head");
	 			}
	 			System.out.println();
	 		}
	 	}

  //
}

/*
Balanced Symbol Algorithm (symbols treated as primitive char values)
 Construct an empty stack
 errors = 0;
 while there are more lines of input
 {
     read a line of input
     do the following for each symbol in the line
     {
        symbol = next symbol on the line
        if the symbol is an opener
            push the symbol onto the stack
       else  if the symbol is a closer
       {   // Process the closing symbol. Need to distinguish an empty versus non-empty stack
           if  the stack is empty
           {
                report an error: 'unexpected closing symbol'
                errors = errors +1
            }
            else
            {
                 pop a symbol off the stack
                 if the popped symbol is not a matching closing symbol for the symbol just read in
                {
                    report an error: 'expected a different opening symbol'
                    errors = errors + 1
                 }
            }
        }// end processing a closing symbol
     }  // end processing one line
  } // end  processing all lines

 // All symbols have now been read
 If the stack is not empty
 {
      report an error for each symbol on the stack
      errors = errors + 1
  }
  Report the total number of errors
*/