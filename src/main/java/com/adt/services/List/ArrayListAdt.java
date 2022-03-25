package com.adt.services.List;

import com.adt.model.Futbol;
import com.adt.repository.FutbolRepository;
import java.util.ArrayList;
import java.util.List;

/**
 * A list is an ordered collection of the same data type. Ordered doesn´t mean that the list is
 * sorted, but is indexed. List is an Interface
 */
public class ArrayListAdt {

  /** FutbolRepository variable. */
  FutbolRepository futbolRepository;

  /**
   * ListAdt Constructor.
   *
   * @param futbolRepository Futbol Repository.
   */
  public ArrayListAdt(FutbolRepository futbolRepository) {
    this.futbolRepository = futbolRepository;
  }

  /** Creators is one of the operations of ADT. Create a new objects of the type. */
  public List<Futbol> creatorList() {
    Futbol borussiaDormund = new Futbol("Borussia Dortmund", "Germany", 1, "Haland", "Dortmund");

    futbolRepository.getAllFutbollTeamsArrayList().add(borussiaDormund);
    List<Futbol> futbolList = new ArrayList<Futbol>(futbolRepository.getAllFutbollTeamsArrayList());

    return futbolList;
  }

  /**
   * Mutators is one of the operations of ADT. Mutator implie that can change the object. Mutators
   * operations in List Interface contains add, remove, addAll, removeAll, removeAt, replace
   *
   * @param futbol Futbol object
   * @return List of futbol
   */
  public List<Futbol> mutatorList(Futbol futbol) {
    futbolRepository.getAllFutbollTeamsArrayList().add(futbol);
    return futbolRepository.getAllFutbollTeamsArrayList();
  }

  /**
   * Observers is one of the operations of ADT. Observers take the objects and return other objects
   * from a different data type.
   *
   * @return Boolean if is empty
   */
  public Boolean observerList() {
    return futbolRepository.getAllFutbollTeamsArrayList().isEmpty();
  }
}
