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
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.gmf.runtime.notation.ArrowStyle;
import org.eclipse.gmf.runtime.notation.ArrowType;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrow Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ArrowStyleImpl#getArrowSource <em>Arrow Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ArrowStyleImpl#getArrowTarget <em>Arrow Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrowStyleImpl extends CDOObjectImpl implements ArrowStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrowStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ARROW_STYLE;
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
	public ArrowType getArrowSource() {
		return (ArrowType)eGet(NotationPackage.Literals.ARROW_STYLE__ARROW_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowSource(ArrowType newArrowSource) {
		eSet(NotationPackage.Literals.ARROW_STYLE__ARROW_SOURCE, newArrowSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowType getArrowTarget() {
		return (ArrowType)eGet(NotationPackage.Literals.ARROW_STYLE__ARROW_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrowTarget(ArrowType newArrowTarget) {
		eSet(NotationPackage.Literals.ARROW_STYLE__ARROW_TARGET, newArrowTarget);
	}

} //ArrowStyleImpl
