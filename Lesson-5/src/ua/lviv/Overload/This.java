package ua.lviv.Overload;

public class This {

	private int w;
	private int h;
	private int r;

	public This() {
		this.r = 10;

	}

	public This(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public This(int w, int h, int r) {
		this(w, h);
		this.r = r;

	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "This [w=" + w + ", h=" + h + ", r=" + r + "]";
	}

}
