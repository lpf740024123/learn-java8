package org.lpf.desgin.facade;

/**
 * 相当于 Facade类  外观类
 *
 */
public class Computer {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	public Computer(){
		this.cpu = new Cpu();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	public void start(){
		cpu.start();
		memory.start();
		disk.start();
	}
	public void shutdown(){
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
