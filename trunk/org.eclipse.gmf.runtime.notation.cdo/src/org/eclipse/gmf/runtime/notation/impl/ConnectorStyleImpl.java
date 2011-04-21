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
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorStyleImpl#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorStyleImpl extends RoutingStyleImpl implements ConnectorStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.CONNECTOR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineColor() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(int newLineColor) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, new Integer(newLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, new Integer(newLineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR_STYLE__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.CONNECTOR_STYLE__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
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
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.CONNECTOR_STYLE__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.CONNECTOR_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorStyleImpl
