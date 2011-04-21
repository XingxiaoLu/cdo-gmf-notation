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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getSourceAnchor <em>Source Anchor</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.EdgeImpl#getTargetAnchor <em>Target Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EdgeImpl extends ViewImpl implements Edge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getSource() {
		return (View)eGet(NotationPackage.Literals.EDGE__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(View newSource) {
		eSet(NotationPackage.Literals.EDGE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getTarget() {
		return (View)eGet(NotationPackage.Literals.EDGE__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(View newTarget) {
		eSet(NotationPackage.Literals.EDGE__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bendpoints getBendpoints() {
		return (Bendpoints)eGet(NotationPackage.Literals.EDGE__BENDPOINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBendpoints(Bendpoints newBendpoints) {
		eSet(NotationPackage.Literals.EDGE__BENDPOINTS, newBendpoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor getSourceAnchor() {
		return (Anchor)eGet(NotationPackage.Literals.EDGE__SOURCE_ANCHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAnchor(Anchor newSourceAnchor) {
		eSet(NotationPackage.Literals.EDGE__SOURCE_ANCHOR, newSourceAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anchor getTargetAnchor() {
		return (Anchor)eGet(NotationPackage.Literals.EDGE__TARGET_ANCHOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAnchor(Anchor newTargetAnchor) {
		eSet(NotationPackage.Literals.EDGE__TARGET_ANCHOR, newTargetAnchor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Bendpoints createBendpoints(EClass eClass) {
		Bendpoints newBendpoints = (Bendpoints) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setBendpoints(newBendpoints);
		return newBendpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Anchor createSourceAnchor(EClass eClass) {
		Anchor newAnchor = (Anchor) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setSourceAnchor(newAnchor);
		return newAnchor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Anchor createTargetAnchor(EClass eClass) {
		Anchor newAnchor = (Anchor) eClass.getEPackage().getEFactoryInstance().create(eClass);
		setTargetAnchor(newAnchor);
		return newAnchor;
	}
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
      * @generated Not
     */
	public NotificationChain basicSetSource(View newSource, NotificationChain msgs) {
        if (eContainingFeature() == NotationPackage.eINSTANCE.getDiagram_PersistedEdges()){
            if (newSource!=null && newSource.eContainingFeature() == NotationPackage.eINSTANCE.getView_TransientChildren()){
                EObject container = newSource.eContainer();
                if (container!=null && container instanceof View){
                    View parent = (View)container;
                    parent.persistChildren();
                }
            }
        }
        View oldSource = getSource();
        setSource(newSource);
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated Not
     */
	public NotificationChain basicSetTarget(View newTarget, NotificationChain msgs) {
        if (eContainingFeature() == NotationPackage.eINSTANCE.getDiagram_PersistedEdges()){
            if (newTarget!=null && newTarget.eContainingFeature() == NotationPackage.eINSTANCE.getView_TransientChildren()){
                EObject container = newTarget.eContainer();
                if (container!=null && container instanceof View){
                    View parent = (View)container;
                    parent.persistChildren();
                }
            }
        }
        View oldTarget = getTarget();
        setTarget(newTarget);
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NotationPackage.EDGE__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }
} //EdgeImpl
