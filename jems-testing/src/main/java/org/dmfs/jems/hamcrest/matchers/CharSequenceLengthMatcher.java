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

package org.dmfs.jems.hamcrest.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import java.util.Locale;


/**
 * Matches the expected length of a {@link CharSequence}.
 *
 * @author Marten Gajda
 */
public final class CharSequenceLengthMatcher extends TypeSafeDiagnosingMatcher<CharSequence>
{
    private final int mExpectedValue;


    /**
     * Checks that the lenght of a {@link CharSequence} is correct.
     *
     * @param expectedLength
     *         The expected lenght of the {@link CharSequence}
     *
     * @return A {@link CharSequenceLengthMatcher}.
     */
    public static CharSequenceLengthMatcher hasLength(int expectedLength)
    {
        return new CharSequenceLengthMatcher(expectedLength);
    }


    public CharSequenceLengthMatcher(int expectedValue)
    {
        mExpectedValue = expectedValue;
    }


    @Override
    protected boolean matchesSafely(CharSequence item, Description mismatchDescription)
    {
        if (item.length() != mExpectedValue)
        {
            mismatchDescription.appendText(String.format(Locale.ENGLISH, "had length %d", item.length()));
            return false;
        }
        return true;
    }


    @Override
    public void describeTo(Description description)
    {
        description.appendText(String.format(Locale.ENGLISH, "has length %d", mExpectedValue));
    }
}
