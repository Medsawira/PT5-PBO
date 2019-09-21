
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		knight k1 = new Knight();
		Mage m1 = new Mage();
		Golem g1 =new Golem();
		m1.infoStat();
		m1.buffAttack();
		m1.infoStat();
		m1.attack(k1);
		m1.attack(k1);
		m1.attack(k1);
		
		g1.attack(m1);
		g1.attack(m1);
		g1.attack(m1);
		g1.attack(m1);
		

	}

}
