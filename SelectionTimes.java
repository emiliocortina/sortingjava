package labs.lab2sorting;

public class SelectionTimes {

	public static void main(String arg[]) {
		int[] v;
		int nTimes = Integer.parseInt(arg[0]); // size of the problem

		System.out.println("SORTED VECTOR");
		for (int n = 2; n < 10000; n *= 2) {
			v = new int[n];
			Vector.sorted(v);

			long t1 = System.currentTimeMillis();
			for (int i = 0; i < nTimes; i++) {
				Selection.selection(v);
			}
			long t2 = System.currentTimeMillis();
			System.out.println("\tn=" + n + "\tTIME TAKEN: " + (t2 - t1));
		}

		System.out.println("INVERSELY SORTED");
		for (int n = 2; n < 10000; n *= 2) {
			v = new int[n];
			Vector.inverselySorted(v);

			long t1 = System.currentTimeMillis();
			for (int i = 0; i < nTimes; i++) {
				Selection.selection(v);
			}
			long t2 = System.currentTimeMillis();

			System.out.println("\tn=" + n + "\tTIME TAKEN: " + (t2 - t1));
		}

		System.out.println("RANDOMLY SORTED");
		for (int n = 2; n < 10000; n *= 2) {
			v = new int[n];
			Vector.random(v, 1000000);

			long t1 = System.currentTimeMillis();
			for (int i = 0; i < nTimes; i++) {
				Selection.selection(v);
			}
			long t2 = System.currentTimeMillis();

			System.out.println("\tn=" + n + "\tTIME TAKEN: " + (t2 - t1));
		}
	}

}
