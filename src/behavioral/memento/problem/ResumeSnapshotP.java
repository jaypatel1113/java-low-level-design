package behavioral.memento.problem;

import java.util.ArrayList;
import java.util.List;

public class ResumeSnapshotP {
    public String name;
    public String education;
    public String experience;
    public List<String> skills;

    public ResumeSnapshotP(ResumeEditorP editor) {
        this.name = editor.name;
        this.education = editor.education;
        this.experience = editor.experience;
        this.skills = new ArrayList<>(editor.skills);
    }

    public void restore(ResumeEditorP editor) {
        editor.name = this.name;
        editor.education = this.education;
        editor.experience = this.experience;
        editor.skills = new ArrayList<>(this.skills);
    }
}
