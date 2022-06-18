package za.ac.cput.school_management.repository.lookup;

/*
Lyle Haines - 217245919
ADP3 JUNE ASSIGNMENT
NameRepository.java
*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.school_management.domain.lookup.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, String> {

}
