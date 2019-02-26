package tue;

public class Vtri {
	private int height;
	private int type;

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
