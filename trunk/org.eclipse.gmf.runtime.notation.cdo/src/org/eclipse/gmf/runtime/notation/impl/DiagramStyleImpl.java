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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.GuideStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getVerticalGuides <em>Vertical Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramStyleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramStyleImpl extends PageStyleImpl implements DiagramStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getHorizontalGuides() {
		return (EList)eGet(NotationPackage.Literals.GUIDE_STYLE__HORIZONTAL_GUIDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVerticalGuides() {
		return (EList)eGet(NotationPackage.Literals.GUIDE_STYLE__VERTICAL_GUIDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(NotationPackage.Literals.DESCRIPTION_STYLE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(NotationPackage.Literals.DESCRIPTION_STYLE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == GuideStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES: return NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES: return NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.DIAGRAM_STYLE__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
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
		if (baseClass == GuideStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES: return NotationPackage.DIAGRAM_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES: return NotationPackage.DIAGRAM_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.DIAGRAM_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DiagramStyleImpl
