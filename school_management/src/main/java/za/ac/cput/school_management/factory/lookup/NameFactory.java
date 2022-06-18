package za.ac.cput.school_management.factory.lookup;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameFactory.java
*/

import za.ac.cput.school_management.domain.lookup.Name;
import za.ac.cput.school_management.helper.StringHelper;

public class NameFactory {

    public static Name createName(String firstName, String middleName, String lastName) {

        StringHelper.checkStringParam("firstName", firstName);
        StringHelper.checkStringParam("middleName", middleName);
        StringHelper.checkStringParam("lastName", lastName);

        StringHelper.setEmptyIfNull("firstName", firstName);
        StringHelper.setEmptyIfNull("middleName", middleName);
        StringHelper.setEmptyIfNull("lastName", lastName);

        Name name = new Name.Builder().FirstName(firstName)
                .MiddleName(middleName)
                .LastName(lastName)
                .build();
        return name;
    }
}
