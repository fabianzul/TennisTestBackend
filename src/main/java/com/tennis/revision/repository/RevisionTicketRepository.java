package com.tennis.revision.repository;

import com.tennis.revision.model.RevisionTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevisionTicketRepository extends JpaRepository<RevisionTicket, Integer> {
}
