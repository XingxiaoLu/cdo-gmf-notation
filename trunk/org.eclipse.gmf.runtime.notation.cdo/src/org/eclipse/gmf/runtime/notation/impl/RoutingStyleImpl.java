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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.RoutingStyleImpl#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoutingStyleImpl extends RoundedCornersStyleImpl implements RoutingStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.ROUTING_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		return (Routing)eGet(NotationPackage.Literals.ROUTING_STYLE__ROUTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__ROUTING, newRouting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smoothness getSmoothness() {
		return (Smoothness)eGet(NotationPackage.Literals.ROUTING_STYLE__SMOOTHNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoothness(Smoothness newSmoothness) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__SMOOTHNESS, newSmoothness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvoidObstructions() {
		return ((Boolean)eGet(NotationPackage.Literals.ROUTING_STYLE__AVOID_OBSTRUCTIONS, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvoidObstructions(boolean newAvoidObstructions) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__AVOID_OBSTRUCTIONS, new Boolean(newAvoidObstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosestDistance() {
		return ((Boolean)eGet(NotationPackage.Literals.ROUTING_STYLE__CLOSEST_DISTANCE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosestDistance(boolean newClosestDistance) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__CLOSEST_DISTANCE, new Boolean(newClosestDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkStatus getJumpLinkStatus() {
		return (JumpLinkStatus)eGet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkStatus(JumpLinkStatus newJumpLinkStatus) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_STATUS, newJumpLinkStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpLinkType getJumpLinkType() {
		return (JumpLinkType)eGet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinkType(JumpLinkType newJumpLinkType) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINK_TYPE, newJumpLinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJumpLinksReverse() {
		return ((Boolean)eGet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINKS_REVERSE, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJumpLinksReverse(boolean newJumpLinksReverse) {
		eSet(NotationPackage.Literals.ROUTING_STYLE__JUMP_LINKS_REVERSE, new Boolean(newJumpLinksReverse));
	}

} //RoutingStyleImpl
