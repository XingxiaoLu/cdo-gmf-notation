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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl2.EModelElementImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getSourceEdges <em>Source Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTargetEdges <em>Target Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getPersistedChildren <em>Persisted Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ViewImpl#getTransientChildren <em>Transient Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ViewImpl extends EModelElementImpl implements View {
	protected static final EStructuralFeature[] childrenFeatures = new EStructuralFeature[] {
			NotationPackage.Literals.VIEW__PERSISTED_CHILDREN,
			NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN };

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return ((Boolean)eGet(NotationPackage.Literals.VIEW__VISIBLE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		eSet(NotationPackage.Literals.VIEW__VISIBLE, new Boolean(newVisible));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(NotationPackage.Literals.VIEW__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setType(String newType) {
		eSet(NotationPackage.Literals.VIEW__TYPE, newType == null ? null
				: newType.intern());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMutable() {
		return ((Boolean)eGet(NotationPackage.Literals.VIEW__MUTABLE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMutable(boolean newMutable) {
		eSet(NotationPackage.Literals.VIEW__MUTABLE, new Boolean(newMutable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSourceEdges() {
		return (EList)eGet(NotationPackage.Literals.VIEW__SOURCE_EDGES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTargetEdges() {
		return (EList)eGet(NotationPackage.Literals.VIEW__TARGET_EDGES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersistedChildren() {
		return (EList)eGet(NotationPackage.Literals.VIEW__PERSISTED_CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStyles() {
		return (EList)eGet(NotationPackage.Literals.VIEW__STYLES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EObject getElement() {
		if (!isSetElement()) {
			EObject container = eContainer();
			if (container instanceof View) {
				View view = (View) container;
				setElement(view.getElement());
			}
		}
		EObject element = (EObject) eGet(
				NotationPackage.Literals.VIEW__ELEMENT, true);
		// if (element != null && element.eIsProxy()) {
		// EObject oldElement = element;
		// element = eResolveProxy((InternalEObject) element);
		// if (element != oldElement) {
		// if (eNotificationRequired())
		// eNotify(new ENotificationImpl(this, Notification.RESOLVE,
		// NotationPackage.VIEW__ELEMENT, oldElement, element));
		// }
		// }
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(EObject newElement) {
		eSet(NotationPackage.Literals.VIEW__ELEMENT, newElement);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElement() {
		eUnset(NotationPackage.Literals.VIEW__ELEMENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElement() {
		return eIsSet(NotationPackage.Literals.VIEW__ELEMENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Diagram getDiagram() {
		for (EObject parent = this; parent != null; parent = ((InternalEObject) parent)
				.eInternalContainer())
			if (NotationPackage.Literals.DIAGRAM.isSuperTypeOf(parent.eClass()))
				return (Diagram) parent;
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransientChildren() {
		return (EList)eGet(NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Style createStyle(EClass eClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NamedStyle getNamedStyle(EClass eClass, String name) {
		if (eClass != null
				&& eIsSet(NotationPackage.Literals.VIEW__STYLES)
				&& NotationPackage.eINSTANCE.getNamedStyle().isSuperTypeOf(
						eClass)) {
			for (Iterator i = getStyles().iterator(); i.hasNext();) {
				Style style = (Style) i.next();
				if (style.eClass() == eClass || eClass.isInstance(style))
					if (style.eGet(
							NotationPackage.eINSTANCE.getNamedStyle_Name())
							.equals(name))
						return (NamedStyle) style;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Node createChild(EClass eClass) {
		Node newChild = (Node) eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
		getPersistedChildren().add(newChild);
		return newChild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList getChildren() {
		return new EContentsEList(this, childrenFeatures);
		// if (allChildren == null) {
		// allChildren = new EContentsEList(this, childrenFeatures);
		// }
		// return allChildren;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Style getStyle(EClass eClass) {
		if (eClass != null
				&& NotationPackage.eINSTANCE.getStyle().isSuperTypeOf(eClass)) {
			if (eClass.isSuperTypeOf(eClass())) {
				return (Style) this;
			}
			if (eIsSet(NotationPackage.Literals.VIEW__STYLES)) {
				for (Iterator i = getStyles().iterator(); i.hasNext();) {
					Style style = (Style) i.next();
					if (style.eClass() == eClass || eClass.isInstance(style))
						return style;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList getVisibleChildren() {
		EList persistedChildren = getPersistedChildren();
		EList transientChildren = getTransientChildren();
		if ((persistedChildren == null || persistedChildren.isEmpty())
				&& (transientChildren == null || transientChildren.isEmpty())) {
			return ECollections.EMPTY_ELIST;
		}

		List _children = new ArrayList();
		if (persistedChildren != null && persistedChildren.size() > 0) {
			for (Iterator iter = persistedChildren.iterator(); iter.hasNext();) {
				View view = (View) iter.next();
				if (view.isVisible())
					_children.add(view);
			}
		}

		if (transientChildren != null && transientChildren.size() > 0) {
			for (Iterator iter = transientChildren.iterator(); iter.hasNext();) {
				View view = (View) iter.next();
				if (view.isVisible())
					_children.add(view);
			}
		}

		return new BasicEList.UnmodifiableEList(_children.size(),
				_children.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void insertChild(View child) {
		persistChildren();
		getPersistedChildren().add(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void insertChildAt(View child, int index) {
		persistChildren();
		if (getPersistedChildren().size() >= index) {
			getPersistedChildren().add(index, child);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void insertChild(View child, boolean persisted) {
		List children = null;
		if (persisted)
			children = getPersistedChildren();
		else
			children = getTransientChildren();
		children.add(child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void removeChild(View child) {
		if (child.eContainingFeature() == NotationPackage.Literals.VIEW__TRANSIENT_CHILDREN) {
			EList transientChildren = getTransientChildren();
			if (transientChildren != null && transientChildren.size() > 0) {
				transientChildren.remove(child);
			}
		} else if (child.eContainingFeature() == NotationPackage.Literals.VIEW__PERSISTED_CHILDREN) {
			EList persistedChildren = getPersistedChildren();
			if (persistedChildren != null && persistedChildren.size() > 0) {
				persistedChildren.remove(child);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void persist() {
		EStructuralFeature eContaingFeature = eContainingFeature();
		if (eContainer != null && eContaingFeature != null
				&& eContainer instanceof View && eContaingFeature.isTransient()) {
			View vContainer = (View) eContainer;
			vContainer.persistChildren();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void persistChildren() {
		EList transientChildren = getTransientChildren();
		if (transientChildren != null && transientChildren.size() > 0) {
			getPersistedChildren().addAll(transientChildren);
		}
	}
} // ViewImpl
