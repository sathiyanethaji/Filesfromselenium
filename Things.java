package org.serive;

import com.greens.Stationary;

public class Things extends Stationary{
	public void pen() {
		System.out.println("ink pen,ball point pen");
		}
	public void pencil() {
		System.out.println("apsara,camlin");

	}
public static void main(String[] args) {
	Things t=new Things();
	t.pen();
	t.pencil();
	t.distributries();
	t.schoolsupplies();
	
}
}
