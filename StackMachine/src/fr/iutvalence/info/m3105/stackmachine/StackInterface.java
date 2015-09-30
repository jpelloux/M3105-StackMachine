package fr.iutvalence.info.m3105.stackmachine;

public interface StackInterface {
	
	public void stack(int value) throws StackOverflowException;

	public void clear();

	public int unStack() throws StackUnderflowException;
}
