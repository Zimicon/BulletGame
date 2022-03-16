package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FastEnemy2 extends GameObject{
	
	private Handler handler;

	public FastEnemy2(int x, int y, ID id, Handler handler) {
		super(x, y, id);

		this.handler = handler;
		
		velX = 9;
		velY = 2;
		
	}
	
	
	public Rectangle getBounds() {
		return new Rectangle((int)x,(int)y, 16, 16);
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
		
		handler.addObject(new Trail((int)x,(int) y, ID.Trail, Color.blue, 16, 16, 0.06f, handler));
	}

	
	public void render(Graphics g) {
		
		
		g.setColor(Color.blue);
		g.fillRect((int)x, (int)y, 16, 16);
	}

}
