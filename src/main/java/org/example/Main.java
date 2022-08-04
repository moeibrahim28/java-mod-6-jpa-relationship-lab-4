package org.example;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        List<Object> objectList = new ArrayList<>();

        Actor actor1 = new Actor();
        Actor actor2 = new Actor();
        Actor actor3 = new Actor();
        Actor actor4 = new Actor();
        Actor actor5 = new Actor();
        Actor actor6 = new Actor();







        Character character1 = new Character();
        Character character2 = new Character();
        Character character3 = new Character();
        Character character4 = new Character();
        Character character5 = new Character();
        Character character6 = new Character();
        Character character7 = new Character();
        Character character8 = new Character();
        Character character9 = new Character();
        Character character10 = new Character();

        Show show1 = new Show();
        Show show2 = new Show();
        Show show3 = new Show();
        Show show4 = new Show();
        Show show5 = new Show();
        Show show6 = new Show();
        Show show7 = new Show();

        Network network1 = new Network();
        network1.setChannel(155);
        network1.setCall_letters("CBS");

        Network network2 = new Network();
        network2.setChannel(112);
        network2.setCall_letters("NETFLIX");

        Network network3 = new Network();
        network3.setChannel(160);
        network3.setCall_letters("ABC");

        Network network4 = new Network();
        network4.setChannel(122);
        network4.setCall_letters("TNT");

        Network network5 = new Network();
        network5.setChannel(64);
        network5.setCall_letters("DISNEY");


        actor1.setFirst_name("Steve");
        actor1.setLast_name("Carell");
        actor6.setFirst_name("Dan");
        actor6.setLast_name("Castellaneta");

        show1.setName("The Office");
        show2.setName("The Simpsons");
        show3.setName("Stranger Things");
        show4.setName("Game of Thrones");
        show5.setName("Entourage");
        show6.setName("CSI: Las Vegas");
        show7.setName("The Good Place");


        character1.setName("Michael Scott");
        character2.setName("Dan Gillick");
        character3.setName("Homer Simpson");
        character1.setActor(actor1);
        character2.setActor(actor1);
        character3.setActor(actor6);

        show1.getCharacterList().add(character1);
        show1.setCharacterList(show1.getCharacterList());

        show2.getCharacterList().add(character2);
        show2.getCharacterList().add(character3);
        show2.setCharacterList(show2.getCharacterList());




        actor2.setFirst_name("Noah");
        actor2.setLast_name("Schnapp");
        character4.setName("Will Byers");
        character4.setActor(actor2);
        show3.getCharacterList().add(character4);
        show3.setCharacterList(show3.getCharacterList());



        actor3.setFirst_name("Finn");
        actor3.setLast_name("Wolfhard");
        character5.setName("Mike Wheeler");
        character5.setActor(actor3);
        show3.getCharacterList().add(character5);
        show3.setCharacterList(show3.getCharacterList());


        actor4.setFirst_name("Peter");
        actor4.setLast_name("Dinklage");
        character7.setName("Tyrion Lannister");
        character7.setActor(actor4);
        show4.getCharacterList().add(character7);
        show4.setCharacterList(show4.getCharacterList());
        character8.setName("Peter Dinklage");
        character8.setActor(actor4);
        show5.getCharacterList().add(character7);
        show5.setCharacterList(show5.getCharacterList());


        actor5.setFirst_name("Ted");
        actor5.setLast_name("Danson");
        character9.setName("D.B. Russell");
        character9.setActor(actor5);
        show6.getCharacterList().add(character9);
        show6.setCharacterList(show6.getCharacterList());
        character10.setName("Michael");
        character10.setActor(actor5);
        show7.getCharacterList().add(character10);
        show7.setCharacterList(show7.getCharacterList());


        network1.getShowList().add(show1);
        network1.getShowList().add(show2);
        network2.getShowList().add(show3);
        network3.getShowList().add(show4);
        network4.getShowList().add(show5);
        network4.getShowList().add(show7);
        network5.getShowList().add(show6);

        show1.setNetwork(network1);
        show2.setNetwork(network1);
        show3.setNetwork(network2);
        show4.setNetwork(network3);
        show5.setNetwork(network4);
        show7.setNetwork(network4);
        show6.setNetwork(network5);



        actor1.getCharacterList().add(character1);
        actor1.getCharacterList().add(character2);
        actor2.getCharacterList().add(character4);
        actor3.getCharacterList().add(character6);
        actor4.getCharacterList().add(character7);
        actor4.getCharacterList().add(character8);
        actor5.getCharacterList().add(character9);
        actor5.getCharacterList().add(character10);
        actor6.getCharacterList().add(character3);






        transaction.begin();
        entityManager.persist(show1);
        entityManager.persist(show2);
        entityManager.persist(show3);
        entityManager.persist(show4);
        entityManager.persist(show5);
        entityManager.persist(show6);
        entityManager.persist(show7);

        entityManager.persist(actor1);
        entityManager.persist(actor2);
        entityManager.persist(actor3);
        entityManager.persist(actor4);
        entityManager.persist(actor5);
        entityManager.persist(actor6);

        entityManager.persist(network1);
        entityManager.persist(network2);
        entityManager.persist(network3);
        entityManager.persist(network4);
        entityManager.persist(network5);

        entityManager.persist(character1);
        entityManager.persist(character2);
        entityManager.persist(character3);
        entityManager.persist(character4);
        entityManager.persist(character5);
        entityManager.persist(character6);
        entityManager.persist(character7);
        entityManager.persist(character8);
        entityManager.persist(character9);
        entityManager.persist(character10);



        transaction.commit();

        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}