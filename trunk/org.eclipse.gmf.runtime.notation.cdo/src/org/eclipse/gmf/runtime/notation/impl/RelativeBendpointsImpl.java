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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Relative Bendpoints</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeBendpointsImpl extends CDOObjectImpl implements
		RelativeBendpoints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeBendpointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.RELATIVE_BENDPOINTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List getPoints() {
		return (List)eGet(NotationPackage.Literals.RELATIVE_BENDPOINTS__POINTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setPoints(List newPoints) {
		// TODO : see how  to implement validation.
		eSet(NotationPackage.Literals.RELATIVE_BENDPOINTS__POINTS, newPoints);
	}

} // RelativeBendpointsImpl
