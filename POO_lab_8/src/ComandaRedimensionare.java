public class ComandaRedimensionare extends Comanda{
    @Override
    public void executa(Imagine imagine) {
        imagine.setLungime(imagine.getLungime() + imagine.getLungime() / 2);
        imagine.setLatime(imagine.getLatime() + imagine.getLatime() / 2);
    }
    @Override
    public void anuleaza(Imagine imagine) {
        imagine.setLungime(imagine.getLungime() - imagine.getLungime() / 2);
        imagine.setLatime(imagine.getLatime() - imagine.getLatime() / 2);
    }
}
