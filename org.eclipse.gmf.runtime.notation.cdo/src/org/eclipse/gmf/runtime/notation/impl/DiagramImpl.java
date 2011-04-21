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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getPersistedEdges <em>Persisted Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.DiagramImpl#getTransientEdges <em>Transient Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends ViewImpl implements Diagram {
	private EContentsEList allEdges = null;

	protected static final EStructuralFeature[] edgesFeatures = new EStructuralFeature[] {
			NotationPackage.Literals.DIAGRAM__PERSISTED_EDGES,
			NotationPackage.Literals.DIAGRAM__TRANSIENT_EDGES };

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public Edge createEdge(EClass eClass) {
		Edge newEdge = (Edge) eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
		getPersistedEdges().add(newEdge);
		return newEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList getEdges() {
		if (allEdges == null) {
			allEdges = new EContentsEList(this, edgesFeatures);
		}
		return allEdges;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit getMeasurementUnit() {
		return (MeasurementUnit)eGet(NotationPackage.Literals.DIAGRAM__MEASUREMENT_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(NotationPackage.Literals.DIAGRAM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPersistedEdges() {
		return (EList)eGet(NotationPackage.Literals.DIAGRAM__PERSISTED_EDGES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransientEdges() {
		return (EList)eGet(NotationPackage.Literals.DIAGRAM__TRANSIENT_EDGES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void insertEdge(Edge edge) {
		persistEdges();
		getPersistedEdges().add(edge);
	}

	public void insertEdge(Edge edge, boolean persisted) {
		List edges = null;
		if (persisted)
			edges = getPersistedEdges();
		else
			edges = getTransientEdges();
		edges.add(edge);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void insertEdgeAt(Edge edge, int index) {
		persistEdges();
		if (getPersistedEdges().size() >= index) {
			getPersistedEdges().add(index, edge);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeasurementUnit() {
		return eIsSet(NotationPackage.Literals.DIAGRAM__MEASUREMENT_UNIT);
	}

	/**
	 * Persist the view passed in and all its parent views if they are
	 * transient.
	 * 
	 * @param view
	 *            the view to persist
	 */
	private void persistCompleteHierarchy(View view) {
		view.persist();
		EObject container = view.eContainer();
		while (container instanceof View) {
			// if already persisted, quit
			EStructuralFeature sFeature = container.eContainingFeature();
			if (sFeature != null && !sFeature.isTransient()) {
				break;
			}

			((View) container).persist();
			container = container.eContainer();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void persistEdges() {
		EList transientEdges = getTransientEdges();
		if (transientEdges != null && transientEdges.size() > 0) {
			List edges = new ArrayList(transientEdges);
			getPersistedEdges().addAll(transientEdges);
			for (Iterator iterator = edges.iterator(); iterator.hasNext();) {
				Edge edge = (Edge) iterator.next();
				View sourceView = edge.getSource();
				View targetView = edge.getTarget();
				if (sourceView != null)
					persistCompleteHierarchy(sourceView);
				if (targetView != null)
					persistCompleteHierarchy(targetView);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void removeEdge(Edge edge) {
		EList transientEdges = getTransientEdges();
		if (edge.eContainingFeature() == NotationPackage.Literals.DIAGRAM__TRANSIENT_EDGES) {
			if (transientEdges != null && transientEdges.size() > 0) {
				transientEdges.remove(edge);
			}
		} else if (edge.eContainingFeature() == NotationPackage.Literals.DIAGRAM__PERSISTED_EDGES) {
			EList persistedEdges = getPersistedEdges();
			if (persistedEdges != null && persistedEdges.size() > 0) {
				persistedEdges.remove(edge);
			}
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementUnit(MeasurementUnit newMeasurementUnit) {
		eSet(NotationPackage.Literals.DIAGRAM__MEASUREMENT_UNIT, newMeasurementUnit);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(NotationPackage.Literals.DIAGRAM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeasurementUnit() {
		eUnset(NotationPackage.Literals.DIAGRAM__MEASUREMENT_UNIT);
	}
} // DiagramImpl
