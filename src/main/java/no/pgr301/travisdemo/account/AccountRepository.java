package no.pgr301.travisdemo.account;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    List<Account> findBySocialSecurityNumber(@Param("ssn") String name);

}