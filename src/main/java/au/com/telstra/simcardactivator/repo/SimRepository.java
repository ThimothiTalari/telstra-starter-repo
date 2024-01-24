package au.com.telstra.simcardactivator.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import au.com.telstra.simcardactivator.entity.SimEntity;

@Repository
public interface SimRepository extends JpaRepository<SimEntity,String>
{
	
}
