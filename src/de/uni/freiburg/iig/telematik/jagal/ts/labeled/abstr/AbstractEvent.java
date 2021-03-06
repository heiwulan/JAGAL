package de.uni.freiburg.iig.telematik.jagal.ts.labeled.abstr;

import java.io.Serializable;


public abstract class AbstractEvent implements Serializable{

	private static final long serialVersionUID = 2049051501026413012L;
	
	protected String name;
	protected String label = "";
	
	private boolean isLambdaEvent = false;
	
	protected AbstractEvent(String name){
		setName(name);
		setLabel(name);
	}
	
	protected AbstractEvent(String name, String label){
		setName(name);
		setLabel(label);
	}
	
	protected AbstractEvent(String name, String label, boolean isLambdaEvent){
		this(name, label);
		setLambdaEvent(isLambdaEvent);
	}
	
	public final void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public final void setLabel(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return label;
	}
	
	public boolean isLambdaEvent() {
		return isLambdaEvent;
	}

	public final void setLambdaEvent(boolean isLambdaEvent) {
		this.isLambdaEvent = isLambdaEvent;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
        @Override
	public abstract AbstractEvent clone();
	
	public abstract AbstractEvent clone(int index);
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractEvent other = (AbstractEvent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString(){
		return name;
	}

}
