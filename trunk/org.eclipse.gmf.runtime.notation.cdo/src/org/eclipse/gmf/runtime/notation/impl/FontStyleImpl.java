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
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#getFontHeight <em>Font Height</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FontStyleImpl#isStrikeThrough <em>Strike Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontStyleImpl extends CDOObjectImpl implements FontStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FONT_STYLE;
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

} //FontStyleImpl
