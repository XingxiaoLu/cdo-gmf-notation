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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.SingleValueStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Single Value Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.SingleValueStyleImpl#getRawValue <em>Raw Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleValueStyleImpl extends DataTypeStyleImpl implements
		SingleValueStyle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SINGLE_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getRawValue() {
		return (String)eGet(NotationPackage.Literals.SINGLE_VALUE_STYLE__RAW_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setRawValue(String newRawValue) {
		// TODO : see how to implement
		eSet(NotationPackage.Literals.SINGLE_VALUE_STYLE__RAW_VALUE,
				newRawValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getValue() {
		return getObjectFromString(getRawValue());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setValue(Object newValue) {
		setRawValue(getStringFromObject(newValue));
	}

} // SingleValueStyleImpl
