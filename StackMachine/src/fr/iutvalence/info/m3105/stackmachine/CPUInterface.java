package fr.iutvalence.info.m3105.stackmachine;

public interface CPUInterface {
	
	public void run();

	public void wireToProgramMemory(Memory32 programMemory);

	public void wireToExpStack(Stack expStack);

	public void wireToCallStack(Stack callStack);

	public void wireToIoSubsystem(IO ioSystem);

	public void clearStacks();

	public void setPC(int address);
}
