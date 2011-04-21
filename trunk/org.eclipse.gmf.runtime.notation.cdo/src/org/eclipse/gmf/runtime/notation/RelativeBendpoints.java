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

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Bendpoints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRelativeBendpoints()
 * @model
 * @generated
 */
public interface RelativeBendpoints extends Bendpoints {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(List)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getRelativeBendpoints_Points()
	 * @model dataType="org.eclipse.gmf.runtime.notation.RelativeBendpointList" many="false"
	 * @generated
	 */
	List getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.RelativeBendpoints#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(List value);

} // RelativeBendpoints
