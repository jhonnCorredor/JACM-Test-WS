package com.session3.JACM_test_WS.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.session3.JACM_test_WS.Entity.ABaseEntity;

@Repository
public interface IBaseRepository<T extends ABaseEntity,ID> extends JpaRepository<T,Long>{

}
