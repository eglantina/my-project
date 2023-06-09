package testapp.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import testapp.domain.Conference;

/**
 * Spring Data SQL repository for the Conference entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {}
