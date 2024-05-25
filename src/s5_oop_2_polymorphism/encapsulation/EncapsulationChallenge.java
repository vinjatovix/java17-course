package s5_oop_2_polymorphism.encapsulation;

public class EncapsulationChallenge {
	public static void main(String[] args) {
		Printer_ printer = new Printer_(50, true);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(5);
		System.out.printf("Pages printed was %d new total print count for printer = %d%n", pagesPrinted, printer.getPagesPrinted());
		pagesPrinted = printer.printPages(10);
		System.out.printf("Pages printed was %d new total print count for printer = %d%n", pagesPrinted, printer.getPagesPrinted());
	}
}

class Printer_ {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer_(int tonerLevel, boolean duplex) {
		this.pagesPrinted = 0;
		this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
		this.duplex = duplex;
	}

	public int addToner(int tonerAmount) {
		int tempAmount = tonerAmount + this.tonerLevel;
		if (tempAmount > 100 || tempAmount < 0) {
			return -1;
		}
		this.tonerLevel = tempAmount;
		return this.tonerLevel;
	}

	public int printPages(int pages) {
		int pagesToPrint = (this.duplex) ? (pages / 2) + (pages % 2) : pages;
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}