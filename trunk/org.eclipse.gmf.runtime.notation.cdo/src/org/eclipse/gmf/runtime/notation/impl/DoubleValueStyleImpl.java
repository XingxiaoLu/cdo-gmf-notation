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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.DoubleValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DoubleValueStyleImpl#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleValueStyleImpl extends NamedStyleImpl implements DoubleValueStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DOUBLE_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDoubleValue() {
		return ((Double)eGet(NotationPackage.Literals.DOUBLE_VALUE_STYLE__DOUBLE_VALUE, true)).doubleValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleValue(double newDoubleValue) {
		eSet(NotationPackage.Literals.DOUBLE_VALUE_STYLE__DOUBLE_VALUE, new Double(newDoubleValue));
	}

} //DoubleValueStyleImpl
