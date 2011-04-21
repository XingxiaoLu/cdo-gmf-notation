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

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EmfPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EModelElementImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>EAnnotation</b></em>'. <!-- end-user-doc -->
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
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' map.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EMap details;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList contents;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList references;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EmfPackage.Literals.EANNOTATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfPackage.EANNOTATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EMap getDetails() {
		if (details == null) {
			details = new EcoreEMap(
					EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY,
					EStringToStringMapEntryImpl.class, this,
					EcorePackage.EANNOTATION__DETAILS) {
				private static final long serialVersionUID = 1L;

				protected void ensureEntryDataExists() {
					if (entryData == null) {
						// Ensure that this race condition is thread safe; it
						// doesn't matter who wins the race.
						//
						BasicEList[] result = newEntryData(2 * size + 1);
						for (Iterator i = delegateEList.iterator(); i.hasNext();) {
							Entry entry = (Entry) i.next();
							int hash = entry.getHash();
							int index = (hash & 0x7FFFFFFF) % result.length;
							BasicEList eList = result[index];
							if (eList == null) {
								eList = result[index] = newList();
							}
							eList.add(entry);
						}
						entryData = result;
					}
				}
			};
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EModelElement getEModelElement() {
		if (eContainerFeatureID() != EmfPackage.EANNOTATION__EMODEL_ELEMENT) return null;
		return (EModelElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEModelElement(
			EModelElement newEModelElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEModelElement, EmfPackage.EANNOTATION__EMODEL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEModelElement(EModelElement newEModelElement) {
		if (newEModelElement != eInternalContainer() || (eContainerFeatureID() != EmfPackage.EANNOTATION__EMODEL_ELEMENT && newEModelElement != null)) {
			if (EcoreUtil.isAncestor(this, newEModelElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEModelElement != null)
				msgs = ((InternalEObject)newEModelElement).eInverseAdd(this, EmfPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
			msgs = basicSetEModelElement(newEModelElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfPackage.EANNOTATION__EMODEL_ELEMENT, newEModelElement, newEModelElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList(EObject.class, this, EmfPackage.EANNOTATION__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList(EObject.class, this, EmfPackage.EANNOTATION__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEModelElement((EModelElement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__DETAILS:
				return ((InternalEList)getDetails()).basicRemove(otherEnd, msgs);
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				return basicSetEModelElement(null, msgs);
			case EmfPackage.EANNOTATION__CONTENTS:
				return ((InternalEList)getContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, EmfPackage.EMODEL_ELEMENT__EANNOTATIONS, EModelElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__SOURCE:
				return getSource();
			case EmfPackage.EANNOTATION__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement();
			case EmfPackage.EANNOTATION__CONTENTS:
				return getContents();
			case EmfPackage.EANNOTATION__REFERENCES:
				return getReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__SOURCE:
				setSource((String)newValue);
				return;
			case EmfPackage.EANNOTATION__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
				return;
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)newValue);
				return;
			case EmfPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection)newValue);
				return;
			case EmfPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EmfPackage.EANNOTATION__DETAILS:
				getDetails().clear();
				return;
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				setEModelElement((EModelElement)null);
				return;
			case EmfPackage.EANNOTATION__CONTENTS:
				getContents().clear();
				return;
			case EmfPackage.EANNOTATION__REFERENCES:
				getReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfPackage.EANNOTATION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EmfPackage.EANNOTATION__DETAILS:
				return details != null && !details.isEmpty();
			case EmfPackage.EANNOTATION__EMODEL_ELEMENT:
				return getEModelElement() != null;
			case EmfPackage.EANNOTATION__CONTENTS:
				return contents != null && !contents.isEmpty();
			case EmfPackage.EANNOTATION__REFERENCES:
				return references != null && !references.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (source: "); //$NON-NLS-1$
		result.append(source);
		result.append(')');
		return result.toString();
	}

} // EAnnotationImpl
