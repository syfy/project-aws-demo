package com.project.web.repository;





import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.web.domains.Profile;
import com.project.web.domains.ProfileLocal;
@Component
@Transactional
@Repository
public interface ProfileDao extends JpaRepository<ProfileLocal ,String> {

}
