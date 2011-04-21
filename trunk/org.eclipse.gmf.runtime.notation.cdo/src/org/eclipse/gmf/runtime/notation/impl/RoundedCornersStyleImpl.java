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
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rounded Corners Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoundedCornersStyleImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoundedCornersStyleImpl extends CDOObjectImpl implements RoundedCornersStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundedCornersStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ROUNDED_CORNERS_STYLE;
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
	public int getRoundedBendpointsRadius() {
		return ((Integer)eGet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		eSet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, new Integer(newRoundedBendpointsRadius));
	}

} //RoundedCornersStyleImpl
