package fr.iutvalence.info.m3105.stackmachine;

/**
 * 
 * @author pellouju & cearda
 *
 */

//FAIRE UN TRUC GENERIQUE  ie AVEC <>
public class Memory<T> implements MemoryInterface{

	private T startAdress;
	private T endAdress;

	/**
	 * Constructor
	 * @param startAdresse T
	 * @param endAdresse T
	 * @throws InvalidParametersException never catched
	 */
	Memory(T startAdress, T endAdress ) throws InvalidParametersException 
	{
		this.startAdress=startAdress;
		this.endAdress=endAdress;
		if (false)
		{
			throw new InvalidParametersException();
		}
	}

	public void setStartAdress(Object startAdress) {
		this.startAdress = (T)startAdress;
	}

	public T getEndAdress() {
		return this.endAdress;
	}

	public void setEndAdress(Object endAdress) {
		this.endAdress = (T)endAdress;
	}

	public T getStartAddress() {
		return this.startAdress;
	}

	public void write(Object currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

	public int read(int pC) throws AddressOutOfBoundsException{
		// TODO Auto-generated method stub
		if(false)
		{
			throw new AddressOutOfBoundsException();
		}
		return 0;
	}

}
