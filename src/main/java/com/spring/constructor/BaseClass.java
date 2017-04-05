package com.spring.constructor;

public class BaseClass {
	private DependentClass1 dependentClass1;
	
	public BaseClass(){
		
	}

	public BaseClass(DependentClass1 dependentClass1) {
		this.dependentClass1 = dependentClass1;

	}

	public void setDependentClass1(DependentClass1 dependentClass1) {
		this.dependentClass1 = dependentClass1;
	}

	public DependentClass1 getDependentClass1() {
		return dependentClass1;
	}

}
