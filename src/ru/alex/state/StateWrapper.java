package ru.alex.state;

public class StateWrapper {
	private State states[] = {  new StateTag(),new StateText() };
	private int transitions[][] = { { 1, 1}, { 1, 0}};
	private int current = 0;

	private void next(int message) {
		current = transitions[current][message];

	}

	public void on() {
		states[current].on();
		next(0);
	}

	public void off() {
		states[current].off();
		next(0);
		
	}

	public void def() {
		states[current].def();
		next(0);
	}
	public void text(){
		states[current].text();
		next(0);
	}
}
