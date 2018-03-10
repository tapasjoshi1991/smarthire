package com.gspann.hiring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gspann.hiring.bean.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

}
