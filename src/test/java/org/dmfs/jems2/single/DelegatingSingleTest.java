/*
 * Copyright 2021 dmfs GmbH
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.jems2.single;

import org.dmfs.jems2.Single;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.sameInstance;


/**
 *
 */
public class DelegatingSingleTest
{
    @Test
    public void testValue()
    {
        Object mockValue = new Object();
        assertThat(new TestDelegatingSingle<>(new Just<>(mockValue)).value(), sameInstance(mockValue));
    }


    private final class TestDelegatingSingle<T> extends DelegatingSingle<T>
    {
        public TestDelegatingSingle(Single<T> delegate)
        {
            super(delegate);
        }
    }
}