package com.jonasfev.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.jonasfev.main.Game;

public class Player extends Entity{
	
	public boolean right,up,left,down;
	public double speed = 1.4;
	public int right_dir = 0, left_dir = 1;
	public int dir = right_dir;
	
	private int frames = 0, max_frames = 5,index = 0, max_index = 3;
	private boolean moved = false;
	private BufferedImage[] rightplayer;
	private BufferedImage[] leftplayer;

	public Player(int x, int y, int heigth, int height, BufferedImage sprite) {
		super(x, y, heigth, height, sprite);
		// TODO Auto-generated constructor stub
		rightplayer = new BufferedImage[4];
		leftplayer = new BufferedImage[4];
		
		for(int i  = 0; i<4; i++) {
			rightplayer[i] = Game.spritesheet.getSprite(32+(i*16), 0, 16, 16);
			leftplayer[i] = Game.spritesheet.getSprite(32+(i*16), 16, 16, 16);
		}
		
		
	}
	
	public void tick() {
		moved = false;
		if(right) {
			moved = true;
			x+=speed;
			dir = right_dir;
		} else if(left) {
			moved = true;
			x-=speed;
			dir = left_dir;
			
		}
		
		if(up) {
			moved = true;
			y-=speed;
			
			
		} else if(down) {
			moved = true;
			y+=speed;
		}
		
		if(moved) {
			frames++;
			if(frames == max_frames){
				frames = 0;
				index++;
				if(index > max_index) {
					index = 0;
				}
			}
		}
	}
	
	public void render(Graphics g) {
		if(right_dir == dir) {
			g.drawImage(rightplayer[index], this.getX(), this.getY(), null);
		} else if(left_dir == dir) {
			g.drawImage(leftplayer[index], this.getX(), this.getY(), null);
		} 
		
		
		
	}

}
