package com.adt.services.Queue;

import com.adt.repository.FutbolRepository;

/**
 * Queue is a data structure that follow the first in first out ("FIFO"). Can performed delete o
 * insert operation at the end and at the beginning of the Queue.
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
}
