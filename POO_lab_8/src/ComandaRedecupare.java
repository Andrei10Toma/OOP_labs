public class ComandaRedecupare extends Comanda{
    @Override
    public void executa(Imagine imagine) {
        imagine.setLatime(imagine.getLatime() - 20);
        imagine.setLungime(imagine.getLungime() - 30);
    }

    @Override
    public void anuleaza(Imagine imagine) {
        imagine.setLatime(imagine.getLatime() + 20);
        imagine.setLungime(imagine.getLungime() + 30);
    }
}
