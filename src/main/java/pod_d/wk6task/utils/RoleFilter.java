package pod_d.wk6task.utils;

import pod_d.wk6task.enums.Gender;
import pod_d.wk6task.enums.Role;

import java.util.Locale;

public class RoleFilter {
    public static Role getRole(String role){
        Role[] roleList = Role.values();
        for (Role value : roleList) {
            String enumRole = value.toString().toLowerCase(Locale.ROOT);
            if (enumRole.equals(role.toLowerCase(Locale.ROOT))) {
                return value;
            }
        }
        return null;
    }
}
