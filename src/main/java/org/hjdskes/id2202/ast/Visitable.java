package org.hjdskes.id2202.ast;

import org.hjdskes.id2202.ast.type.Type;

/**
 * An interface to enable the use of the Visitor design pattern.
 */
public interface Visitable {
    /**
     * This method allows the {@link Visitor} to visit the visitable object. The normal
     * implementation of this method is usually:
     *
     * {@code void accept(Visitor visitor) {
     *     visitor.visit(this);
     * }}
     *
     * @param visitor The {@link Visitor} to visit the visitable object.
     */
    void accept(Visitor visitor);

    /**
     * This method allows the {@link TypeVisitor} to visit the visitable object. The normal
     * implementation of this method is usually:
     *
     * {@code Type accept(TypeVisitor visitor) {
     *     return visitor.visit(this);
     * }}
     *
     * @param visitor The {@link TypeVisitor} to visit the visitable object.
     * @return The {@link Type} of the visited object.
     */
    Type accept(TypeVisitor visitor);
}
