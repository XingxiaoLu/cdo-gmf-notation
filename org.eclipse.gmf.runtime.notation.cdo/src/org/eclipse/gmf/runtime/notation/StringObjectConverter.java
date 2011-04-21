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

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Object Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getStringObjectConverter()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface StringObjectConverter extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getStringFromObject(Object objectValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getObjectFromString(String stringValue);

} // StringObjectConverter
