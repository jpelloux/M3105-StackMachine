package fr.iutvalence.info.m3105.stackmachine;

/**
 * 
 * @author pellouju & cearda
 *
 */

//FAIRE UN TRUC GENERIQUE  ie AVEC <>
public class Memory32 implements MemoryInterface{

	private int startAdress;
	private int endAdress;

	/**
	 * Constructor
	 * @param startAdresse int
	 * @param endAdresse int
	 * @throws InvalidParametersException never catched
	 */
	Memory32(int startAdresse, int endAdresse ) throws InvalidParametersException 
	{
		this.startAdress=startAdresse;
		this.endAdress=endAdresse;
		if (false)
		{
			throw new InvalidParametersException();
		}
	}

	public void setStartAdresse(int startAdresse) {
		this.startAdress = startAdresse;
	}

	public int getEndAdresse() {
		return endAdress;
	}

	public void setEndAdresse(int endAdresse) {
		this.endAdress = endAdresse;
	}


	public void write(int currentAddress, Object opCode) {
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

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

}
