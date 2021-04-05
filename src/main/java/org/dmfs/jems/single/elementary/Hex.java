/*
 * Copyright 2017 dmfs GmbH
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

package org.dmfs.jems.single.elementary;

import org.dmfs.jems.fragile.Fragile;
import org.dmfs.jems.single.Single;


/**
 * The {@link Single} of a hexadecimal representation of a {@link Single} array of bytes.
 */
@Deprecated
public final class Hex implements Single<CharSequence>
{
    private final Fragile<byte[], ? extends RuntimeException> mDelegate;


    public Hex(Fragile<byte[], ? extends RuntimeException> delegate)
    {
        mDelegate = delegate;
    }


    @Override
    public CharSequence value()
    {
        return new org.dmfs.jems.charsequence.elementary.Hex(mDelegate.value());
    }
}
