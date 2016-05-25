package io.yaktor.util;

import java.util.Comparator;

import io.yaktor.domain.Association;

public class AssociationComparator implements Comparator<Association> {

	public int compare(Association typ1, Association typ2) {

        return typ1.getName().compareTo(typ2.getName());
    }
}
