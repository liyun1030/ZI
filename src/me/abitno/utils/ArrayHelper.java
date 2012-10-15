package me.abitno.utils;

import java.lang.reflect.Array;

public class ArrayHelper {
	public static <T> T[] concat(T[] A, T[] B) {
		final Class<?> typeofA = A.getClass().getComponentType();
		@SuppressWarnings("unchecked")
		T[] C = (T[]) Array.newInstance(typeofA, A.length + B.length);
		System.arraycopy(A, 0, C, 0, A.length);
		System.arraycopy(B, 0, C, A.length, B.length);

		return C;
	}

}