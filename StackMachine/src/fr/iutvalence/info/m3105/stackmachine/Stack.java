package fr.iutvalence.info.m3105.stackmachine;

import java.util.ArrayList;

/**
 * 
 * @author pellouju & cearda
 *
 */
public class Stack implements StackInterface {
	
	private int size;
	private int currentSize;
	
	private java.util.Stack<Integer> stack; //tableau de mots de 32bits
	/**
	 * Constructor
	 */
	Stack(int size)
	{
		this.currentSize =0;
		this.stack=new java.util.Stack<Integer>();
	}
	
	public void stack(int value) throws StackOverflowException
	{
		if(this.currentSize +1> this.size)
		{
			throw new StackOverflowException();
		}
		
		this.stack.push(value);
		this.currentSize++;
	}

	public void clear() {
		// TODO Auto-generated method stub
		while(!this.stack.empty()){
			this.stack.pop();
		}
		this.currentSize=0;
	}

	public int unStack() throws StackUnderflowException {
		// TODO Auto-generated method stub
		if(this.currentSize -1 < 0)
		{
			throw new StackUnderflowException();
		}
		//TODO unstack
		
		this.currentSize--;
		return this.stack.pop();
	}

}
