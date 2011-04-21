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

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.ListCompartment;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Sorting;
import org.eclipse.gmf.runtime.notation.SortingStyle;
import org.eclipse.gmf.runtime.notation.TitleStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>List Compartment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSorting <em>Sorting</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSortingKeys <em>Sorting Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getSortedObjects <em>Sorted Objects</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#getFilteredObjects <em>Filtered Objects</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ListCompartmentImpl#isShowTitle <em>Show Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListCompartmentImpl extends BasicCompartmentImpl implements
		ListCompartment {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ListCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.LIST_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sorting getSorting() {
		return (Sorting)eGet(NotationPackage.Literals.SORTING_STYLE__SORTING, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSorting(Sorting newSorting) {
		eSet(NotationPackage.Literals.SORTING_STYLE__SORTING, newSorting);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Map getSortingKeys() {
		return (Map)eGet(NotationPackage.Literals.SORTING_STYLE__SORTING_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortingKeys(Map newSortingKeys) {
		eSet(NotationPackage.Literals.SORTING_STYLE__SORTING_KEYS, newSortingKeys);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSortedObjects() {
		return (EList)eGet(NotationPackage.Literals.SORTING_STYLE__SORTED_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Filtering getFiltering() {
		return (Filtering)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERING, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltering(Filtering newFiltering) {
		eSet(NotationPackage.Literals.FILTERING_STYLE__FILTERING, newFiltering);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List getFilteringKeys() {
		return (List)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERING_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteringKeys(List newFilteringKeys) {
		eSet(NotationPackage.Literals.FILTERING_STYLE__FILTERING_KEYS, newFilteringKeys);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilteredObjects() {
		return (EList)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERED_OBJECTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowTitle() {
		return ((Boolean)eGet(NotationPackage.Literals.TITLE_STYLE__SHOW_TITLE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowTitle(boolean newShowTitle) {
		eSet(NotationPackage.Literals.TITLE_STYLE__SHOW_TITLE, new Boolean(newShowTitle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == SortingStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__SORTING: return NotationPackage.SORTING_STYLE__SORTING;
				case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS: return NotationPackage.SORTING_STYLE__SORTING_KEYS;
				case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS: return NotationPackage.SORTING_STYLE__SORTED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == FilteringStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__FILTERING: return NotationPackage.FILTERING_STYLE__FILTERING;
				case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS: return NotationPackage.FILTERING_STYLE__FILTERING_KEYS;
				case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS: return NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE: return NotationPackage.TITLE_STYLE__SHOW_TITLE;
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
		if (baseClass == SortingStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.SORTING_STYLE__SORTING: return NotationPackage.LIST_COMPARTMENT__SORTING;
				case NotationPackage.SORTING_STYLE__SORTING_KEYS: return NotationPackage.LIST_COMPARTMENT__SORTING_KEYS;
				case NotationPackage.SORTING_STYLE__SORTED_OBJECTS: return NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == FilteringStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.FILTERING_STYLE__FILTERING: return NotationPackage.LIST_COMPARTMENT__FILTERING;
				case NotationPackage.FILTERING_STYLE__FILTERING_KEYS: return NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS;
				case NotationPackage.FILTERING_STYLE__FILTERED_OBJECTS: return NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS;
				default: return -1;
			}
		}
		if (baseClass == TitleStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.TITLE_STYLE__SHOW_TITLE: return NotationPackage.LIST_COMPARTMENT__SHOW_TITLE;
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
			EList eAnnotations = getEAnnotations();
			return eAnnotations != null && !eAnnotations.isEmpty();
			// case NotationPackage.LIST_COMPARTMENT__VISIBLE:
			// return ((eFlags & VISIBLE_EFLAG) != 0) != VISIBLE_EDEFAULT;
			// case NotationPackage.LIST_COMPARTMENT__TYPE:
			// return TYPE_EDEFAULT == null ? type != null :
			// !TYPE_EDEFAULT.equals(type);
			// case NotationPackage.LIST_COMPARTMENT__MUTABLE:
			// return ((eFlags & MUTABLE_EFLAG) != 0) != MUTABLE_EDEFAULT;
		case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
			return false;
		case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
			EList persistedChildren = getPersistedChildren();
			return persistedChildren != null && !persistedChildren.isEmpty();
		case NotationPackage.LIST_COMPARTMENT__STYLES:
			EList styles = getStyles();
			return styles != null && !styles.isEmpty();
		case NotationPackage.LIST_COMPARTMENT__ELEMENT:
			return isSetElement();
		case NotationPackage.LIST_COMPARTMENT__DIAGRAM:
			return getDiagram() != null;
		case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
			EList transientChildren = getTransientChildren();
			return transientChildren != null && !transientChildren.isEmpty();
		case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
			return getLayoutConstraint() != null;
			// case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
			// return ((eFlags & COLLAPSED_EFLAG) != 0) != COLLAPSED_EDEFAULT;
			// case NotationPackage.LIST_COMPARTMENT__SORTING:
			// return (eFlags & SORTING_EFLAG) != SORTING_EFLAG_DEFAULT;
			// case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
			// return SORTING_KEYS_EDEFAULT == null ? sortingKeys != null
			// : !SORTING_KEYS_EDEFAULT.equals(sortingKeys);
		case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
			EList sortedObjects = getSortedObjects();
			return sortedObjects != null && !sortedObjects.isEmpty();
			// case NotationPackage.LIST_COMPARTMENT__FILTERING:
			// return (eFlags & FILTERING_EFLAG) != FILTERING_EFLAG_DEFAULT;
			// case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
			// return FILTERING_KEYS_EDEFAULT == null ? filteringKeys != null
			// : !FILTERING_KEYS_EDEFAULT.equals(filteringKeys);
		case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
			EList filteredObjects = getFilteredObjects();
			return filteredObjects != null && !filteredObjects.isEmpty();
			// case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
			// return ((eFlags & SHOW_TITLE_EFLAG) != 0) != SHOW_TITLE_EDEFAULT;
		}
		return eDynamicIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
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
		case NotationPackage.LIST_COMPARTMENT__EANNOTATIONS:
			getEAnnotations().clear();
			getEAnnotations().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__VISIBLE:
			setVisible(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.LIST_COMPARTMENT__TYPE:
			setType((String) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__MUTABLE:
			setMutable(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
			getSourceEdges().clear();
			getSourceEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
			getTargetEdges().clear();
			getTargetEdges().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__PERSISTED_CHILDREN:
			getPersistedChildren().clear();
			getPersistedChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__ELEMENT:
			setElement((EObject) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__TRANSIENT_CHILDREN:
			getTransientChildren().clear();
			getTransientChildren().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__LAYOUT_CONSTRAINT:
			setLayoutConstraint((LayoutConstraint) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__COLLAPSED:
			setCollapsed(((Boolean) newValue).booleanValue());
			return;
		case NotationPackage.LIST_COMPARTMENT__SORTING:
			setSorting((Sorting) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__SORTING_KEYS:
			setSortingKeys((Map) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__SORTED_OBJECTS:
			getSortedObjects().clear();
			getSortedObjects().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__FILTERING:
			setFiltering((Filtering) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__FILTERING_KEYS:
			setFilteringKeys((List) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__FILTERED_OBJECTS:
			getFilteredObjects().clear();
			getFilteredObjects().addAll((Collection) newValue);
			return;
		case NotationPackage.LIST_COMPARTMENT__SHOW_TITLE:
			setShowTitle(((Boolean) newValue).booleanValue());
			return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotationPackage.LIST_COMPARTMENT__SOURCE_EDGES:
		case NotationPackage.LIST_COMPARTMENT__TARGET_EDGES:
			return;
		default:
			eUnsetGen(featureID);
		}
	}
} // ListCompartmentImpl
