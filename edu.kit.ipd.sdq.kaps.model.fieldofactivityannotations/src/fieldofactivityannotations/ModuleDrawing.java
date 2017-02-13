/**
 */
package fieldofactivityannotations;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Drawing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.ModuleDrawing#getDrawn_module <em>Drawn module</em>}</li>
 * </ul>
 *
 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getModuleDrawing()
 * @model
 * @generated
 */
public interface ModuleDrawing extends Drawing {
	/**
	 * Returns the value of the '<em><b>Drawn module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawn module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawn module</em>' reference.
	 * @see #setDrawn_module(Module)
	 * @see fieldofactivityannotations.FieldofactivityannotationsPackage#getModuleDrawing_Drawn_module()
	 * @model
	 * @generated
	 */
	Module getDrawn_module();

	/**
	 * Sets the value of the '{@link fieldofactivityannotations.ModuleDrawing#getDrawn_module <em>Drawn module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drawn module</em>' reference.
	 * @see #getDrawn_module()
	 * @generated
	 */
	void setDrawn_module(Module value);

} // ModuleDrawing
