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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.DataTypeStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data Type Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DataTypeStyleImpl#getInstanceType <em>Instance Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeStyleImpl extends NamedStyleImpl implements DataTypeStyle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DATA_TYPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstanceType() {
		return (EDataType)eGet(NotationPackage.Literals.DATA_TYPE_STYLE__INSTANCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(EDataType newInstanceType) {
		eSet(NotationPackage.Literals.DATA_TYPE_STYLE__INSTANCE_TYPE, newInstanceType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getStringFromObject(Object objectValue) {
		if (getInstanceType() == null && objectValue instanceof String)
			return (String) objectValue;
		return EcoreUtil.convertToString(getInstanceType(), objectValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getObjectFromString(String stringValue) {
		if (getInstanceType() == null)
			return stringValue;
		return EcoreUtil.createFromString(getInstanceType(), stringValue);
	}
} // DataTypeStyleImpl
