package com.springTraining.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springTraining.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}