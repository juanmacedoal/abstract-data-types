package com.adt.repositories;

import com.adt.model.Futbol;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** Futbol data. */
public class FutbolRepository {

  /**
   * List of the greatest fubtol teams.
   *
   * @return List of Futbol
   */
  public List<Futbol> getAllFutbollTeamsArrayList() {
    List<Futbol> futbolList = new ArrayList<>();
    Futbol realMadrid = new Futbol("Real Madrid", "Spain", 90, "Benzema", "Madrid");
    futbolList.add(realMadrid);
    Futbol fcBacerlona = new Futbol("FC Barcelona", "Spain", 90, "Pedri", "Barcelona");
    futbolList.add(fcBacerlona);
    Futbol chelsea = new Futbol("Chelsea", "England", 90, "Kai Havertz", "London");
    futbolList.add(chelsea);
    Futbol bayernMunich = new Futbol("Bayern Munich", "Germany", 90, "Lewandoski", "Munich");
    futbolList.add(bayernMunich);
    Futbol manCity = new Futbol("Manchester City", "England", 90, "Kevin De Bruyne", "Manchester");
    futbolList.add(manCity);

    return futbolList;
  }

  /**
   * List of the greatest fubtol teams.
   *
   * @return List of Futbol
   */
  public LinkedList<Futbol> getAllFutbollTeamsLinkedList() {
    LinkedList<Futbol> futbolList = new LinkedList<>();
    Futbol realMadrid = new Futbol("Real Madrid", "Spain", 90, "Benzema", "Madrid");
    futbolList.add(realMadrid);
    Futbol fcBacerlona = new Futbol("FC Barcelona", "Spain", 90, "Pedri", "Barcelona");
    futbolList.add(fcBacerlona);
    Futbol chelsea = new Futbol("Chelsea", "England", 90, "Kai Havertz", "London");
    futbolList.add(chelsea);
    Futbol bayernMunich = new Futbol("Bayern Munich", "Germany", 90, "Lewandoski", "Munich");
    futbolList.add(bayernMunich);
    Futbol manCity = new Futbol("Manchester City", "England", 90, "Kevin De Bruyne", "Manchester");
    futbolList.add(manCity);

    return futbolList;
  }
}
