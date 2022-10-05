package ComplexPack;

public class ComplexNumber {

	private double real_part, imag_part;

	ComplexNumber() {
		this.real_part = 0;
		this.imag_part = 0;
	}

	ComplexNumber(double real_part, double imag_part) {
		this.real_part = real_part;
		this.imag_part = imag_part;
	}
	
	void setReal(double real_part) {
		this.real_part = real_part;
	}
	
	void setImag(double imag_part) {
		this.imag_part = imag_part;
	}

	double getReal() {
		return real_part;
	}

	double getImag() {
		return imag_part;
	}

	double magnitude() {
		return Math.sqrt((Math.pow(real_part, 2) + Math.pow(imag_part, 2)));
	}

	ComplexNumber add(ComplexNumber n) {
		ComplexNumber resulte = new ComplexNumber(this.real_part, this.imag_part);
		resulte.real_part += n.real_part;
		resulte.imag_part += n.imag_part;
		return resulte;
	}

	ComplexNumber subtract(ComplexNumber n) {
		ComplexNumber resulte = new ComplexNumber(this.real_part, this.imag_part);
		resulte.real_part -= n.real_part;
		resulte.imag_part -= n.imag_part;
		return resulte;
	}

	void printNumber() {
		System.out.printf("%.1f + %.1fi\n", this.real_part, this.imag_part);
		System.out.printf("Magnitude : %.15f\n", this.magnitude());
	}
}
