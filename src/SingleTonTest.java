public class SingleTonTest {

    public static void main(String[] args) {

        SingleTon singleTonClass1 = SingleTon.getSingleTon("AmirHossein");
        SingleTon singleTonClass2 = SingleTon.getSingleTon("Akbari");
        System.out.println(singleTonClass1.getName());
        System.out.println(singleTonClass2.getName());

    }
}

class SingleTon {

    private static SingleTon singleTonInstance;
    private String name;

    private SingleTon(String name) {
        this.name = name;
    }

    public static SingleTon getSingleTon(String name) {
        if (singleTonInstance == null)
            singleTonInstance = new SingleTon(name);
        return singleTonInstance;
    }

    public String getName() {
        return name;
    }

}
