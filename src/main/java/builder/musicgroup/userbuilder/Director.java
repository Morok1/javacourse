package builder.musicgroup.userbuilder;

public class Director {
    private BaseBuilder builder;

    public Director(BaseBuilder builder) {
        this.builder = builder;
    }

    public void build(String type){
        builder.buildLogin();
        builder.buildPassword();
    }
}
