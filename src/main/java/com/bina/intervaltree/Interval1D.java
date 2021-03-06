package com.bina.intervaltree;

/**
 * Defines a closed interval
 */
public interface Interval1D {
    public long getLeft();

    public long getRight();

    public boolean intersects(Interval1D that);

    public boolean intersects(Interval1D that, double reciprocalRatio);

    public boolean intersects(Interval1D that, double reciprocalRatio, int wiggle);

    public boolean contains(final long point);

    public Interval1D union(final Interval1D that);

    public long length();

    public long getCenter();
}
