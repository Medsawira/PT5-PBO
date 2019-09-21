
package post.test.inheritance.pkg71150059;

public class Knight extends Player {
    
    public Knight() {
        super("KNIGHT", 20, 15);
    }
    
    @Override
    public void buffAttack() {
        this.att += (this.att * 0.7);
    }
    
    @Override
    public void buffDefense() {
        this.def += (this.def * 0.8);
    }
    
    @Override
    public void attack(Player p) {
        super.attack(p);
    }    
}
