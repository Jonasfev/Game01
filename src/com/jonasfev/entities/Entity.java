package com.jonasfev.entities;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {
	protected int heigth,height;
	protected double x,y;
	
	private BufferedImage sprite;

	public Entity(int x, int y, int heigth, int height, BufferedImage sprite) {
		this.x = x;
		this.y = y;
		this.heigth = heigth;
		this.height = height;
		this.sprite = sprite;
	}

	public int getX() {
		return (int)x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return (int) y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void render(Graphics g) {
		g.drawImage(sprite, this.getX(), this.getY(),null);
	}
	
	public void tick() {
		
	}
	
	

}
