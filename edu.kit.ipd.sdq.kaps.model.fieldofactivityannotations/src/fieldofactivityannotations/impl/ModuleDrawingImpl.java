/**
 */
package fieldofactivityannotations.impl;

import fieldofactivityannotations.FieldofactivityannotationsPackage;
import fieldofactivityannotations.ModuleDrawing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Drawing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fieldofactivityannotations.impl.ModuleDrawingImpl#getDrawn_module <em>Drawn module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDrawingImpl extends DrawingImpl implements ModuleDrawing {
	/**
	 * The cached value of the '{@link #getDrawn_module() <em>Drawn module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawn_module()
	 * @generated
	 * @ordered
	 */
	protected Module drawn_module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDrawingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FieldofactivityannotationsPackage.Literals.MODULE_DRAWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getDrawn_module() {
		if (drawn_module != null && drawn_module.eIsProxy()) {
			InternalEObject oldDrawn_module = (InternalEObject)drawn_module;
			drawn_module = (Module)eResolveProxy(oldDrawn_module);
			if (drawn_module != oldDrawn_module) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE, oldDrawn_module, drawn_module));
			}
		}
		return drawn_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetDrawn_module() {
		return drawn_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrawn_module(Module newDrawn_module) {
		Module oldDrawn_module = drawn_module;
		drawn_module = newDrawn_module;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE, oldDrawn_module, drawn_module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE:
				if (resolve) return getDrawn_module();
				return basicGetDrawn_module();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE:
				setDrawn_module((Module)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE:
				setDrawn_module((Module)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FieldofactivityannotationsPackage.MODULE_DRAWING__DRAWN_MODULE:
				return drawn_module != null;
		}
		return super.eIsSet(featureID);
	}

} //ModuleDrawingImpl
