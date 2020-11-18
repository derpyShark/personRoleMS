package kpi.trspo.personrolesms.service;

import javassist.NotFoundException;
import kpi.trspo.personrolesms.model.PersonRole;

import java.util.List;
import java.util.UUID;

public interface PersonRoleService {
    List<PersonRole> getAll();
    PersonRole getById(UUID roleId) throws NotFoundException;
    PersonRole create(PersonRole personRoleObject);
    PersonRole update(UUID roleId, PersonRole personRoleDetails) throws NotFoundException;
    void delete(UUID roleId) throws NotFoundException;
}
