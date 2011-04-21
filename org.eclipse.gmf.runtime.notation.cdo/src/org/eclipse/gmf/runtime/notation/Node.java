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
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint <em>Layout Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends View {
	/**
	 * Returns the value of the '<em><b>Layout Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Constraint</em>' containment reference.
	 * @see #setLayoutConstraint(LayoutConstraint)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getNode_LayoutConstraint()
	 * @model containment="true"
	 * @generated
	 */
	LayoutConstraint getLayoutConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.Node#getLayoutConstraint <em>Layout Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Constraint</em>' containment reference.
	 * @see #getLayoutConstraint()
	 * @generated
	 */
	void setLayoutConstraint(LayoutConstraint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	LayoutConstraint createLayoutConstraint(EClass eClass);

} // Node
