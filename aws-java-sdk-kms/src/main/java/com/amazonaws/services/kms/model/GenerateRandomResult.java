/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * 
 */
public class GenerateRandomResult implements Serializable, Cloneable {

    /**
     * <p>
     * Plaintext that contains the unpredictable byte string.
     * </p>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * <p>
     * Plaintext that contains the unpredictable byte string.
     * </p>
     * 
     * @param plaintext
     *        Plaintext that contains the unpredictable byte string.
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * <p>
     * Plaintext that contains the unpredictable byte string.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the {@code position}
     * .
     * </p>
     * 
     * @return Plaintext that contains the unpredictable byte string.
     */
    public java.nio.ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    /**
     * <p>
     * Plaintext that contains the unpredictable byte string.
     * </p>
     * 
     * @param plaintext
     *        Plaintext that contains the unpredictable byte string.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GenerateRandomResult withPlaintext(java.nio.ByteBuffer plaintext) {
        setPlaintext(plaintext);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlaintext() != null)
            sb.append("Plaintext: " + getPlaintext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateRandomResult == false)
            return false;
        GenerateRandomResult other = (GenerateRandomResult) obj;
        if (other.getPlaintext() == null ^ this.getPlaintext() == null)
            return false;
        if (other.getPlaintext() != null
                && other.getPlaintext().equals(this.getPlaintext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode());
        return hashCode;
    }

    @Override
    public GenerateRandomResult clone() {
        try {
            return (GenerateRandomResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}