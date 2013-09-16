/*******************************************************************************
 * Copyright (c) 2012, 2013 GoPivotal, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     GoPivotal, Inc. - initial API and implementation
 *******************************************************************************/
package org.cloudfoundry.ide.eclipse.internal.server.core.client;

import java.io.File;

public class ApplicationInfo {
	private String appName;

	private File warFile;

	public ApplicationInfo(String appName) {
		this.appName = appName;
	}

	public String getAppName() {
		return appName;
	}

	public void setWarFile(File warFile) {
		this.warFile = warFile;
	}

	public File getWarFile() {
		return warFile;
	}

}