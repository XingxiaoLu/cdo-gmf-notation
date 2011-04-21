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
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.ConnectorStyle;
import org.eclipse.gmf.runtime.notation.JumpLinkStatus;
import org.eclipse.gmf.runtime.notation.JumpLinkType;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoundedCornersStyle;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.Smoothness;
import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getRoundedBendpointsRadius <em>Rounded Bendpoints Radius</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getSmoothness <em>Smoothness</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isAvoidObstructions <em>Avoid Obstructions</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isClosestDistance <em>Closest Distance</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getJumpLinkStatus <em>Jump Link Status</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getJumpLinkType <em>Jump Link Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#isJumpLinksReverse <em>Jump Links Reverse</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.impl.ConnectorImpl#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EdgeImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return NotationPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoundedBendpointsRadius() {
		return ((Integer)eGet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundedBendpointsRadius(int newRoundedBendpointsRadius) {
		eSet(NotationPackage.Literals.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS, new Integer(newRoundedBendpointsRadius));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineColor() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(int newLineColor) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_COLOR, new Integer(newLineColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return ((Integer)eGet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, true)).intValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		eSet(NotationPackage.Literals.LINE_STYLE__LINE_WIDTH, new Integer(newLineWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == RoutingStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR__ROUTING: return NotationPackage.ROUTING_STYLE__ROUTING;
				case NotationPackage.CONNECTOR__SMOOTHNESS: return NotationPackage.ROUTING_STYLE__SMOOTHNESS;
				case NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS: return NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS;
				case NotationPackage.CONNECTOR__CLOSEST_DISTANCE: return NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE;
				case NotationPackage.CONNECTOR__JUMP_LINK_STATUS: return NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS;
				case NotationPackage.CONNECTOR__JUMP_LINK_TYPE: return NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE;
				case NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE: return NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (derivedFeatureID) {
				case NotationPackage.CONNECTOR__LINE_COLOR: return NotationPackage.LINE_STYLE__LINE_COLOR;
				case NotationPackage.CONNECTOR__LINE_WIDTH: return NotationPackage.LINE_STYLE__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == ConnectorStyle.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == Style.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RoundedCornersStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUNDED_CORNERS_STYLE__ROUNDED_BENDPOINTS_RADIUS: return NotationPackage.CONNECTOR__ROUNDED_BENDPOINTS_RADIUS;
				default: return -1;
			}
		}
		if (baseClass == RoutingStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.ROUTING_STYLE__ROUTING: return NotationPackage.CONNECTOR__ROUTING;
				case NotationPackage.ROUTING_STYLE__SMOOTHNESS: return NotationPackage.CONNECTOR__SMOOTHNESS;
				case NotationPackage.ROUTING_STYLE__AVOID_OBSTRUCTIONS: return NotationPackage.CONNECTOR__AVOID_OBSTRUCTIONS;
				case NotationPackage.ROUTING_STYLE__CLOSEST_DISTANCE: return NotationPackage.CONNECTOR__CLOSEST_DISTANCE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_STATUS: return NotationPackage.CONNECTOR__JUMP_LINK_STATUS;
				case NotationPackage.ROUTING_STYLE__JUMP_LINK_TYPE: return NotationPackage.CONNECTOR__JUMP_LINK_TYPE;
				case NotationPackage.ROUTING_STYLE__JUMP_LINKS_REVERSE: return NotationPackage.CONNECTOR__JUMP_LINKS_REVERSE;
				default: return -1;
			}
		}
		if (baseClass == LineStyle.class) {
			switch (baseFeatureID) {
				case NotationPackage.LINE_STYLE__LINE_COLOR: return NotationPackage.CONNECTOR__LINE_COLOR;
				case NotationPackage.LINE_STYLE__LINE_WIDTH: return NotationPackage.CONNECTOR__LINE_WIDTH;
				default: return -1;
			}
		}
		if (baseClass == ConnectorStyle.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorImpl
