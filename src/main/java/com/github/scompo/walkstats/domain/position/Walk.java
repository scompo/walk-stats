package com.github.scompo.walkstats.domain.position;

import java.util.Collection;

import com.github.scompo.walkstats.domain.Timed;

/**
 * Walk API definition. A walk is a {@link Collection} of {@link Position}s, it
 * also contains the time the {@link Walk} was recorded.
 */
public interface Walk extends Iterable<Position>, Timed {

}
