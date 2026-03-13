package behavioral.memento;

import behavioral.memento.problem.ResumeEditorP;
import behavioral.memento.problem.ResumeSnapshotP;
import behavioral.memento.solution.ResumeEditor;
import behavioral.memento.solution.ResumeHistory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ResumeEditorP editor1 = new ResumeEditorP();
        editor1.name = "Alice";
        editor1.education = "B.Tech in CS";
        editor1.experience = "2 years at ABC Corp";
        editor1.skills = new ArrayList<>(Arrays.asList("Java", "SQL"));

        // Step 1: Create a snapshot before making changes
        ResumeSnapshotP snapshot = new ResumeSnapshotP(editor1);

        // Step 2: Modify the resume
        editor1.name = "Alice Johnson";
        editor1.skills.add("Spring Boot");

        System.out.println("After changes:");
        System.out.println("Name: " + editor1.name);
        System.out.println("Skills: " + editor1.skills);

        // Step 3: Restore previous state using snapshot
        snapshot.restore(editor1);

        System.out.println("\nAfter undo:");
        System.out.println("Name: " + editor1.name);
        System.out.println("Skills: " + editor1.skills);






        System.out.println("\n\n========================\n\n");







        ResumeEditor editor = new ResumeEditor();
        ResumeHistory history = new ResumeHistory();

        editor.setName("Alice");
        editor.setEducation("B.Tech CSE");
        editor.setExperience("Fresher");
        editor.setSkills(Arrays.asList("Java", "DSA"));
        history.save(editor);

        editor.setExperience("SDE Intern at TUF+");
        editor.setSkills(Arrays.asList("Java", "DSA", "LLD", "Spring Boot"));
        history.save(editor);

        editor.printResume(); // Shows updated experience
        System.out.println();

        history.undo(editor);
        editor.printResume(); // Shows resume after one undo
        System.out.println();

        history.undo(editor);
        editor.printResume(); // Shows resume after second undo (initial state)
    }
}
