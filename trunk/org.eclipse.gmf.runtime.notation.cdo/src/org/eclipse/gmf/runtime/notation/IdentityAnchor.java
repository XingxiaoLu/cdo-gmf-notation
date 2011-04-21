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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor()
 * @model
 * @generated
 */
public interface IdentityAnchor extends Anchor {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"anchor"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getIdentityAnchor_Id()
	 * @model default="anchor"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.IdentityAnchor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // IdentityAnchor
