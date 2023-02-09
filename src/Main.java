public class Main {
    public static void main(String[] args) {

            Warrior warrior = new Warrior();
            warrior.damage = 25;
            warrior.health = 230;
            warrior.typeOfPower = "super kick";

            Magic magic = new Magic();
            magic.damage = 40;
            magic.health = 200;
            magic.typeOfPower = "fire ball";

            Medic medic = new Medic();
            medic.damage = 0;
            medic.health = 150;
            medic.typeOfPower = "revival";

            HavingSuperAbility superAbilities[] = {medic, warrior, magic};
            for (int i = 0; i < superAbilities.length; i++) {
                superAbilities[i].applySuperAbility("REVIVAL");
                superAbilities[i].applySuperAbility("FIRE BALL");
                superAbilities[i].applySuperAbility("SUPER KICK");
        }
    }
}
