package patterns.builder;

public class Car {
    private Integer size;
    private Integer volume;
    private String name;

    public Car(Integer size, Integer volume, String name) {
        this.size = size;
        this.volume = volume;
        this.name = name;
    }

    public static class Builder {
        private Integer size;
        private Integer volume;
        private String name;

        public Builder() {
        }

        public Builder builder(){
            return new Car.Builder();
        }

        public Car.Builder name(String  name){
            this.name = name;
            return this;
        }

        public Car.Builder size(Integer name){
            this.size = size;
            return this;
        }

        public Car.Builder volume(Integer volume){
            this.volume = volume;
            return this;
        }

        public Car build(){
            return new Car(this.size,  this.volume, this.name);
        }
    }
}
