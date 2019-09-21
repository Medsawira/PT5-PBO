
package post.test.inheritance.pkg71150059;

public class Golem extends Player {
    
    public Golem() {
        super("GOLEM", 10, 20);
    }
    
    @Override
    public void buffAttack() {
        this.att += (this.att * 0.2);
    }
    
    @Override
    public void buffDefense() {
        super.buffDefense();
    }
    
    @Override
    public void attack(Player p) {
        
    }
    
}
