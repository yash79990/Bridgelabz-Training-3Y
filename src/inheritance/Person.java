package inheritance;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food.");
    }

    public static void main(String[] args) {
        Worker[] workers = {
                new Chef("Amit", 1),
                new Waiter("Rohit", 2)
        };

        for (Worker w : workers) w.performDuties();
    }
}