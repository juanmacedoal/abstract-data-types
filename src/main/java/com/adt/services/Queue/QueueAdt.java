package com.adt.services.Queue;

import com.adt.model.Futbol;
import com.adt.repository.FutbolRepository;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue is a data structure that follow the first in first out ("FIFO"). Can performed delete o
 * insert operation at the end and at the beginning of the Queue. It is an Interface, since, to use
 * it, we need to use a class which implements Queue like LinkedList and PrioiryQueue.
 */
public class QueueAdt {

  /** FutbolRepository variable. */
  FutbolRepository futbolRepository;

  /**
   * Queue Adt Constructor.
   *
   * @param futbolRepository FutbolRepository
   */
  public QueueAdt(FutbolRepository futbolRepository) {
    this.futbolRepository = futbolRepository;
  }

  /** Creators is one of the operations of ADT. Create a new objects of the type. */
  public Queue<Futbol> creatorQueue() {
    Futbol borussiaDormund = new Futbol("Borussia Dortmund", "Germany", 1, "Haland", "Dortmund");

    futbolRepository.getAllFutbollTeamsLinkedList().add(borussiaDormund);
    LinkedList<Futbol> futbolList =
        new LinkedList<>(futbolRepository.getAllFutbollTeamsLinkedList());

    return futbolList;
  }

  /**
   * Mutators is one of the operations of ADT. Mutator implie that can change the object. Mutators
   * operations in List Interface contains add, remove, addAll, removeAll, removeAt, replace
   *
   * @return List of futbol
   */
  public Queue<Futbol> mutatorList() {
    futbolRepository.getAllFutbollTeamsLinkedList().removeLast();
    return futbolRepository.getAllFutbollTeamsLinkedList();
  }

  /**
   * Observers is one of the operations of ADT. Observers take the objects and return other objects
   * from a different data type.
   *
   * @return Boolean if is empty
   */
  public Boolean observerList() {
    return futbolRepository.getAllFutbollTeamsLinkedList().isEmpty();
  }
}
