
package post.test.inheritance.pkg71150059;

public class Player {
    protected String name;
    protected double att;
    protected double def;
    protected double health;

    protected Player(String nama, double att, double def) {
        this.name = nama;
        this.att = att;
        this.def = def;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAtt() {
        return att;
    }

    public void setAtt(double att) {
        this.att = att;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    public void status(Player p) {
        if(p.getHealth() <= 0) {
            System.out.println("Player won!");
        } else {
            System.out.println("Enemy won!");
        }
    }
    
    public void infoStat() {
        System.out.println("Class: " + this.name);
        System.out.println("Attack: " + this.att);
        System.out.println("Defense: " + this.def);
    }
    
    public void buffAttack() {
        this.att += (this.att * 1);
    }
    
    public void buffDefense() {
        this.def += (this.def * 1);
    }
    
    public void attack(Player p) {
        System.out.println(this.name + " Attack " + p.getName());
        p.setHealth(p.getHealth() - Math.abs(this.att - p.getDef()));
        this.setHealth(this.health - Math.abs(this.def - p.getAtt()));
        
        System.out.println("Sisa nyawa " + this.getName() + " " + this.health);
        System.out.println("Sisa nyawa " + p.getName() + " " + p.getHealth());
        
        if(p.getHealth() <= 0 || this.health <= 0) {
            this.status(p);
        }
    }
}
