package com.parker.jpa.repository;

import com.parker.jpa.entity.CommunityBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityBoardRepository extends JpaRepository<CommunityBoardEntity, Long> {
}
