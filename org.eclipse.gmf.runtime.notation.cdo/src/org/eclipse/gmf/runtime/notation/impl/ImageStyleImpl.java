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
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.ImageStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getAntiAlias <em>Anti Alias</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getMaintainAspectRatio <em>Maintain Aspect Ratio</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ImageStyleImpl#getCropBound <em>Crop Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageStyleImpl extends CDOObjectImpl implements ImageStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.IMAGE_STYLE;
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
	public Boolean getAntiAlias() {
		return (Boolean)eGet(NotationPackage.Literals.IMAGE_STYLE__ANTI_ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAntiAlias(Boolean newAntiAlias) {
		eSet(NotationPackage.Literals.IMAGE_STYLE__ANTI_ALIAS, newAntiAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMaintainAspectRatio() {
		return (Boolean)eGet(NotationPackage.Literals.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainAspectRatio(Boolean newMaintainAspectRatio) {
		eSet(NotationPackage.Literals.IMAGE_STYLE__MAINTAIN_ASPECT_RATIO, newMaintainAspectRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds getCropBound() {
		return (Bounds)eGet(NotationPackage.Literals.IMAGE_STYLE__CROP_BOUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCropBound(Bounds newCropBound) {
		eSet(NotationPackage.Literals.IMAGE_STYLE__CROP_BOUND, newCropBound);
	}

} //ImageStyleImpl
