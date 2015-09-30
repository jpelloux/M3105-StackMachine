package fr.iutvalence.info.m3105.stackmachine;

/**
 * 
 * @author pellouju & cearda
 *
 */
public class Program {
	Instruction[] insctructions;
	/**
	 * Constructor
	 * @param instructions Instruction[]
	 */
	Program(Instruction[] instructions)
	{
		this.insctructions=instructions;
	}

	public int getInstructionCount() {
		return this.insctructions.length;
	}

	public Instruction getInstructionAt(int instructionNumber) {
		return this.insctructions[instructionNumber];
	}

}
