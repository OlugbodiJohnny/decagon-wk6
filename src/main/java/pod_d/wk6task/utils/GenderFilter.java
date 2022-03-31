package pod_d.wk6task.utils;

import pod_d.wk6task.enums.Gender;

import java.util.Arrays;
import java.util.Locale;

public class GenderFilter {
    public static Gender getGender(String gender){
        Gender[] genderList = Gender.values();
        for (Gender value : genderList) {
            String enumGender = value.toString().toLowerCase(Locale.ROOT);
            if (enumGender.equals(gender.toLowerCase(Locale.ROOT))) {
                return value;
            }
        }
        return null;
    }
}