package com.tutorial.main;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();

	private int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 250) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			//Level System Spawning
			if(hud.getLevel() == 2) {	
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 4){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
			}else if(hud.getLevel() == 5){
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 6){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 7){
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 8){
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 9){
				handler.clearEnemies();
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
			}else if(hud.getLevel() == 10){ //Boss 1
				handler.clearEnemies();
				handler.addObject(new BossEnemyFast((Game.WIDTH / 2) -48, -120, ID.BossEnemyFast, handler));
				handler.addObject(new BossEnemy((Game.WIDTH / 2) -48, -120, ID.BossEnemy, handler));  //Boss Spawns
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
				handler.addObject(new PowerUp(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.PowerUp, handler));
			}else if(hud.getLevel() == 15){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 20){
				handler.clearEnemies();  //Level 2
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 21){
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 22){
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
			}else if(hud.getLevel() == 23){
				handler.clearEnemies();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 24){
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 25){
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
			}else if(hud.getLevel() == 26) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 27) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 28) {
				handler.clearEnemies();
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
			}else if(hud.getLevel() == 29) {
				handler.clearEnemies();
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
				handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler));
			}else if(hud.getLevel() == 30) {  // Boss 2
				handler.clearEnemies();
				handler.addObject(new BossEnemyFast((Game.WIDTH / 2) -48, -120, ID.BossEnemyFast, handler));
			}else if(hud.getLevel() == 35 ) {
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
				handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler));
			}else if(hud.getLevel() == 40) { //Level 3
				handler.clearEnemies();
			}
			
			//handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));  Basic Enemy
			//handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));  Fast Enemy
			//handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy2, handler)); Fast Enemy 2.0
			//handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));  Smart Enemy
			//handler.addObject(new RandomEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.RandomEnemy, handler));  Random Enemy
			
			//handler.addObject(new BossEnemy((Game.WIDTH / 2) -48, -120, ID.BossEnemy, handler)); First Boss Enemy
			//handler.addObject(new BossEnemyFast((Game.WIDTH / 2) -48, -120, ID.BossEnemyFast, handler));  Second Boss Enemy
			
			//handler.addObject(new HealerObject(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.HealerObject, handler)); Healer Object
			
		}
	}	
}
