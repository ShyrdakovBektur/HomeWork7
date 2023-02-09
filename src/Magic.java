public class Magic extends Hero implements HavingSuperAbility {


    @Override
    public void applySuperAbility(String superAbilityType ) {
    System.out.println("Magic применил: " + superAbilityType);

    }
}
