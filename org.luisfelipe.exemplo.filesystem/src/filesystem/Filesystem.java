/**
 */
package filesystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filesystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link filesystem.Filesystem#getDrives <em>Drives</em>}</li>
 *   <li>{@link filesystem.Filesystem#getFolders <em>Folders</em>}</li>
 *   <li>{@link filesystem.Filesystem#getFiles <em>Files</em>}</li>
 *   <li>{@link filesystem.Filesystem#getAtalhos <em>Atalhos</em>}</li>
 *   <li>{@link filesystem.Filesystem#getSyncs <em>Syncs</em>}</li>
 *   <li>{@link filesystem.Filesystem#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 *
 * @see filesystem.FilesystemPackage#getFilesystem()
 * @model
 * @generated
 */
public interface Filesystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Drive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Drives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drive> getDrives();

	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getFolders();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Atalhos</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Shortcut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atalhos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atalhos</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Atalhos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Shortcut> getAtalhos();

	/**
	 * Returns the value of the '<em><b>Syncs</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.Sync}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syncs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syncs</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getFilesystem_Syncs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sync> getSyncs();

	/**
	 * Returns the value of the '<em><b>Auto ID</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto ID</em>' attribute.
	 * @see #setAutoID(Boolean)
	 * @see filesystem.FilesystemPackage#getFilesystem_AutoID()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAutoID();

	/**
	 * Sets the value of the '{@link filesystem.Filesystem#getAutoID <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto ID</em>' attribute.
	 * @see #getAutoID()
	 * @generated
	 */
	void setAutoID(Boolean value);

} // Filesystem
