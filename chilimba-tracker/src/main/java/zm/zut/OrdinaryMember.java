package zm.zut;

import java.time.LocalDate;

public class OrdinaryMember extends User {
    
    public OrdinaryMember(String id, String name, String phone, LocalDate joinDate) {
        super(id, name, phone, joinDate);
    }

    @Override
    public String getRoleName() {
        return "Ordinary Member";
    }

    @Override
    public boolean canManageFunds() {
        return false; // Ordinary members can only view records
    }
}