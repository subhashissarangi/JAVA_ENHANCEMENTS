package com.myapp.beans;

import java.io.Serializable;

import com.myapp.factories.Fruit;

public class Apple implements Serializable, Comparable<Apple>, Fruit {

	/**
	 * @author SUBHASHIS
	 */
	private static final long serialVersionUID = 1L;

	private String color;
	private Integer weight;

	public Apple() {

	}

	public Apple(Integer weight) {
		super();
		this.weight = weight;
	}

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public int compareTo(Apple o) {
		return o.getWeight() > this.getWeight() ? 1 : o.getWeight() < this.getWeight() ? -1 : 0;
	}

}
