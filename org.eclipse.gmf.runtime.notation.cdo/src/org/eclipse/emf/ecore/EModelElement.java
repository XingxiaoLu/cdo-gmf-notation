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
package org.eclipse.emf.ecore;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.ecore.EmfPackage#getEModelElement()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface EModelElement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>EAnnotations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAnnotation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.ecore.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAnnotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAnnotations</em>' containment reference list.
	 * @see org.eclipse.emf.ecore.EmfPackage#getEModelElement_EAnnotations()
	 * @see org.eclipse.emf.ecore.EAnnotation#getEModelElement
	 * @model type="org.eclipse.emf.ecore.EAnnotation" opposite="eModelElement" containment="true"
	 * @generated
	 */
	EList getEAnnotations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EAnnotation getEAnnotation(String source);

} // EModelElement
