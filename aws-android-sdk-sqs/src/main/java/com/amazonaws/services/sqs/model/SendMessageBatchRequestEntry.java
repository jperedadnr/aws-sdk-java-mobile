/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of a single Amazon SQS message along with a
 * <code>Id</code>.
 * </p>
 */
public class SendMessageBatchRequestEntry implements Serializable {
    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     */
    private String id;

    /**
     * <p>
     * Body of the message.
     * </p>
     */
    private String messageBody;

    /**
     * <p>
     * The number of seconds for which the message has to be delayed.
     * </p>
     */
    private Integer delaySeconds;

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     */
    private java.util.Map<String, MessageAttributeValue> messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();

    /**
     * Default constructor for SendMessageBatchRequestEntry object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     */
    public SendMessageBatchRequestEntry() {
    }

    /**
     * Constructs a new SendMessageBatchRequestEntry object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     */
    public SendMessageBatchRequestEntry(String id, String messageBody) {
        setId(id);
        setMessageBody(messageBody);
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     *
     * @return <p>
     *         An identifier for the message in this batch. This is used to
     *         communicate the result. Note that the <code>Id</code>s of a batch
     *         request need to be unique within the request.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     *
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * An identifier for the message in this batch. This is used to communicate
     * the result. Note that the <code>Id</code>s of a batch request need to be
     * unique within the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            An identifier for the message in this batch. This is used to
     *            communicate the result. Note that the <code>Id</code>s of a
     *            batch request need to be unique within the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     *
     * @return <p>
     *         Body of the message.
     *         </p>
     */
    public String getMessageBody() {
        return messageBody;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     *
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     */
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    /**
     * <p>
     * Body of the message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageBody <p>
     *            Body of the message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * <p>
     * The number of seconds for which the message has to be delayed.
     * </p>
     *
     * @return <p>
     *         The number of seconds for which the message has to be delayed.
     *         </p>
     */
    public Integer getDelaySeconds() {
        return delaySeconds;
    }

    /**
     * <p>
     * The number of seconds for which the message has to be delayed.
     * </p>
     *
     * @param delaySeconds <p>
     *            The number of seconds for which the message has to be delayed.
     *            </p>
     */
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
    }

    /**
     * <p>
     * The number of seconds for which the message has to be delayed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delaySeconds <p>
     *            The number of seconds for which the message has to be delayed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     *
     * @return <p>
     *         Each message attribute consists of a Name, Type, and Value. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *         >Message Attribute Items</a>.
     *         </p>
     */
    public java.util.Map<String, MessageAttributeValue> getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a>.
     *            </p>
     */
    public void setMessageAttributes(java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param messageAttributes <p>
     *            Each message attribute consists of a Name, Type, and Value.
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     *            >Message Attribute Items</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry withMessageAttributes(
            java.util.Map<String, MessageAttributeValue> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    /**
     * <p>
     * Each message attribute consists of a Name, Type, and Value. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html#SQSMessageAttributesNTV"
     * >Message Attribute Items</a>.
     * </p>
     * <p>
     * The method adds a new key-value pair into MessageAttributes parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into MessageAttributes.
     * @param value The corresponding value of the entry to be added into
     *            MessageAttributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendMessageBatchRequestEntry addMessageAttributesEntry(String key,
            MessageAttributeValue value) {
        if (null == this.messageAttributes) {
            this.messageAttributes = new java.util.HashMap<String, MessageAttributeValue>();
        }
        if (this.messageAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.messageAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MessageAttributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public SendMessageBatchRequestEntry clearMessageAttributesEntries() {
        this.messageAttributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getMessageBody() != null)
            sb.append("MessageBody: " + getMessageBody() + ",");
        if (getDelaySeconds() != null)
            sb.append("DelaySeconds: " + getDelaySeconds() + ",");
        if (getMessageAttributes() != null)
            sb.append("MessageAttributes: " + getMessageAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        hashCode = prime * hashCode
                + ((getDelaySeconds() == null) ? 0 : getDelaySeconds().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAttributes() == null) ? 0 : getMessageAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendMessageBatchRequestEntry == false)
            return false;
        SendMessageBatchRequestEntry other = (SendMessageBatchRequestEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessageBody() == null ^ this.getMessageBody() == null)
            return false;
        if (other.getMessageBody() != null
                && other.getMessageBody().equals(this.getMessageBody()) == false)
            return false;
        if (other.getDelaySeconds() == null ^ this.getDelaySeconds() == null)
            return false;
        if (other.getDelaySeconds() != null
                && other.getDelaySeconds().equals(this.getDelaySeconds()) == false)
            return false;
        if (other.getMessageAttributes() == null ^ this.getMessageAttributes() == null)
            return false;
        if (other.getMessageAttributes() != null
                && other.getMessageAttributes().equals(this.getMessageAttributes()) == false)
            return false;
        return true;
    }
}
