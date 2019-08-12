package au.com.avantsystems.examples.builderpattern;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

  int compare(T t1, T t2);

  default Comparator<T> reversed(){
    return (t1, t2) -> this.compare(t2, t1);
  }

  static <T, U extends Comparable<U>> Comparator<T> comparing(Function<T, U> key) {
    return (p1, p2) -> key.apply(p1).compareTo(key.apply(p2));
  }



}
