package com.itechart.webflux.web.core.repository;

import com.itechart.webflux.web.core.model.MeetingHistory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MeetingHistoryRepository extends ReactiveMongoRepository<MeetingHistory, String> {



}