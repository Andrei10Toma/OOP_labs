public class ComandaLuminozitate extends Comanda{
    @Override
    public void executa(Imagine imagine) {
        imagine.setNivelLuminozitate(imagine.getNivelLuminozitate() + 1);
    }

    @Override
    public void anuleaza(Imagine imagine) {
        imagine.setNivelLuminozitate(imagine.getNivelLuminozitate() - 1);
    }
}
