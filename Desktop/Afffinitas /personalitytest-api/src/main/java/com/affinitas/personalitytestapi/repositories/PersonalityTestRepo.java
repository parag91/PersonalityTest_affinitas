package com.affinitas.personalitytestapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.affinitas.personalitytestapi.domain.EmailTestDataSys;

@Repository
public interface PersonalityTestRepo extends CrudRepository<EmailTestDataSys , String> {

}
