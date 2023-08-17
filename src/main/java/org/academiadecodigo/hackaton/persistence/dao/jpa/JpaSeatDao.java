package org.academiadecodigo.hackaton.persistence.dao.jpa;

import org.academiadecodigo.hackaton.persistence.dao.SeatDao;
import org.academiadecodigo.hackaton.persistence.model.Seat;

public class JpaSeatDao extends GenericJpaDao<Seat> implements SeatDao {

    public JpaSeatDao () {

        super(Seat.class);
    }

}
