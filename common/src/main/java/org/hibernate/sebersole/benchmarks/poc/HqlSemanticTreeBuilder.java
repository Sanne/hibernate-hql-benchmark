/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sebersole.benchmarks.poc;

/**
 * Delegate for performing the initial semantic analysis of the
 * parse tree generated by Antlr from the HQL
 *
 * @author Andrea Boriero
 * @author Steve Ebersole
 */
public interface HqlSemanticTreeBuilder {
	Object buildSemanticModel(String hqlString);
}

