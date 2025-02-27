/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sebersole.benchmarks.poc.model;

public class StateProvince {

    private Long id;
    private String name;
    private String isoCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( !( o instanceof StateProvince ) ) {
            return false;
        }

        StateProvince that = (StateProvince) o;

        if ( isoCode != null ? !isoCode.equals( that.getIsoCode() ) : that.getIsoCode() != null ) {
            return false;
        }
        return name != null ? name.equals( that.getName() ) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ( isoCode != null ? isoCode.hashCode() : 0 );
        return result;
    }
}
