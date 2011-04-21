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
package org.eclipse.emf.ecore;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.ecore.EmfFactory
 * @model kind="package"
 * @generated
 */
public interface EmfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/gmf/runtime/1.0.2/notation.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfPackage eINSTANCE = org.eclipse.emf.ecore.impl2.EmfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecore.impl2.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.impl2.EModelElementImpl
	 * @see org.eclipse.emf.ecore.impl2.EmfPackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__EANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl <em>EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.impl2.EAnnotationImpl
	 * @see org.eclipse.emf.ecore.impl2.EmfPackageImpl#getEAnnotation()
	 * @generated
	 */
	int EANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element</em>'.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	EClass getEModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
	 * @see org.eclipse.emf.ecore.EModelElement#getEAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_EAnnotations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.ecore.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation
	 * @generated
	 */
	EClass getEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.ecore.EAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation#getSource()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EAttribute getEAnnotation_Source();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.ecore.EAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation#getDetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Details();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.emf.ecore.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EModel Element</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation#getEModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_EModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.ecore.EAnnotation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation#getContents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Contents();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.ecore.EAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see org.eclipse.emf.ecore.EAnnotation#getReferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_References();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfFactory getEmfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecore.impl2.EModelElementImpl <em>EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.impl2.EModelElementImpl
		 * @see org.eclipse.emf.ecore.impl2.EmfPackageImpl#getEModelElement()
		 * @generated
		 */
		EClass EMODEL_ELEMENT = eINSTANCE.getEModelElement();

		/**
		 * The meta object literal for the '<em><b>EAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMODEL_ELEMENT__EANNOTATIONS = eINSTANCE.getEModelElement_EAnnotations();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.ecore.impl2.EAnnotationImpl <em>EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.impl2.EAnnotationImpl
		 * @see org.eclipse.emf.ecore.impl2.EmfPackageImpl#getEAnnotation()
		 * @generated
		 */
		EClass EANNOTATION = eINSTANCE.getEAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EANNOTATION__SOURCE = eINSTANCE.getEAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__DETAILS = eINSTANCE.getEAnnotation_Details();

		/**
		 * The meta object literal for the '<em><b>EModel Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__EMODEL_ELEMENT = eINSTANCE.getEAnnotation_EModelElement();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__CONTENTS = eINSTANCE.getEAnnotation_Contents();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__REFERENCES = eINSTANCE.getEAnnotation_References();

	}

} //EmfPackage
