package StructuralPatterns.Composite;
import java.util.ArrayList;
import java.util.List;
class GroupComposite implements StudentComponent {
    private String groupName;
    private List<StudentComponent> members;

    GroupComposite(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    void addMember(StudentComponent member) {
        members.add(member);
    }

    @Override
    public void displayDetails() {
        System.out.println("Group: " + groupName);
        System.out.println("Members:");
        for (StudentComponent member : members) {
            member.displayDetails();
        }
    }
}
