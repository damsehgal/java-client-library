/*
 * ProjectPreloadOptions.java
 *
 * Copyright (C) 2010-2016, Microsoft Corporation
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.params;

import java.util.Map;

/**
 * Project pre-execution repository preload options.
 */
public class ProjectPreloadOptions {

    public ProjectPreloadOptions() {
    }

    /**
     * Comma-separated list of repository filenames.
     */
    public String filename;

    /**
     * Comma-separated list of directories, one directory per filename.
     */
    public String directory;

    /**
     * Comma-separated list of authors, one author per filename.
     */
    public String author;

    /**
     * Optional, comma-separated list of versions, one version per filename.
     */
    public String version;

}
