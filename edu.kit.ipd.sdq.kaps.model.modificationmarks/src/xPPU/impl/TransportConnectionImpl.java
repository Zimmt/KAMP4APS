/**
 */
package xPPU.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import xPPU.Interface;
import xPPU.TransportConnection;
import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xPPU.impl.TransportConnectionImpl#getIntefacePart <em>Inteface Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportConnectionImpl extends EObjectImpl implements TransportConnection {
	/**
	 * The cached value of the '{@link #getIntefacePart() <em>Inteface Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntefacePart()
	 * @generated
	 * @ordered
	 */
	protected Interface intefacePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPPUPackage.Literals.TRANSPORT_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getIntefacePart() {
		if (intefacePart != null && intefacePart.eIsProxy()) {
			InternalEObject oldIntefacePart = (InternalEObject)intefacePart;
			intefacePart = (Interface)eResolveProxy(oldIntefacePart);
			if (intefacePart != oldIntefacePart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART, oldIntefacePart, intefacePart));
			}
		}
		return intefacePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetIntefacePart() {
		return intefacePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntefacePart(Interface newIntefacePart, NotificationChain msgs) {
		Interface oldIntefacePart = intefacePart;
		intefacePart = newIntefacePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART, oldIntefacePart, newIntefacePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntefacePart(Interface newIntefacePart) {
		if (newIntefacePart != intefacePart) {
			NotificationChain msgs = null;
			if (intefacePart != null)
				msgs = ((InternalEObject)intefacePart).eInverseRemove(this, XPPUPackage.INTERFACE__TRANSPORTCONNECTION, Interface.class, msgs);
			if (newIntefacePart != null)
				msgs = ((InternalEObject)newIntefacePart).eInverseAdd(this, XPPUPackage.INTERFACE__TRANSPORTCONNECTION, Interface.class, msgs);
			msgs = basicSetIntefacePart(newIntefacePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART, newIntefacePart, newIntefacePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				if (intefacePart != null)
					msgs = ((InternalEObject)intefacePart).eInverseRemove(this, XPPUPackage.INTERFACE__TRANSPORTCONNECTION, Interface.class, msgs);
				return basicSetIntefacePart((Interface)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				return basicSetIntefacePart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				if (resolve) return getIntefacePart();
				return basicGetIntefacePart();
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
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				setIntefacePart((Interface)newValue);
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
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				setIntefacePart((Interface)null);
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
			case XPPUPackage.TRANSPORT_CONNECTION__INTEFACE_PART:
				return intefacePart != null;
		}
		return super.eIsSet(featureID);
	}

} //TransportConnectionImpl
