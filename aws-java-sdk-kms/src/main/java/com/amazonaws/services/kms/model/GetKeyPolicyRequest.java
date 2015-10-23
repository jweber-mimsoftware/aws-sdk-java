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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetKeyPolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * String that contains the name of the policy. Currently, this must be
     * "default". Policy names can be discovered by calling
     * <a>ListKeyPolicies</a>.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier or the fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @return A unique identifier for the customer master key. This value can
     *         be a globally unique identifier or the fully specified ARN to a
     *         key.
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         </ul>
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier or the fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier or the fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetKeyPolicyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * String that contains the name of the policy. Currently, this must be
     * "default". Policy names can be discovered by calling
     * <a>ListKeyPolicies</a>.
     * </p>
     * 
     * @param policyName
     *        String that contains the name of the policy. Currently, this must
     *        be "default". Policy names can be discovered by calling
     *        <a>ListKeyPolicies</a>.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * String that contains the name of the policy. Currently, this must be
     * "default". Policy names can be discovered by calling
     * <a>ListKeyPolicies</a>.
     * </p>
     * 
     * @return String that contains the name of the policy. Currently, this must
     *         be "default". Policy names can be discovered by calling
     *         <a>ListKeyPolicies</a>.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * String that contains the name of the policy. Currently, this must be
     * "default". Policy names can be discovered by calling
     * <a>ListKeyPolicies</a>.
     * </p>
     * 
     * @param policyName
     *        String that contains the name of the policy. Currently, this must
     *        be "default". Policy names can be discovered by calling
     *        <a>ListKeyPolicies</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetKeyPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyPolicyRequest == false)
            return false;
        GetKeyPolicyRequest other = (GetKeyPolicyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyPolicyRequest clone() {
        return (GetKeyPolicyRequest) super.clone();
    }
}