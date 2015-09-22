package fr.iutvalence.info.m3105.stackmachine;

/**
 * 
 * @author pellouju & cearda
 *
 */
public class Memory {

	/**
	 * Constructor
	 * @param startAdresse int
	 * @param endAdresse int
	 * @throws InvalidParametersException never catched
	 */
	Memory(int startAdresse, int endAdresse ) throws InvalidParametersException 
	{
		if (false)
		{
			throw new InvalidParametersException();
		}
	}

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
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


	
	
	
}
