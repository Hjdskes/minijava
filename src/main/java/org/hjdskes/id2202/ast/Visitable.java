package org.hjdskes.id2202.ast;

/**
 * An interface to enable the use of the {@link Visitor} design pattern.
 */
public interface Visitable {
    /**
     * This method allows the {@link Visitor<T>} to visit the visitable object. The normal
     * implementation of this method is usually:
     *
     * {@code <T> T accept(Visitor<T> visitor) {
     *     return visitor.visit(this);
     * }}
     *
     * @param visitor The {@link Visitor<T>} to visit the visitable object.
     * @param <T> The type that the implementing {@link Visitor<T>} returns.
     * @return The type that the implementing {@link Visitor<T>} returns.
     */
    <T> T accept(Visitor<T> visitor);
}
