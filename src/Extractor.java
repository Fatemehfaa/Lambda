@FunctionalInterface
public interface Extractor<T,R> {
    R extract(T t);
}
