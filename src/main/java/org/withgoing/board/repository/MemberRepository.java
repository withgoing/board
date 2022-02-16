package org.withgoing.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.withgoing.board.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {
}
