package de.uni.freiburg.iig.telematik.jagal.ts;


public class EventFactory<E extends Event>{

	private final Class<? extends E> eventClass;

	public EventFactory(Class<? extends E> eventClass){
		this.eventClass = eventClass;
	}

	public E createEvent(){
		try {
			return eventClass.newInstance();
		} catch (InstantiationException | IllegalAccessException ex) {
			throw new RuntimeException("Event factory failed", ex);
		}
	}
}