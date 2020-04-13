/**
 */
package com.example.xtext.project;

import com.example.project.ExampleInterface;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENode</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.example.xtext.project.ProjectPackage#getENode()
 * @model abstract="true" superTypes="com.example.xtext.project.ExampleInterface"
 * @generated
 */
public interface ENode extends EObject, ExampleInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Object getParent();

} // ENode
