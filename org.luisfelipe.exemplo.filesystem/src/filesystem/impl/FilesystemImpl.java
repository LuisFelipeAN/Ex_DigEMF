/**
 */
package filesystem.impl;

import filesystem.Drive;
import filesystem.File;
import filesystem.Filesystem;
import filesystem.FilesystemPackage;
import filesystem.Folder;
import filesystem.Shortcut;
import filesystem.Sync;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.impl.FilesystemImpl#getDrives <em>Drives</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getFolders <em>Folders</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getAtalhos <em>Atalhos</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getSyncs <em>Syncs</em>}</li>
 *   <li>{@link filesystem.impl.FilesystemImpl#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilesystemImpl extends EObjectImpl implements Filesystem {
	/**
	 * The cached value of the '{@link #getDrives() <em>Drives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrives()
	 * @generated
	 * @ordered
	 */
	protected EList<Drive> drives;

	/**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> folders;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getAtalhos() <em>Atalhos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtalhos()
	 * @generated
	 * @ordered
	 */
	protected EList<Shortcut> atalhos;

	/**
	 * The cached value of the '{@link #getSyncs() <em>Syncs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncs()
	 * @generated
	 * @ordered
	 */
	protected EList<Sync> syncs;

	/**
	 * The default value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_ID_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoID = AUTO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilesystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesystemPackage.Literals.FILESYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drive> getDrives() {
		if (drives == null) {
			drives = new EObjectContainmentEList<Drive>(Drive.class, this, FilesystemPackage.FILESYSTEM__DRIVES);
		}
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<Folder>(Folder.class, this, FilesystemPackage.FILESYSTEM__FOLDERS);
		}
		return folders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, FilesystemPackage.FILESYSTEM__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shortcut> getAtalhos() {
		if (atalhos == null) {
			atalhos = new EObjectContainmentEList<Shortcut>(Shortcut.class, this, FilesystemPackage.FILESYSTEM__ATALHOS);
		}
		return atalhos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sync> getSyncs() {
		if (syncs == null) {
			syncs = new EObjectContainmentEList<Sync>(Sync.class, this, FilesystemPackage.FILESYSTEM__SYNCS);
		}
		return syncs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAutoID() {
		return autoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoID(Boolean newAutoID) {
		Boolean oldAutoID = autoID;
		autoID = newAutoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.FILESYSTEM__AUTO_ID, oldAutoID, autoID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return ((InternalEList<?>)getDrives()).basicRemove(otherEnd, msgs);
			case FilesystemPackage.FILESYSTEM__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case FilesystemPackage.FILESYSTEM__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case FilesystemPackage.FILESYSTEM__ATALHOS:
				return ((InternalEList<?>)getAtalhos()).basicRemove(otherEnd, msgs);
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return ((InternalEList<?>)getSyncs()).basicRemove(otherEnd, msgs);
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
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return getDrives();
			case FilesystemPackage.FILESYSTEM__FOLDERS:
				return getFolders();
			case FilesystemPackage.FILESYSTEM__FILES:
				return getFiles();
			case FilesystemPackage.FILESYSTEM__ATALHOS:
				return getAtalhos();
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return getSyncs();
			case FilesystemPackage.FILESYSTEM__AUTO_ID:
				return getAutoID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilesystemPackage.FILESYSTEM__DRIVES:
				getDrives().clear();
				getDrives().addAll((Collection<? extends Drive>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__ATALHOS:
				getAtalhos().clear();
				getAtalhos().addAll((Collection<? extends Shortcut>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__SYNCS:
				getSyncs().clear();
				getSyncs().addAll((Collection<? extends Sync>)newValue);
				return;
			case FilesystemPackage.FILESYSTEM__AUTO_ID:
				setAutoID((Boolean)newValue);
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
			case FilesystemPackage.FILESYSTEM__DRIVES:
				getDrives().clear();
				return;
			case FilesystemPackage.FILESYSTEM__FOLDERS:
				getFolders().clear();
				return;
			case FilesystemPackage.FILESYSTEM__FILES:
				getFiles().clear();
				return;
			case FilesystemPackage.FILESYSTEM__ATALHOS:
				getAtalhos().clear();
				return;
			case FilesystemPackage.FILESYSTEM__SYNCS:
				getSyncs().clear();
				return;
			case FilesystemPackage.FILESYSTEM__AUTO_ID:
				setAutoID(AUTO_ID_EDEFAULT);
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
			case FilesystemPackage.FILESYSTEM__DRIVES:
				return drives != null && !drives.isEmpty();
			case FilesystemPackage.FILESYSTEM__FOLDERS:
				return folders != null && !folders.isEmpty();
			case FilesystemPackage.FILESYSTEM__FILES:
				return files != null && !files.isEmpty();
			case FilesystemPackage.FILESYSTEM__ATALHOS:
				return atalhos != null && !atalhos.isEmpty();
			case FilesystemPackage.FILESYSTEM__SYNCS:
				return syncs != null && !syncs.isEmpty();
			case FilesystemPackage.FILESYSTEM__AUTO_ID:
				return AUTO_ID_EDEFAULT == null ? autoID != null : !AUTO_ID_EDEFAULT.equals(autoID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (autoID: ");
		result.append(autoID);
		result.append(')');
		return result.toString();
	}

} //FilesystemImpl
