package com.meanlightk.study.repository;

import com.meanlightk.study.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 스프링 데이터 JPA
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    /**
     * select m from Member m where m.name = ?
     * findByNameOrId findByNameAndId ...
     */

    @Override
    Optional<Member> findByName(String name);
}
