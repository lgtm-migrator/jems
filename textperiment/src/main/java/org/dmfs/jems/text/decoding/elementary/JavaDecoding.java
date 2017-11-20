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

package org.dmfs.jems.text.decoding.elementary;

import org.dmfs.jems.text.Text;
import org.dmfs.jems.text.decoding.Decoding;
import org.dmfs.jems.text.elementary.DecodedText;

import java.nio.charset.Charset;
import java.util.Arrays;


/**
 * @author Marten Gajda
 */
public final class JavaDecoding implements Decoding
{
    private final Charset mCharset;


    public JavaDecoding(Charset charset)
    {
        mCharset = charset;
    }


    @Override
    public Text apply(byte[] data)
    {
        return new DecodedText(mCharset, Arrays.copyOf(data, data.length));
    }

}
