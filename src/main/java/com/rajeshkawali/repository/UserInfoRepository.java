package com.rajeshkawali.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.UserInfo;
/**
 * 
 * @author Rajesh_Kawali
 *
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	Optional<UserInfo> findByUsername(String username);
}
