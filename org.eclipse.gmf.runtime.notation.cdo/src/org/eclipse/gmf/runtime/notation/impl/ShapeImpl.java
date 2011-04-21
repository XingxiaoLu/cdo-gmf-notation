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
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.datatype.GradientData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getFontHeight <em>Font Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#isStrikeThrough <em>Strike Through</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ShapeImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends NodeImpl implements Shape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontColor() {
		return ((Integer)eGet(NotationPackage.Literals.FONT_STYLE__FONT_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(int newFontColor) {
		eSet(NotationPackage.Literals.FONT_STYLE__FONT_COLOR, new Integer(newFontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return (String)eGet(NotationPackage.Literals.FONT_STYLE__FONT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFontName(String newFontName) {
		eSet(NotationPackage.Literals.FONT_STYLE__FONT_NAME, newFontName == null ? null : newFontName.intern());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontHeight() {
		return ((Integer)eGet(NotationPackage.Literals.FONT_STYLE__FONT_HEIGHT, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontHeight(int newFontHeight) {
		eSet(NotationPackage.Literals.FONT_STYLE__FONT_HEIGHT, new Integer(newFontHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return ((Boolean)eGet(NotationPackage.Literals.FONT_STYLE__BOLD, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		eSet(NotationPackage.Literals.FONT_STYLE__BOLD, new Boolean(newBold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return ((Boolean)eGet(NotationPackage.Literals.FONT_STYLE__ITALIC, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		eSet(NotationPackage.Literals.FONT_STYLE__ITALIC, new Boolean(newItalic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return ((Boolean)eGet(NotationPackage.Literals.FONT_STYLE__UNDERLINE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		eSet(NotationPackage.Literals.FONT_STYLE__UNDERLINE, new Boolean(newUnderline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrikeThrough() {
		return ((Boolean)eGet(NotationPackage.Literals.FONT_STYLE__STRIKE_THROUGH, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikeThrough(boolean newStrikeThrough) {
		eSet(NotationPackage.Literals.FONT_STYLE__STRIKE_THROUGH, new Boolean(newStrikeThrough));
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
		if (baseClass == FontStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE__FONT_COLOR: return NotationPackage.FONT_STYLE__FONT_COLOR;
				case NotationPackage.SHAPE__FONT_NAME: return NotationPackage.FONT_STYLE__FONT_NAME;
				case NotationPackage.SHAPE__FONT_HEIGHT: return NotationPackage.FONT_STYLE__FONT_HEIGHT;
				case NotationPackage.SHAPE__BOLD: return NotationPackage.FONT_STYLE__BOLD;
				case NotationPackage.SHAPE__ITALIC: return NotationPackage.FONT_STYLE__ITALIC;
				case NotationPackage.SHAPE__UNDERLINE: return NotationPackage.FONT_STYLE__UNDERLINE;
				case NotationPackage.SHAPE__STRIKE_THROUGH: return NotationPackage.FONT_STYLE__STRIKE_THROUGH;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE__DESCRIPTION: return NotationPackage.DESCRIPTION_STYLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE__FILL_COLOR: return NotationPackage.FILL_STYLE__FILL_COLOR;
				case NotationPackage.SHAPE__TRANSPARENCY: return NotationPackage.FILL_STYLE__TRANSPARENCY;
				case NotationPackage.SHAPE__GRADIENT: return NotationPackage.FILL_STYLE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.SHAPE__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.SHAPE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == ShapeStyle.class) {
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
		if (baseClass == FontStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FONT_STYLE__FONT_COLOR: return NotationPackage.SHAPE__FONT_COLOR;
				case NotationPackage.FONT_STYLE__FONT_NAME: return NotationPackage.SHAPE__FONT_NAME;
				case NotationPackage.FONT_STYLE__FONT_HEIGHT: return NotationPackage.SHAPE__FONT_HEIGHT;
				case NotationPackage.FONT_STYLE__BOLD: return NotationPackage.SHAPE__BOLD;
				case NotationPackage.FONT_STYLE__ITALIC: return NotationPackage.SHAPE__ITALIC;
				case NotationPackage.FONT_STYLE__UNDERLINE: return NotationPackage.SHAPE__UNDERLINE;
				case NotationPackage.FONT_STYLE__STRIKE_THROUGH: return NotationPackage.SHAPE__STRIKE_THROUGH;
				default: return -1;
			}
		}
		if (baseClass == DescriptionStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DESCRIPTION_STYLE__DESCRIPTION: return NotationPackage.SHAPE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == FillStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FILL_STYLE__FILL_COLOR: return NotationPackage.SHAPE__FILL_COLOR;
				case NotationPackage.FILL_STYLE__TRANSPARENCY: return NotationPackage.SHAPE__TRANSPARENCY;
				case NotationPackage.FILL_STYLE__GRADIENT: return NotationPackage.SHAPE__GRADIENT;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.SHAPE__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.SHAPE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.SHAPE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == ShapeStyle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ShapeImpl
