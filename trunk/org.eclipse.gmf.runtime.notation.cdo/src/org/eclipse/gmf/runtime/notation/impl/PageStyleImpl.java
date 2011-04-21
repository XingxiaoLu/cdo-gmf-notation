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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.PageStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.PageStyleImpl#getPageHeight <em>Page Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageStyleImpl extends CDOObjectImpl implements PageStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.PAGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageX() {
		return ((Integer)eGet(NotationPackage.Literals.PAGE_STYLE__PAGE_X, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageX(int newPageX) {
		eSet(NotationPackage.Literals.PAGE_STYLE__PAGE_X, new Integer(newPageX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageY() {
		return ((Integer)eGet(NotationPackage.Literals.PAGE_STYLE__PAGE_Y, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageY(int newPageY) {
		eSet(NotationPackage.Literals.PAGE_STYLE__PAGE_Y, new Integer(newPageY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageWidth() {
		return ((Integer)eGet(NotationPackage.Literals.PAGE_STYLE__PAGE_WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageWidth(int newPageWidth) {
		eSet(NotationPackage.Literals.PAGE_STYLE__PAGE_WIDTH, new Integer(newPageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageHeight() {
		return ((Integer)eGet(NotationPackage.Literals.PAGE_STYLE__PAGE_HEIGHT, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageHeight(int newPageHeight) {
		eSet(NotationPackage.Literals.PAGE_STYLE__PAGE_HEIGHT, new Integer(newPageHeight));
	}

} //PageStyleImpl
