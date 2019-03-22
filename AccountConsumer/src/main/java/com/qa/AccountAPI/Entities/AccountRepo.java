package com.qa.AccountAPI.Entities;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends MongoRepository<Account, Long> {

}
