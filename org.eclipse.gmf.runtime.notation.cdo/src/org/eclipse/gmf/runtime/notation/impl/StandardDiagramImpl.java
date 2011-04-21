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
import org.eclipse.gmf.runtime.notation.PageStyle;
import org.eclipse.gmf.runtime.notation.StandardDiagram;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getPageHeight <em>Page Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getHorizontalGuides <em>Horizontal Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getVerticalGuides <em>Vertical Guides</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.StandardDiagramImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StandardDiagramImpl extends DiagramImpl implements StandardDiagram {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.STANDARD_DIAGRAM;
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
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__PAGE_X: return NotationPackage.PAGE_STYLE__PAGE_X;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_Y: return NotationPackage.PAGE_STYLE__PAGE_Y;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH: return NotationPackage.PAGE_STYLE__PAGE_WIDTH;
				case NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT: return NotationPackage.PAGE_STYLE__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES: return NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES;
				case NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES: return NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.STANDARD_DIAGRAM__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramStyle.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == PageStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.PAGE_STYLE__PAGE_X: return NotationPackage.STANDARD_DIAGRAM__PAGE_X;
				case NotationPackage.PAGE_STYLE__PAGE_Y: return NotationPackage.STANDARD_DIAGRAM__PAGE_Y;
				case NotationPackage.PAGE_STYLE__PAGE_WIDTH: return NotationPackage.STANDARD_DIAGRAM__PAGE_WIDTH;
				case NotationPackage.PAGE_STYLE__PAGE_HEIGHT: return NotationPackage.STANDARD_DIAGRAM__PAGE_HEIGHT;
				default: return -1;
			}
		}
		if (baseClass == GuideStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.GUIDE_STYLE__HORIZONTAL_GUIDES: return NotationPackage.STANDARD_DIAGRAM__HORIZONTAL_GUIDES;
				case NotationPackage.GUIDE_STYLE__VERTICAL_GUIDES: return NotationPackage.STANDARD_DIAGRAM__VERTICAL_GUIDES;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.STANDARD_DIAGRAM__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == DiagramStyle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StandardDiagramImpl
