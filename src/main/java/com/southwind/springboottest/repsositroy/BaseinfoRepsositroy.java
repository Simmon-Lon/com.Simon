package com.southwind.springboottest.repsositroy;

import com.southwind.springboottest.entity.Baseinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface BaseinfoRepsositroy extends JpaRepository<Baseinfo, BigInteger> {

}
