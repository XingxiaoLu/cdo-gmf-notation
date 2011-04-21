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
package org.eclipse.gmf.runtime.notation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>View</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getSourceEdges <em>Source Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getTargetEdges <em>Target Edges</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getPersistedChildren <em>Persisted Children</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link org.eclipse.gmf.runtime.notation.View#getTransientChildren <em>Transient Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.View#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Type()
	 * @model default=""
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.View#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Mutable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutable</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable</em>' attribute.
	 * @see #setMutable(boolean)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Mutable()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isMutable();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.View#isMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable</em>' attribute.
	 * @see #isMutable()
	 * @generated
	 */
	void setMutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Source Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.runtime.notation.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Edges</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_SourceEdges()
	 * @see org.eclipse.gmf.runtime.notation.Edge#getSource
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" opposite="source" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList getSourceEdges();

	/**
	 * Returns the value of the '<em><b>Target Edges</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Edge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.gmf.runtime.notation.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Edges</em>' reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_TargetEdges()
	 * @see org.eclipse.gmf.runtime.notation.Edge#getTarget
	 * @model type="org.eclipse.gmf.runtime.notation.Edge" opposite="target" resolveProxies="false" transient="true"
	 * @generated
	 */
	EList getTargetEdges();

	/**
	 * Returns the value of the '<em><b>Persisted Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persisted Children</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persisted Children</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_PersistedChildren()
	 * @model type="org.eclipse.gmf.runtime.notation.Node" containment="true"
	 * @generated
	 */
	EList getPersistedChildren();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Style}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Styles()
	 * @model type="org.eclipse.gmf.runtime.notation.Style" containment="true"
	 * @generated
	 */
	EList getStyles();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #isSetElement()
	 * @see #unsetElement()
	 * @see #setElement(EObject)
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Element()
	 * @model unsettable="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.gmf.runtime.notation.View#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #isSetElement()
	 * @see #unsetElement()
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.gmf.runtime.notation.View#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetElement()
	 * @see #getElement()
	 * @see #setElement(EObject)
	 * @generated
	 */
	void unsetElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.gmf.runtime.notation.View#getElement <em>Element</em>}' reference is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Element</em>' reference is set.
	 * @see #unsetElement()
	 * @see #getElement()
	 * @see #setElement(EObject)
	 * @generated
	 */
	boolean isSetElement();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Diagram()
	 * @model required="true" transient="true" changeable="false"
	 *        volatile="true"
	 * @generated
	 */
	Diagram getDiagram();

	/**
	 * Returns the value of the '<em><b>Transient Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Children</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Children</em>' containment reference list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_TransientChildren()
	 * @model type="org.eclipse.gmf.runtime.notation.Node" containment="true" transient="true"
	 * @generated
	 */
	EList getTransientChildren();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Style getStyle(EClass eClass);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Node createChild(EClass eClass);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Style createStyle(EClass eClass);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	NamedStyle getNamedStyle(EClass eClass, String name);

	/**
	 * Returns the value of the '<em><b>Children</b></em>'list. the returned
	 * list is an <em><b>Unmodifable</b></em> list. The list contents are of
	 * type {@link org.eclipse.gmf.runtime.notation.View}. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Children</em>' list.
	 * @see org.eclipse.gmf.runtime.notation.NotationPackage#getView_Children()
	 */
	EList getChildren();
	
	/**
	 * Returns an <em><b>Unmodifable</b></em> list that contains all the 
	 * visible children in the Children list.
	 * The list contents are of type {@link org.eclipse.gmf.runtime.notation.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return <em><b>Unmodifable</b></em> list of Visible children
	 */
	EList getVisibleChildren();
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to persist all view's children
	 * </p>
	 * <!-- end-user-doc -->
	 */
	void persistChildren();
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to persist the view, it will do nothing if the view is alrady peristed
	 * </p>
	 * <!-- end-user-doc -->
	 */
	void persist();
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted child
	 * </p>
	 * @param child the '<em>View</em>' to insert.
	 * <!-- end-user-doc -->
	 */
	void insertChild(View child);
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted child at a specific index
	 * </p>
	 * @param child the '<em>View</em>' to insert.
	 * @param the index of the child
	 * <!-- end-user-doc -->
	 */
	void insertChildAt(View child, int index);
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to insert a persisted or transient child
	 * </p>
	 * @param child the '<em>View</em>' to insert.
	 * @param persisted, indicate if the view will be persisted or not
	 * <!-- end-user-doc -->
	 */
	void insertChild(View child,boolean persisted);
	
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * A utililty method to remove a child form a view
	 * </p>
	 * @param child the '<em>View</em>' to remove
	 * <!-- end-user-doc -->
	 */
	void removeChild(View child);
} // View
