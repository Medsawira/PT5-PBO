
package post.test.inheritance.pkg71150059;

public class Mage extends Player {
    
    public Mage() {
        super("MAGE", 25, 10);
    }
    
    @Override
    public void buffAttack() {
        super.buffAttack();
    }
    
    @Override
    public void buffDefense() {
        this.def += (this.def * 0.2);
    }
    
    @Override
    public void attack(Player p) {
        
    }
    
}
