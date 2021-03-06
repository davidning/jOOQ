/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
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
package org.jooq;

import org.jooq.impl.Factory;


/**
 * The SQL case statement.
 * <p>
 * This construct can be used to create expressions of the type <code><pre>
 * CASE x WHEN 1 THEN 'one'
 *        WHEN 2 THEN 'two'
 *        ELSE        'three'
 * END
 * </pre></code> or of the type <code><pre>
 * CASE WHEN x &lt; 1  THEN 'one'
 *      WHEN x &gt;= 2 THEN 'two'
 *      ELSE            'three'
 * END
 * </pre></code> Instances of Case are created through the
 * {@link Factory#decode()} method
 *
 * @author Lukas Eder
 */
public interface Case {

    /**
     * This construct can be used to create expressions of the type <code><pre>
     * CASE value WHEN 1 THEN 'one'
     *            WHEN 2 THEN 'two'
     *            ELSE        'three'
     * END
     * </pre></code>
     *
     * @param <V> The generic value type parameter
     * @param value The value to do the case statement on
     * @return An intermediary step for case statement construction
     */
    @Support
    <V> CaseValueStep<V> value(V value);

    /**
     * This construct can be used to create expressions of the type <code><pre>
     * CASE value WHEN 1 THEN 'one'
     *            WHEN 2 THEN 'two'
     *            ELSE        'three'
     * END
     * </pre></code>
     *
     * @param <V> The generic value type parameter
     * @param value The value to do the case statement on
     * @return An intermediary step for case statement construction
     */
    @Support
    <V> CaseValueStep<V> value(Field<V> value);

    /**
     * This construct can be used to create expressions of the type <code><pre>
     * CASE WHEN x &lt; 1  THEN 'one'
     *      WHEN x &gt;= 2 THEN 'two'
     *      ELSE            'three'
     * END
     * </pre></code> Instances of Case are created through the
     *
     * @param <T> The generic field type parameter
     * @param condition A condition to check in the case statement
     * @param result The result if the condition holds true
     * @return An intermediary step for case statement construction
     */
    @Support
    <T> CaseConditionStep<T> when(Condition condition, T result);

    /**
     * This construct can be used to create expressions of the type <code><pre>
     * CASE WHEN x &lt; 1  THEN 'one'
     *      WHEN x &gt;= 2 THEN 'two'
     *      ELSE            'three'
     * END
     * </pre></code> Instances of Case are created through the
     *
     * @param <T> The generic field type parameter
     * @param condition A condition to check in the case statement
     * @param result The result if the condition holds true
     * @return An intermediary step for case statement construction
     */
    @Support
    <T> CaseConditionStep<T> when(Condition condition, Field<T> result);
}
