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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.gmf.runtime.notation.FilteringStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtering Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFiltering <em>Filtering</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteringKeys <em>Filtering Keys</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.FilteringStyleImpl#getFilteredObjects <em>Filtered Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilteringStyleImpl extends CDOObjectImpl implements FilteringStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.FILTERING_STYLE;
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
	public Filtering getFiltering() {
		return (Filtering)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltering(Filtering newFiltering) {
		eSet(NotationPackage.Literals.FILTERING_STYLE__FILTERING, newFiltering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List getFilteringKeys() {
		return Collections.unmodifiableList((List)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERING_KEYS, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setFilteringKeys(List newFilteringKeys) {
		List oldFilteringKeys = getFilteringKeys();

		if (newFilteringKeys == null )
			throw new NullPointerException("the 'newFilteringKeys' parameter is null"); //$NON-NLS-1$
		else if (newFilteringKeys.isEmpty())
			eSet(NotationPackage.Literals.FILTERING_STYLE__FILTERING_KEYS, Collections.EMPTY_LIST);
		else {
			List tempList = new ArrayList(newFilteringKeys.size());
			for (Iterator i = newFilteringKeys.iterator(); i.hasNext();) {
				Object key = i.next();
				if (!(key instanceof String))
					throw new IllegalArgumentException("One or more objects in the list is not of type java.lang.String"); //$NON-NLS-1$
				tempList.add(key);
			}
			eSet(NotationPackage.Literals.FILTERING_STYLE__FILTERING_KEYS, newFilteringKeys);
		}
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotationPackage.FILTERING_STYLE__FILTERING_KEYS, oldFilteringKeys, getFilteringKeys()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFilteredObjects() {
		return (EList)eGet(NotationPackage.Literals.FILTERING_STYLE__FILTERED_OBJECTS, true);
	}

} //FilteringStyleImpl
