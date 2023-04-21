package facade;

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import subsistema1.crm.CrmService;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrateClient("Murilo", "59178-000");

        System.out.println(facade);
    }
};