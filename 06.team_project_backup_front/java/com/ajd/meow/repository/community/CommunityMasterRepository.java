package com.ajd.meow.repository.community;

import java.util.List;
import com.ajd.meow.entity.CommunityImage;
import com.ajd.meow.entity.CommunityMaster;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
public interface CommunityMasterRepository extends JpaRepository<CommunityMaster,Long> {

    Page<CommunityMaster> findBySubjectContaining(String searchKeyword, Pageable pageable);

    Page<CommunityMaster> findAllByUserNo(Long userNo, Pageable pageable); // 유저넘버로 게시글 찾기 - 페이징?
    List<CommunityMaster> findAllByUserNo(Long userNo); // 유저넘버로 게시글 찾기
    CommunityMaster findByPostNo(Long postNo);

    Page<CommunityMaster> findAllByCommunityId(String communityId, Pageable pageable);
    @Override
    <S extends CommunityMaster> Page<S> findAll(Example<S> example, Pageable pageable);

    //230224 추가
    Page<CommunityMaster> findBySubjectContainingAndCommunityId(String searchKeyword, String communityId, Pageable pageable);

    // 230225 추가
    Page<CommunityMaster> findBySubjectContainingAndUserNo(String searchKeyword, Long userNo, Pageable pageable);

    /*@Transactional
    @Query(value = "select * from CMNTY_MSTR where CMNTY_ID=:communityId and SUBJECT like ':subject' order by POST_NO DESC", nativeQuery = true)
    Page<CommunityMaster> findBySubjectAndCommunityId(@Param("communityId")String communityId, @Param("subject")String subject, Pageable pageable);*/

}