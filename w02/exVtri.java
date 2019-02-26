package inheritance;

public class Vtri extends Shape{
	
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Vtri(int height, int type) {
		this.height = height;
		this.type = type;
	}

	public void draw() {
		switch (type) {
		case 1:
			for (int i = 1; i <= height; i++) {
				prchar("*", i);
				System.out.println();
			}
			break;
		case 2:
			for (int i = 1; i <= height; i++) {
				prchar(" ", height - i);
				prchar("*", i);
				System.out.println();
			}
			break;
		case 3:
			for (int i = 1; i <= height; i++) {
				prchar("*", height - i + 1);
				System.out.println();
			}
			break;
		case 4:
			for (int i = 1; i <= height; i++) {
				prchar(" ", i - 1);
				prchar("*", height - i + 1);
				System.out.println();
			}
			break;
		}
	}

	void prchar(String c, int n) {
		for (int i = 1; i <= n; i++)
			System.out.print(c);
	}

}
