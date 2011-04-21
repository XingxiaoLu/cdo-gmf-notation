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
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Size;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.BoundsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.BoundsImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoundsImpl extends LocationImpl implements Bounds {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BOUNDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return ((Integer)eGet(NotationPackage.Literals.SIZE__WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(NotationPackage.Literals.SIZE__WIDTH, new Integer(newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return ((Integer)eGet(NotationPackage.Literals.SIZE__HEIGHT, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(NotationPackage.Literals.SIZE__HEIGHT, new Integer(newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Size.class) {
			switch (derivedFeatureID) {
				case NotationPackage.BOUNDS__WIDTH: return NotationPackage.SIZE__WIDTH;
				case NotationPackage.BOUNDS__HEIGHT: return NotationPackage.SIZE__HEIGHT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Size.class) {
			switch (baseFeatureID) {
				case NotationPackage.SIZE__WIDTH: return NotationPackage.BOUNDS__WIDTH;
				case NotationPackage.SIZE__HEIGHT: return NotationPackage.BOUNDS__HEIGHT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BoundsImpl
