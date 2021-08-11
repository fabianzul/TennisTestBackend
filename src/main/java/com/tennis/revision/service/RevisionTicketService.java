package com.tennis.revision.service;

import com.tennis.revision.model.RevisionTicket;
import com.tennis.revision.repository.RevisionTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RevisionTicketService {
    @Autowired
    private RevisionTicketRepository revisionTicketRepository;
    public List<RevisionTicket> listAllRevisionTicket() {
        return revisionTicketRepository.findAll();
    }

    public void saveRevisionTicket(RevisionTicket revisionTicket) {
        revisionTicketRepository.save(revisionTicket);
    }

    public RevisionTicket getRevisionTicket(Integer id) {
        return revisionTicketRepository.findById(id).get();
    }

    public void deleteRevisionTicket(Integer id) {
        revisionTicketRepository.deleteById(id);
    }
}
