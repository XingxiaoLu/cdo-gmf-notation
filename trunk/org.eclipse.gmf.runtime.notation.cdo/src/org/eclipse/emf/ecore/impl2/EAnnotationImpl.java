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
package org.eclipse.emf.ecore.impl2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EmfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EAnnotationImpl extends EModelElementImpl implements EAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EmfPackage.Literals.EANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return (String)eGet(EmfPackage.Literals.EANNOTATION__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		eSet(EmfPackage.Literals.EANNOTATION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap getDetails() {
		return (EMap)eGet(EmfPackage.Literals.EANNOTATION__DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		return (EModelElement)eGet(EmfPackage.Literals.EANNOTATION__EMODEL_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		eSet(EmfPackage.Literals.EANNOTATION__EMODEL_ELEMENT, newEModelElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContents() {
		return (EList)eGet(EmfPackage.Literals.EANNOTATION__CONTENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		return (EList)eGet(EmfPackage.Literals.EANNOTATION__REFERENCES, true);
	}

} //EAnnotationImpl
