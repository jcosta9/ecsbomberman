package br.unb.unbomber.component;

import br.unb.gridphysics.Vector2D;

import com.artemis.Component;

public class Position extends Component{

	private int cellX;
	
	private int cellY;

	public Position(){
		
	}
	
	public Position(int x, int y) {
		this.cellX = x;
		this.cellY = y;
	}

	public int getCellX() {
		return cellX;
	}

	public void setCellX(int cellX) {
		this.cellX = cellX;
	}

	public int getCellY() {
		return cellY;
	}

	public void setCellY(int cellY) {
		this.cellY = cellY;
	}
	
	public Vector2D<Float> centerPosition(){
		return new Vector2D<>(cellX + 0.5f, cellY+ 0.5f);
	}
	
	public Vector2D<Integer> getIndex(){
		return new Vector2D<>(cellX, cellY);
	}
	
	public void setIndex(Vector2D<Integer> index){
		this.cellX = index.getX();
		this.cellY = index.getY();
	}

	public String toString(){
		return getIndex().toString();
	}
	
}
