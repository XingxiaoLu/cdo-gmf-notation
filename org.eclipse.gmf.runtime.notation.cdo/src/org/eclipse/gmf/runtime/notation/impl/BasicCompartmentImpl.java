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
package org.eclipse.gmf.runtime.notation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Basic Compartment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.BasicCompartmentImpl#isCollapsed <em>Collapsed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicCompartmentImpl extends DecorationNodeImpl implements
		BasicCompartment {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.BASIC_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollapsed() {
		return ((Boolean)eGet(NotationPackage.Literals.DRAWER_STYLE__COLLAPSED, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollapsed(boolean newCollapsed) {
		eSet(NotationPackage.Literals.DRAWER_STYLE__COLLAPSED, new Boolean(newCollapsed));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DrawerStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.BASIC_COMPARTMENT__COLLAPSED: return NotationPackage.DRAWER_STYLE__COLLAPSED;
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
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == DrawerStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.DRAWER_STYLE__COLLAPSED: return NotationPackage.BASIC_COMPARTMENT__COLLAPSED;
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.BASIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_COMPARTMENT__TARGET_EDGES:
			return;
		default:
			eSetGen(featureID, newValue);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void eSetGen(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.BASIC_COMPARTMENT__EANNOTATIONS:
			getEAnnotations().clear();
			getEAnnotations().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__VISIBLE:
			setVisible(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.BASIC_COMPARTMENT__TYPE:
			setType((String) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__MUTABLE:
			setMutable(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.BASIC_COMPARTMENT__SOURCE_EDGES:
			getSourceEdges().clear();
			getSourceEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__TARGET_EDGES:
			getTargetEdges().clear();
			getTargetEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			getPersistedChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__ELEMENT:
			setElement((EObject) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			getTransientChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) newValue);
			return;
		case NotationPackage.BASIC_COMPARTMENT__COLLAPSED:
			setCollapsed(((Boolean) newValue).booleanValue());
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.BASIC_COMPARTMENT__EANNOTATIONS:
			EList eAnnotations = getEAnnotations();
			return eAnnotations != null && !eAnnotations.isEmpty();
			// case NotationPackage.BASIC_COMPARTMENT__VISIBLE:
			// return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			// case NotationPackage.BASIC_COMPARTMENT__TYPE:
			// return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
			// .equals(type);
			// case NotationPackage.BASIC_COMPARTMENT__MUTABLE:
			// return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
		case NotationPackage.BASIC_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.BASIC_COMPARTMENT__TARGET_EDGES:
			return false;
		case NotationPackage.BASIC_COMPARTMENT__PERSISTED_CHILDREN:
			EList persistedChildren = getPersistedChildren();
			return persistedChildren != null && !persistedChildren.isEmpty();
		case NotationPackage.BASIC_COMPARTMENT__STYLES:
			EList styles = getStyles();
			return styles != null && !styles.isEmpty();
		case NotationPackage.BASIC_COMPARTMENT__ELEMENT:
			return isSetElement();
		case NotationPackage.BASIC_COMPARTMENT__DIAGRAM:
			return getDiagram() != null;
		case NotationPackage.BASIC_COMPARTMENT__TRANSIENT_CHILDREN:
			EList transientChildren = getTransientChildren();
			return transientChildren != null && !transientChildren.isEmpty();
		case NotationPackage.BASIC_COMPARTMENT__LAYOUT_CONSTRAINT:
			return getLayoutConstraint() != null;
			// case NotationPackage.BASIC_COMPARTMENT__COLLAPSED:
			// return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case NotationPackage.BASIC_COMPARTMENT__SOURCE_EDGES:
			case NotationPackage.BASIC_COMPARTMENT__TARGET_EDGES:
				return;
			default:
				eUnsetGen(featureID);
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void eUnsetGen(int featureID) {
		switch (featureID) {
			case NotationPackage.BASIC_COMPARTMENT__EANNOTATIONS:
				getEAnnotations().clear();
				return;
//			case NotationPackage.BASIC_COMPARTMENT__VISIBLE:
//				setVisible(VISIBLE_EDEFAULT);
//				return;
//			case NotationPackage.BASIC_COMPARTMENT__TYPE:
//				setType(TYPE_EDEFAULT);
//				return;
//			case NotationPackage.BASIC_COMPARTMENT__MUTABLE:
//				setMutable(MUTABLE_EDEFAULT);
//				return;
			case NotationPackage.BASIC_COMPARTMENT__SOURCE_EDGES:
				getSourceEdges().clear();
				return;
			case NotationPackage.BASIC_COMPARTMENT__TARGET_EDGES:
				getTargetEdges().clear();
				return;
			case NotationPackage.BASIC_COMPARTMENT__PERSISTED_CHILDREN:
				getPersistedChildren().clear();
				return;
			case NotationPackage.BASIC_COMPARTMENT__STYLES:
				getStyles().clear();
				return;
			case NotationPackage.BASIC_COMPARTMENT__ELEMENT:
				unsetElement();
				return;
			case NotationPackage.BASIC_COMPARTMENT__TRANSIENT_CHILDREN:
				getTransientChildren().clear();
				return;
			case NotationPackage.BASIC_COMPARTMENT__LAYOUT_CONSTRAINT:
				setLayoutConstraint((LayoutConstraint)null);
				return;
//			case NotationPackage.BASIC_COMPARTMENT__COLLAPSED:
//				setCollapsed(COLLAPSED_EDEFAULT);
//				return;
		}
		eDynamicUnset(featureID);
	}
	
} // BasicCompartmentImpl
