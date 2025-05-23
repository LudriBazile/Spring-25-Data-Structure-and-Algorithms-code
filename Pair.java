package generics;

public class Pair<TYPEA, TYPEB> {
	private TYPEA first;
	private TYPEB second;
	
	public Pair(TYPEA first, TYPEB second) {
		this.first = first;
		this.second = second;
	}

	public TYPEA getFirst() {
		return first;
	}

	public void setFirst(TYPEA first) {
		this.first = first;
	}

	public TYPEB getSecond() {
		return second;
	}

	public void setSecond(TYPEB second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
}
