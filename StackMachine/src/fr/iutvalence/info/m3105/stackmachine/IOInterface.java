package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public interface IOInterface {
	public void displayRuntimeError(String string);
	public void displayProgramTermination() throws IOException;

	public int read() throws IOException;

	public void write(int op);
}
