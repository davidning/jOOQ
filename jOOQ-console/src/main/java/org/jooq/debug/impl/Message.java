/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 *                          Christopher Deckers, chrriis@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.debug.impl;

import java.io.Serializable;


/**
 * The superclass of all the messages that are exchanged at the communication interface.
 * @author Christopher Deckers
 */
@SuppressWarnings("serial")
abstract class Message<S extends Serializable> implements Serializable {

    private static int nextID = 1;

    private int        id     = nextID++;
    private boolean    isSyncExec;
    private long       threadID;
    private boolean    isProcessorToOriginator;

    /**
     * Create an empty message.
     */
    public Message() {
    }

    int getID() {
        return id;
    }

    void setSyncExec(boolean isSyncExec) {
        this.isSyncExec = isSyncExec;
    }

    void setThreadID(long threadID) {
        this.threadID = threadID;
    }

    long getThreadID() {
        return threadID;
    }

    void setProcessorToOriginator(boolean isProcessorToOriginator) {
        this.isProcessorToOriginator = isProcessorToOriginator;
    }

    boolean isProcessorToOriginator() {
        return isProcessorToOriginator;
    }

    boolean isSyncExec() {
        return isSyncExec;
    }

    /**
     * Indicate whether the message is valid. This is called before interpreting it to give a chance for the message to prevent its interpretation.
     * @return true if the message is valid and should be interpreted, false otherwise.
     */
    protected boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        String name = getClass().getName();
        if (name.startsWith("chrriis.dj.nativeswing.")) {
            name = name.substring("chrriis.dj.nativeswing.".length());
        }
        return name;
    }

    /**
     * This type is used for messages that do not have any result
     * <p>
     * This works in similar ways as {@link Void}, except that {@link NoResult}
     * also implements {@link Serializable}
     */
    protected static final class NoResult implements Serializable {

        /**
         * No instances
         */
        private NoResult() {}
    }
}