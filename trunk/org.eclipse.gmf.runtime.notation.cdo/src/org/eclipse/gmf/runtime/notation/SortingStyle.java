/******************************************************************************
 * Copyright (c) 2011 Obeo and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation 
 ****************************************************************************/
package org.eclipse.gmf.runtime.notation;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorting Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSorting <em>Sorting</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys <em>Sorting Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortedObjects <em>Sorted Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle()
 * @model
 * @generated
 */
public interface SortingStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Sorting</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.gmf.runtime.notation.Sorting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Sorting
	 * @see #setSorting(Sorting)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_Sorting()
	 * @model default="None"
	 * @generated
	 */
	Sorting getSorting();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSorting <em>Sorting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting</em>' attribute.
	 * @see org.eclipse.gmf.runtime.notation.Sorting
	 * @see #getSorting()
	 * @generated
	 */
	void setSorting(Sorting value);

	/**
	 * Returns the value of the '<em><b>Sorting Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorting Keys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorting Keys</em>' attribute.
	 * @see #setSortingKeys(Map)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_SortingKeys()
	 * @model dataType="org.eclipse.gmf.runtime.notation.SortKeyMap"
	 * @generated
	 */
	Map getSortingKeys();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.SortingStyle#getSortingKeys <em>Sorting Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorting Keys</em>' attribute.
	 * @see #getSortingKeys()
	 * @generated
	 */
	void setSortingKeys(Map value);

	/**
	 * Returns the value of the '<em><b>Sorted Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorted Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorted Objects</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getSortingStyle_SortedObjects()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getSortedObjects();

} // SortingStyle
