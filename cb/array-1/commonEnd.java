public boolean commonEnd(int[] a, int[] b) {
	int lengthA = (a.length -1);
	int lengthB = (b.length -1);
	if (a[0] == b[0] || a[lengthA] == b[lengthB]) {
		return true;
	}
	else {
		return false;
	}
}
