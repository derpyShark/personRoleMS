package kpi.trspo.personrolesms.repository;

import kpi.trspo.personrolesms.model.PersonRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PersonRoleRepository extends JpaRepository<PersonRole, UUID> {
}
