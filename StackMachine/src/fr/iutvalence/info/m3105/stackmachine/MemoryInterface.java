package fr.iutvalence.info.m3105.stackmachine;

public interface MemoryInterface<T> {
	
	public T getStartAddress();
		
	public void setStartAdress(T startAdress);
	
	public T getEndAdress();

	public void setEndAdress(T endAdress);

	public void write(T currentAddress, Object opCode);

	public int read(int pC) throws AddressOutOfBoundsException;
}
