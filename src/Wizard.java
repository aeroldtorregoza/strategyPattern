public class Wizard implements CharacterType{
    @Override
    public void attack() {
        CastSpell castSpell = new CastSpell();
        System.out.println("Wizard" + castSpell.attack());
    }

    @Override
    public void defend() {
        CreateMagicDefense createMagicDefense = new CreateMagicDefense();
        System.out.println("Wizard" + createMagicDefense.defend());
    }
}
