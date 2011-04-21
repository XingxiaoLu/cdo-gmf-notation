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
package org.eclipse.gmf.runtime.notation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.ByteArrayValueStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Byte Array Value Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ByteArrayValueStyleImpl#getByteArrayValue <em>Byte Array Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ByteArrayValueStyleImpl extends NamedStyleImpl implements ByteArrayValueStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ByteArrayValueStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BYTE_ARRAY_VALUE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteArrayValue() {
		return (byte[])eGet(NotationPackage.Literals.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayValue(byte[] newByteArrayValue) {
		eSet(NotationPackage.Literals.BYTE_ARRAY_VALUE_STYLE__BYTE_ARRAY_VALUE, newByteArrayValue);
	}

} //ByteArrayValueStyleImpl
