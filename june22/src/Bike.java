abstract class Bike {
    abstract void horn();
    abstract void engine();
    abstract void tyre();
    abstract void headlight();

}
class Honda extends Bike{

    @Override
    void horn() {
        System.out.println("this is honda horn");
    }

    @Override
    void engine() {
        System.out.println("this is honda engine");
    }

    @Override
    void tyre() {
        System.out.println("this is honda tyre");
    }

    @Override
    void headlight() {
        System.out.println("this is honda headlight");
    }
}
class Hero extends Bike{

    @Override
    void horn() {
        System.out.println("this is hero horn");
    }

    @Override
    void engine() {
        System.out.println("this is hero engine");
    }

    @Override
    void tyre() {
        System.out.println("this is hero tyre");
    }

    @Override
    void headlight() {
        System.out.println("this is hero headlight");
    }
}
class bullet extends Bike{

    @Override
    void horn() {
        System.out.println("rhis is bullet horn");
    }

    @Override
    void engine() {
        System.out.println("rhis is bullet engine");
    }

    @Override
    void tyre() {
        System.out.println("rhis is bullet tyre");
    }

    @Override
    void headlight() {
        System.out.println("rhis is bullet headlight");
    }
}
class TVS extends Bike{

    @Override
    void horn() {
        System.out.println("This is tvs horn");
    }

    @Override
    void engine() {
        System.out.println("This is tvs engine");
    }

    @Override
    void tyre() {
        System.out.println("This is tvs tyre");
    }

    @Override
    void headlight() {
        System.out.println("This is tvs headlight");
    }
}