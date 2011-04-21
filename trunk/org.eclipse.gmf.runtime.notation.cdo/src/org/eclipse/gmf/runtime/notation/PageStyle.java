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
package org.eclipse.gmf.runtime.notation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageX <em>Page X</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageY <em>Page Y</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageWidth <em>Page Width</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageHeight <em>Page Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPageStyle()
 * @model
 * @generated
 */
public interface PageStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Page X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page X</em>' attribute.
	 * @see #setPageX(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPageStyle_PageX()
	 * @model default="0"
	 * @generated
	 */
	int getPageX();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageX <em>Page X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page X</em>' attribute.
	 * @see #getPageX()
	 * @generated
	 */
	void setPageX(int value);

	/**
	 * Returns the value of the '<em><b>Page Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Y</em>' attribute.
	 * @see #setPageY(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPageStyle_PageY()
	 * @model default="0"
	 * @generated
	 */
	int getPageY();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageY <em>Page Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Y</em>' attribute.
	 * @see #getPageY()
	 * @generated
	 */
	void setPageY(int value);

	/**
	 * Returns the value of the '<em><b>Page Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Width</em>' attribute.
	 * @see #setPageWidth(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPageStyle_PageWidth()
	 * @model default="100"
	 * @generated
	 */
	int getPageWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageWidth <em>Page Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Width</em>' attribute.
	 * @see #getPageWidth()
	 * @generated
	 */
	void setPageWidth(int value);

	/**
	 * Returns the value of the '<em><b>Page Height</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Height</em>' attribute.
	 * @see #setPageHeight(int)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getPageStyle_PageHeight()
	 * @model default="100"
	 * @generated
	 */
	int getPageHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.PageStyle#getPageHeight <em>Page Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Height</em>' attribute.
	 * @see #getPageHeight()
	 * @generated
	 */
	void setPageHeight(int value);

} // PageStyle
