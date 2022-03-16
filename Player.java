package com.tutorial.main;

import java.awt.*;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.*;

public class Player extends GameObject{

	Random r = new Random();
	Handler handler;
	
	Timer powerTimer = new Timer(20000, new powerLisetener());
	boolean invincible = false;
	
	
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;

	}
	
	public Rectangle getBounds() {
		return new Rectangle((int) x,(int) y, 32, 32);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 44);
		y = Game.clamp(y, 0, Game.HEIGHT - 66);
		
		if(invincible) {
			handler.addObject(new Trail((int) x,(int) y, ID.Trail, Color.BLUE, 32, 32, 0.03f, handler));
			handler.addObject(new Trail((int) x,(int) y, ID.Trail, Color.magenta, 32, 32, 0.06f, handler));	
		}else
			handler.addObject(new Trail((int)x,(int) y, ID.Trail, Color.white, 32, 32, 0.08f, handler));
		
		collision();
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			
			GameObject tempObject = handler.object.get(i);
				
			//Collision code
			if(tempObject.getId() == ID.BasicEnemy || tempObject.getId() == ID.FastEnemy || tempObject.getId() == ID.SmartEnemy || tempObject.getId() == ID.BossEnemy || tempObject.getId() == ID.FastEnemy2 || tempObject.getId() == ID.RandomEnemy || tempObject.getId() == ID.BossEnemyFast) {
				if(getBounds().intersects(tempObject.getBounds())) {
					if(!invincible)
						HUD.HEALTH -= 2;
					else
						handler.removeObject(tempObject);
					
				}
			}
			
			//Healer
			if(tempObject.getId() == ID.HealerObject) {
				if(getBounds().intersects(tempObject.getBounds())) {
					HUD.HEALTH += 10;
					handler.removeObject(tempObject);
				}
			}
			
			//Power UP
			if(tempObject.getId() == ID.PowerUp) {
				if(getBounds().intersects(tempObject.getBounds())) {
					invincible = true;
					powerTimer.start();
					handler.removeObject(tempObject);
				}
			}
			
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect((int)x,(int) y, 32, 32);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private class powerLisetener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			invincible = false;
			powerTimer.stop();
		}
	}
	

	
	
}
