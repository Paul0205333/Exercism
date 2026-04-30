class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{    

    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable(){
        return false;
    }

    public int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter{
    public boolean preparedSpell = false;

    
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        preparedSpell = true;
    }

    @Override
    public boolean isVulnerable(){
        return !preparedSpell;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        if(preparedSpell){
            return 12;
        }
        return 3;
    }
    
}