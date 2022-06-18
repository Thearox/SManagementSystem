package za.ac.cput.school_management.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.school_management.domain.lookup.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void buildWithSuccess() {

        Name name = NameFactory
                .createName("Lyle", null, "Haines");
        System.out.println(name);
        assertAll(
                () -> assertNotNull(name),
                () -> assertNotNull(name.getMiddleName())

        );
    }
}