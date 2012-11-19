package br.com.objective.dfn;

public class Converter {

	public MajaCordinate convert(int williCordinate) {
		int currentRing = 1;
		int currentRingSize = 6;
		int iRing = 0;
		MajaCordinate current = new MajaCordinate(0, 0);
		
		for (int i = 2; i <= williCordinate; i++) {
			if (iRing >= currentRingSize) {
				currentRing++;
				currentRingSize = currentRing * 6;
				iRing = 0;
			}
			
			int nextCellDirection = iRing == 0 ? 5 : iRing / currentRing;
			current = current.nextTo(nextCellDirection);
			
			iRing++;
		}
		
		return current;
	}

}
