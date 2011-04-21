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
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FillStyleImpl#getGradient <em>Gradient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FillStyleImpl extends CDOObjectImpl implements FillStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FillStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FILL_STYLE;
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
	public int getFillColor() {
		return ((Integer)eGet(NotationPackage.Literals.FILL_STYLE__FILL_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(int newFillColor) {
		eSet(NotationPackage.Literals.FILL_STYLE__FILL_COLOR, new Integer(newFillColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransparency() {
		return ((Integer)eGet(NotationPackage.Literals.FILL_STYLE__TRANSPARENCY, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(int newTransparency) {
		eSet(NotationPackage.Literals.FILL_STYLE__TRANSPARENCY, new Integer(newTransparency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientData getGradient() {
		return (GradientData)eGet(NotationPackage.Literals.FILL_STYLE__GRADIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(GradientData newGradient) {
		eSet(NotationPackage.Literals.FILL_STYLE__GRADIENT, newGradient);
	}

} //FillStyleImpl
