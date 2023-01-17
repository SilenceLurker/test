package xyz.silencelurker.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.silencelurker.test.entity.Admin;

/**
 * @author Silence_Lurker
 */
public interface IAdminRepository extends JpaRepository<Admin, String> {

}
