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

package com.amazonaws.services.cloudformation.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeStackEventsRequest Marshaller
 */

public class DescribeStackEventsRequestMarshaller
        implements
        Marshaller<Request<DescribeStackEventsRequest>, DescribeStackEventsRequest> {

    public Request<DescribeStackEventsRequest> marshall(
            DescribeStackEventsRequest describeStackEventsRequest) {

        if (describeStackEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeStackEventsRequest> request = new DefaultRequest<DescribeStackEventsRequest>(
                describeStackEventsRequest, "AmazonCloudFormation");
        request.addParameter("Action", "DescribeStackEvents");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeStackEventsRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils
                    .fromString(describeStackEventsRequest.getStackName()));
        }

        if (describeStackEventsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeStackEventsRequest.getNextToken()));
        }

        return request;
    }

}
