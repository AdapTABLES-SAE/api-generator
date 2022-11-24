package structures;

import java.util.Objects;

import generator.Directions;

public class Coordinate {
	private int X; 
	private int Y; 
	
	public Coordinate() {
		this(0, 0);
	}
	
	public Coordinate(int x, int y) {
		X = x; 
		Y = y; 
	}
		
	public Coordinate(Coordinate c) {
		this(c.getX(), c.getY()); 
	}


	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(X, Y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinate other = (Coordinate) obj;
		return X == other.X && Y == other.Y;
	}
	

	

	public Coordinate getNextCoord(Directions origineD) {
		Coordinate coord = new Coordinate();
		switch (origineD) {
		case SOUTH: coord.setX(X); coord.setY(Y - 1); break;
		case SOUTH_EAST: coord.setX(X + 1); coord.setY(Y - 1); break;
		case SOUTH_WEST: coord.setX(X); coord.setY(Y - 1);  break;
		case NORTH: coord.setX(X); coord.setY(Y + 1); break;
		case NORTH_EAST: coord.setX(X + 1); coord.setY(Y + 2); break;
		case NORTH_WEST: coord.setX(X); coord.setY(Y + 2); break;
		case EAST: coord.setX(X + 1); coord.setY(Y);break;
		case EAST_SOUTH: coord.setX(X + 2); coord.setY(Y); break;
		case EAST_NORTH: coord.setX(X + 2); coord.setY(Y + 1); break;
		case WEST: coord.setX(X - 1); coord.setY(Y); break;
		case WEST_NORTH: coord.setX(X - 1); coord.setY(Y + 1); break;
		case WEST_SOUTH: coord.setX(X - 1); coord.setY(Y); break;
		default: break;
		}
		return coord;
	}

	@Override
	public String toString() {
		return "Coordinate [X=" + X + ", Y=" + Y + "]";
	}
	
}
