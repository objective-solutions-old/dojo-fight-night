package br.com.objective.dfn;

public class MajaCordinate {
	
	public final int a, b;

	public MajaCordinate(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public MajaCordinate nextTo(int direction) {
		switch (direction) {
			case 0: return new MajaCordinate(a - 1, b + 1);
			case 1: return new MajaCordinate(a - 1, b);
			case 2: return new MajaCordinate(a, b - 1);
			case 3: return new MajaCordinate(a + 1, b - 1);
			case 4: return new MajaCordinate(a + 1, b);
			case 5: return new MajaCordinate(a, b + 1);
			
			default: 
				throw new IllegalArgumentException();
		}
	}
	
	@Override
	public String toString() {
		return a + ", " + b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MajaCordinate other = (MajaCordinate) obj;
		return a == other.a && b == other.b;
	}
	
}