package com.adt.services.Stack;

import com.adt.model.Futbol;
import com.adt.repository.FutbolRepository;
import java.util.Stack;

/**
 * A stack is LIFO ("List In, First Out") data structure that contains similar elements arranged in
 * an ordered. All the operations in stack place at the top of the stack.
 */
public class StackAdt {

  /** FutbolRepository variable. */
  FutbolRepository futbolRepository;

  /**
   * StackAdt Constructor.
   *
   * @param futbolRepository Fubol Repository
   */
  public StackAdt(FutbolRepository futbolRepository) {
    this.futbolRepository = futbolRepository;
  }

  /**
   * Creators is an operation of ADT.
   *
   * @return Stack
   */
  public Stack<Futbol> creatorsStack() {
    Stack<Futbol> futbolStack = new Stack<>();
    futbolStack.addAll(futbolRepository.getAllFutbollTeamsStack());

    return futbolStack;
  }

  /**
   * Mutator is an operation of ADT.
   *
   * @return Stack
   */
  public Stack<Futbol> mutatorStack() {
    futbolRepository.getAllFutbollTeamsStack().pop();
    return futbolRepository.getAllFutbollTeamsStack();
  }

  /**
   * Observer is an operation of ADT.
   *
   * @return Stack
   */
  public Futbol observerStack() {
    return futbolRepository.getAllFutbollTeamsStack().peek();
  }
}
