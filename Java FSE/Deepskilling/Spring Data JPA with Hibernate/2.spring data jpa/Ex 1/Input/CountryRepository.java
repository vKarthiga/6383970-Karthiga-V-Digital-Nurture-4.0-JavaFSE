import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Find countries where name contains a specific string (case-sensitive by default)
    List<Country> findByNameContaining(String keyword);

    // 2. Find countries by name containing a keyword and return results in ascending order
    List<Country> findByNameContainingOrderByNameAsc(String keyword);

    // 3. Find countries where name starts with a specific character
    List<Country> findByNameStartingWith(String prefix);
}
