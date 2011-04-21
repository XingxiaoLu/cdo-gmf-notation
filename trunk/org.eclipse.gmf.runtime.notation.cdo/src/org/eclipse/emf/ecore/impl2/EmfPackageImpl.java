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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EmfFactory;
import org.eclipse.emf.ecore.EmfPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.util.EmfValidator;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.impl.NotationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfPackageImpl extends EPackageImpl implements EmfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.ecore.EmfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmfPackageImpl() {
		super(eNS_URI, EmfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmfPackage init() {
		if (isInited) return (EmfPackage)EPackage.Registry.INSTANCE.getEPackage(EmfPackage.eNS_URI);

		// Obtain or create and register package
		EmfPackageImpl theEmfPackage = (EmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof EmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new EmfPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NotationPackageImpl theNotationPackage = (NotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI) instanceof NotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI) : NotationPackage.eINSTANCE);

		// Create package meta-data objects
		theEmfPackage.createPackageContents();
		theNotationPackage.createPackageContents();

		// Initialize created meta-data
		theEmfPackage.initializePackageContents();
		theNotationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEmfPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return EmfValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEmfPackage.freeze();

		return theEmfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElement() {
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEModelElement_EAnnotations() {
		return (EReference)eModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotation() {
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAnnotation_Source() {
		return (EAttribute)eAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Details() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_EModelElement() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Contents() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_References() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfFactory getEmfFactory() {
		return (EmfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eModelElementEClass = createEClass(EMODEL_ELEMENT);
		createEReference(eModelElementEClass, EMODEL_ELEMENT__EANNOTATIONS);

		eAnnotationEClass = createEClass(EANNOTATION);
		createEAttribute(eAnnotationEClass, EANNOTATION__SOURCE);
		createEReference(eAnnotationEClass, EANNOTATION__DETAILS);
		createEReference(eAnnotationEClass, EANNOTATION__EMODEL_ELEMENT);
		createEReference(eAnnotationEClass, EANNOTATION__CONTENTS);
		createEReference(eAnnotationEClass, EANNOTATION__REFERENCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		eAnnotationEClass.getESuperTypes().add(this.getEModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eModelElementEClass, EModelElement.class, "EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		  
		initEReference(getEModelElement_EAnnotations(), this.getEAnnotation(), this.getEAnnotation_EModelElement(), "eAnnotations", null, 0, -1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(eModelElementEClass, this.getEAnnotation(), "getEAnnotation", 0, 1); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1); //$NON-NLS-1$

		initEClass(eAnnotationEClass, EAnnotation.class, "EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getEAnnotation_Source(), ecorePackage.getEString(), "source", null, 0, 1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
		initEReference(getEAnnotation_Details(), ecorePackage.getEStringToStringMapEntry(), null, "details", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
		initEReference(getEAnnotation_EModelElement(), this.getEModelElement(), this.getEModelElement_EAnnotations(), "eModelElement", null, 0, 1, EAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
		initEReference(getEAnnotation_Contents(), ecorePackage.getEObject(), null, "contents", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		  
		initEReference(getEAnnotation_References(), ecorePackage.getEObject(), null, "references", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore"; //$NON-NLS-1$		
		addAnnotation
		  (eAnnotationEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedSourceURI" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //EmfPackageImpl
