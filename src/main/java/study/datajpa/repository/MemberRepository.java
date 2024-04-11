package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

//    @Query(name = "Member.findByUsername") // 없어도 관례적으로 먼저 엔티티에서 동일한이름의 쿼리를 서치하고 쿼리 메소드를 만든다.
    List<Member> findByUsername(@Param("username") String username);
}
