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
import org.eclipse.gmf.runtime.notation.Image;
import org.eclipse.gmf.runtime.notation.ImageBufferStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Buffer Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageBufferStyleImpl#getImageBuffer <em>Image Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageBufferStyleImpl extends ImageStyleImpl implements ImageBufferStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageBufferStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.IMAGE_BUFFER_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImageBuffer() {
		return (Image)eGet(NotationPackage.Literals.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageBuffer(Image newImageBuffer) {
		eSet(NotationPackage.Literals.IMAGE_BUFFER_STYLE__IMAGE_BUFFER, newImageBuffer);
	}

} //ImageBufferStyleImpl
