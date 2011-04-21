/******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sorting Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSortingKeys <em>Sorting Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SortingStyleImpl#getSortedObjects <em>Sorted Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SortingStyleImpl extends CDOObjectImpl implements SortingStyle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SortingStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SORTING_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sorting getSorting() {
		return (Sorting)eGet(NotationPackage.Literals.SORTING_STYLE__SORTING, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(Sorting newSorting) {
		eSet(NotationPackage.Literals.SORTING_STYLE__SORTING, newSorting);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Map getSortingKeys() {
		return Collections.unmodifiableMap((Map) eGet(
				NotationPackage.Literals.SORTING_STYLE__SORTING_KEYS, true));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setSortingKeys(Map newSortingKeys) {
		// TODO : see how to implement validation.
		eSet(NotationPackage.Literals.SORTING_STYLE__SORTING_KEYS,
				newSortingKeys);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSortedObjects() {
		return (EList)eGet(NotationPackage.Literals.SORTING_STYLE__SORTED_OBJECTS, true);
	}

} // SortingStyleImpl
