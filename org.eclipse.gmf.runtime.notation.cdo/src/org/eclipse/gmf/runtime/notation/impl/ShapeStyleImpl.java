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
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shape Style</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeStyleImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeStyleImpl extends FontStyleImpl implements ShapeStyle {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SHAPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(NotationPackage.Literals.DESCRIPTION_STYLE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(NotationPackage.Literals.DESCRIPTION_STYLE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getFillColor() {
		return ((Integer)eGet(NotationPackage.Literals.FILL_STYLE__FILL_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillColor(int newFillColor) {
		eSet(NotationPackage.Literals.FILL_STYLE__FILL_COLOR, new Integer(newFillColor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTransparency() {
		return ((Integer)eGet(NotationPackage.Literals.FILL_STYLE__TRANSPARENCY, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparency(int newTransparency) {
		eSet(NotationPackage.Literals.FILL_STYLE__TRANSPARENCY, new Integer(newTransparency));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GradientData getGradient() {
		return (GradientData)eGet(NotationPackage.Literals.FILL_STYLE__GRADIENT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(GradientData newGradient) {
		eSet(NotationPackage.Literals.FILL_STYLE__GRADIENT, newGradient);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineColor() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(int newLineColor) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, new Integer(newLineColor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, new Integer(newLineWidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoundedBendpointsRadius() {
		return ((Integer)eGet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		eSet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, new Integer(newRoundedBendpointsRadius));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__FILL_COLOR: return NotationPackage.FILL_STYLE__FILL_COLOR;
				case NotationPackage.SHAPE_STYLE__TRANSPARENCY: return NotationPackage.FILL_STYLE__TRANSPARENCY;
				case NotationPackage.SHAPE_STYLE__GRADIENT: return NotationPackage.FILL_STYLE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.SHAPE_STYLE__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.SHAPE_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FILL_STYLE__FILL_COLOR: return NotationPackage.SHAPE_STYLE__FILL_COLOR;
				case NotationPackage.FILL_STYLE__TRANSPARENCY: return NotationPackage.SHAPE_STYLE__TRANSPARENCY;
				case NotationPackage.FILL_STYLE__GRADIENT: return NotationPackage.SHAPE_STYLE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.SHAPE_STYLE__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.SHAPE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.SHAPE_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setFontName(String newFontName) {
		// GMF initial code sucks, they take into account inheritance...
		super.setFontName(newFontName);
	}
} // ShapeStyleImpl
