package s5_oop_2_polymorphism;

public class PrinterChallenge {
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

	}
}

class Printer {
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	public Printer(int tonerLevel, boolean duplex) {
		this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}

	public int addToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount <= 100) {
				return this.tonerLevel += tonerAmount;
			}
		}
		return -1;
	}

	public int printPages(int pages) {
		int pagesToPrint = (this.duplex) ? (pages / 2) + (pages % 2) : pages;
		this.pagesPrinted += pagesToPrint;
		System.out.println("Printing in duplex mode");
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
