class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }
    public void update(String news) {
        System.out.println("Hi " + name + ", Breaking news for you!");
        System.out.println("("+news+")\n");


    }
}