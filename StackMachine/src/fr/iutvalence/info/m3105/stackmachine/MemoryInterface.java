package fr.iutvalence.info.m3105.stackmachine;

public interface MemoryInterface {
		
	public void setStartAdresse(int startAdresse);
	
	public int getEndAdresse();

	public void setEndAdresse(int endAdresse);

	public void write(int currentAddress, Object opCode);

	public int read(int pC) throws AddressOutOfBoundsException;

	public int getStartAddress();
}
