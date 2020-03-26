package com.educacionit.collecntion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppPrincipal {

	public static void main(String[] args) {

		final Set hashSet = new HashSet(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		
		// agregamos 1_000_000 de elementos al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}

		final Long endHashSetTime = System.currentTimeMillis();		
///////////////////////////////////////////////////////////////////////////////
		final Set treeSet = new TreeSet();

		final Long startTreeSetTime = System.currentTimeMillis();

		// agregamos 1_000_000 de elementos al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}	
		
		final Long endtreeSetTime = System.currentTimeMillis();
/////////////////////////////////////////////////////////////////////////////////////
		final Set linkedHashSet = new LinkedHashSet(1_000_000);

		final Long startlinkedHashSetTime = System.currentTimeMillis();

		// agregamos 1_000_000 de elementos al hashSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}	
		
		final Long endlinkedHashSetTime = System.currentTimeMillis();
/////////////////////////////////////////////////////////////////////////////////////	
		
		
		
		System.out.println("Tiempo total de cargar del HashSet : " + (endHashSetTime  - startHashSetTime));
		System.out.println("Tiempo total de cargar del TreeSet : " + ( endtreeSetTime - startTreeSetTime));
		System.out.println("Tiempo total de cargar del linkedHashSet : " + ( endlinkedHashSetTime - startlinkedHashSetTime));

	}

}
