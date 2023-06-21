package com.springcavaj.gcp.sqst.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcavaj.gcp.sqst.model.UserSqlStorage;

public interface SpringGCPSqlStorageRepository extends JpaRepository<UserSqlStorage, Long> {

}
