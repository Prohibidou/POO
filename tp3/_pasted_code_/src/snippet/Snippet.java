package snippet;

public class Snippet {
	Random rand = new Random();
	int r = rand.nextInt(10000000);
	int m = r % 10;
	if (m < 1) return 1; // 10 %
	else if (m < 4) return 2; // 30 %
	else return 3; // 60 %
}

