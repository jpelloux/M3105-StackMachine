package fr.iutvalence.info.m3105.stackmachine;

public interface CPUInterface {
	
	public void run();

	public void wireToProgramMemory(MemoryInterface  programMemory);

	public void wireToExpStack(StackInterface expStack);

	public void wireToCallStack(StackInterface callStack);

	public void wireToIoSubsystem(IOInterface ioSystem);

	public void clearStacks();

	public void setPC(int address);
}
