package builder.musicgroup.userbuilder;

public class SaxBuilder implements BaseBuilder {
    @Override
    public void buildLogin() {
        System.out.println("SaxBuilder buildLogin!");
    }

    @Override
    public void buildPassword() {
        System.out.println("StaxBuilder buildPassword!");
    }
}
