package ${pPackage}.dao;

import ${pPackage}.pojo.${ClassName};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ${ClassName}Dao extends JpaRepository<${ClassName},String> ,JpaSpecificationExecutor<${ClassName}> {
}
