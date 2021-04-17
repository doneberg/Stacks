public class TestStack2
{	public static void main(String[] a)
	{
		Stack aStack = new LinkedStack( );
		aStack.push( "x" );
		aStack.push( "y" );
		aStack.push( "z" );
		while( ! aStack.isEmpty( ) )
		{
		  System.out.println( aStack.pop( ) );
		}


		Stack opStack = new LinkedStack( );
		System.out.println( opStack.isEmpty( ) );
		opStack.push( ">" );
		opStack.push( "+" );
		opStack.push( "<" );
		System.out.print( opStack.peek( ) );
		System.out.print( opStack.peek( ) );  // careful
		System.out.print( opStack.peek( ) );
		System.out.println();
		System.out.println(opStack.getSize());

		aStack = new LinkedStack( );
		aStack.push( "3" );
		aStack.push( "2" );
		aStack.push( "1" );
		System.out.println( aStack.isEmpty( ) );
		System.out.println( aStack.peek( ) );
		aStack.pop();
		System.out.println( aStack.peek( ) );
		aStack.pop();
		System.out.println( aStack.peek( ) );
		aStack.pop();
		System.out.println( aStack.isEmpty( ) );


        aStack = new LinkedStack( );
		aStack.push( "3" );
		aStack.push( "2" );
		aStack.push( "1" );
		System.out.println( aStack.isEmpty( ) );
		System.out.println( aStack.peek( ) );
		aStack.printStack();




	}
}
