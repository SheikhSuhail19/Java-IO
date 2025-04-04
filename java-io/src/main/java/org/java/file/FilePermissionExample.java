package org.java.file;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionExample
{
	public static void main(String[] args)
	{

		// Define the file and directory path
		String filePath = "C:\\Users\\skhursheed\\Desktop\\Java IO\\java.txt";
		String dirPath = "C:\\Users\\skhursheed\\Desktop\\Java IO\\-";

		// Create FilePermission object for directory with read permission (gives its children read access as well)
		FilePermission dirPermission = new FilePermission(dirPath, "read");
		PermissionCollection permissions = dirPermission.newPermissionCollection();
		permissions.add(dirPermission);

		// Create FilePermission object for file with write permission
		FilePermission filePermission = new FilePermission(filePath, "write");
		permissions.add(filePermission);

		// Check if the permissions are implied

		if (permissions.implies(new FilePermission(dirPath, "read")))
		{
			System.out.println("Read permission is implied for the directory.");
		}

		if (permissions.implies(new FilePermission(dirPath, "write")))
		{
			System.out.println("Write permission is implied for the directory.");
		}
		else
		{
			System.out.println("Write permission isn't implied for the directory.");
		}

		if (permissions.implies(new FilePermission(filePath, "read,write")))
		{
			System.out.println("Read and Write permission is implied for the file.");
		}

		if (permissions.implies(new FilePermission(filePath, "execute")))
		{
			System.out.println("Execute permission is implied for the file.");
		}
		else
		{
			System.out.println("Execute permission isn't implied for the file.");
		}

		if (permissions.implies(new FilePermission(filePath, "read,write,execute,delete")))
		{
			System.out.println("All permissions are implied for the file.");
		}
		else
		{
			System.out.println("Some permissions are not implied for the file.");
		}
	}
}