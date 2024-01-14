package com.parker.jpa.repository;

import com.parker.jpa.entity.ServiceNoticeBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceNoticeBoardRepository extends JpaRepository<ServiceNoticeBoardEntity, Long> {
}
