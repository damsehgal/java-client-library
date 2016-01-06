/*
 * RDataException.java
 *
 * Copyright (C) 2010-2014 by Revolution Analytics Inc.
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client;

/**
 * Exception thrown when parsing or invalid constraint errors
 * arise processing RData inputs on DeployR API calls.
 */
public class RDataException extends Exception {

    public RDataException(String message) {
        super(message);
    }

    public RDataException(String message, Exception cause) {
        super(message, cause);
    }
}
