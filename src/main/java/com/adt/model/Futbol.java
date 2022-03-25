package com.adt.model;

/** Futbol model. */
public class Futbol {

  private String team;
  private String country;
  private int trophys;
  private String bestPlayer;
  private String city;

  /**
   * Futbol constructor.
   *
   * @param team Team of futbol
   * @param country Country of the team
   * @param trophys Quantity of throphys
   * @param bestPlayer Best player of the team
   * @param city City of the team
   */
  public Futbol(String team, String country, int trophys, String bestPlayer, String city) {
    this.team = team;
    this.country = country;
    this.trophys = trophys;
    this.bestPlayer = bestPlayer;
    this.city = city;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getTrophys() {
    return trophys;
  }

  public void setTrophys(int trophys) {
    this.trophys = trophys;
  }

  public String getBestPlayer() {
    return bestPlayer;
  }

  public void setBestPlayer(String bestPlayer) {
    this.bestPlayer = bestPlayer;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
