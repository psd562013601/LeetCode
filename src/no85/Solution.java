package no85;

public class Solution {
	public int maximalRectangle(char[][] matrix) {
		int lenx = matrix.length;
		if(0==lenx)
			return 0;
		int leny = matrix[0].length;
		
		int maxX=-1;
		int minX=lenx;
		int maxY=-1;
		int minY=leny;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ('0' != matrix[i][j]) {
					maxX = i > maxX ? i : maxX;
					minX = i < minX ? i : minX;
					maxY = j > maxY ? j : maxY;
					minY = j < minY ? j : minY;
				}
			}
		}
		if(maxX<minX)
			return 0;
		return (maxX-minX+1) * (maxY-minY+1);
	}
}