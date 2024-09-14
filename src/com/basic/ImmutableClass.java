package com.basic;

import java.util.Date;

public final class ImmutableClass {
    private final int id;
    private  String name;
    private final Date dateOfBirth;

    public ImmutableClass(int id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        // Defensive copy to prevent changes to the original mutable Date object
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return a copy of the mutable object instead of the original
    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + "]";
	}


}
