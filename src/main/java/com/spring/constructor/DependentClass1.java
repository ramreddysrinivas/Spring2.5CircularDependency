package com.spring.constructor;

public class DependentClass1 {

	private BaseClass baseClass;
	
	public DependentClass1(){
		
	}

	public BaseClass getBaseClass() {
		return baseClass;
	}

	public void setBaseClass(BaseClass baseClass) {
		this.baseClass = baseClass;
	}

	public DependentClass1(BaseClass baseClass) {
		this.baseClass = baseClass;

	}

}
