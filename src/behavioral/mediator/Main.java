package behavioral.mediator;

import behavioral.mediator.problem.User1;
import behavioral.mediator.solution.CollaborativeDocument;
import behavioral.mediator.solution.impl.User;

public class Main {
    public static void main(String[] args) {
        User1 alice1 = new User1("Alice");
        User1 bob1 = new User1("Bob");
        User1 charlie1 = new User1("Charlie");

        // Adding collaborators (Alice gives access to Bob and Charlie)
        alice1.addCollaborator(bob1);
        alice1.addCollaborator(charlie1);

        // you will have to add user to every other user.
        bob1.addCollaborator(alice1);
        bob1.addCollaborator(charlie1);

        charlie1.addCollaborator(alice1);
        charlie1.addCollaborator(bob1);


        // Alice makes a change, notifying Bob and Charlie
        alice1.makeChange("Updated the document title");

        // Bob makes a change, notifying Alice and Charlie
        bob1.makeChange("Added a new section to the document");




        System.out.println("\n\n========================\n\n");





        CollaborativeDocument doc = new CollaborativeDocument();

        // Creating users
        User alice = new User("Alice", doc);
        User bob = new User("Bob", doc);
        User charlie = new User("Charlie", doc);

        // Joining the collaborative document
        doc.join(alice);
        doc.join(bob);
        doc.join(charlie);

        // Users making changes
        alice.makeChange("Added project title");
        bob.makeChange("Corrected grammar in paragraph 2");
    }
}
