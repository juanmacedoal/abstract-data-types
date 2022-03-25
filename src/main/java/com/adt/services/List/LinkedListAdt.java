package com.adt.services.List;

import com.adt.model.Futbol;
import com.adt.repository.FutbolRepository;
import java.util.LinkedList;

/**
 * LinkedList belongs to the Collections Frameworks. Is a linear data structure where the elements
 * are not stored in contiguous locations and every element is separate object with data part and
 * address part. The elements are linked using pointers and addresses. Each element is a node.
 */
public class LinkedListAdt {

  /** FutbolRepository variable. */
  FutbolRepository futbolRepository;

  /**
   * LinkedListAdt Consturctor.
   *
   * @param futbolRepository Futbol repository
   */
  public LinkedListAdt(FutbolRepository futbolRepository) {
    this.futbolRepository = futbolRepository;
  }

  /** Creators is one of the operations of ADT. Create a new objects of the type. */
  public LinkedList<Futbol> creatorsLinkedList() {

    Futbol borussiaDormund = new Futbol("Borussia Dortmund", "Germany", 1, "Haland", "Dortmund");
    futbolRepository.getAllFutbollTeamsLinkedList().add(3, borussiaDormund);
    LinkedList<Futbol> futbolLinkedList =
        new LinkedList<Futbol>(futbolRepository.getAllFutbollTeamsLinkedList());

    return futbolLinkedList;
  }

  /** Creators is one of the operations of ADT. Create a new objects of the type. */
  public LinkedList<Futbol> mutatorLinkedList(Futbol futbol) {
    futbolRepository.getAllFutbollTeamsLinkedList().add(3, futbol);
    return futbolRepository.getAllFutbollTeamsLinkedList();
  }
}
