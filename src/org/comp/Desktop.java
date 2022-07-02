package org.comp;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("LG");

	}
	public static void main(String[] args) {
		Computer c=new Computer();
		Desktop d=new Desktop();
		c.computerModel();
		d.desktopSize();
	}

}
