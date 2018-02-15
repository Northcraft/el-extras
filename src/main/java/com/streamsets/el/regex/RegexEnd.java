/*
 * Copyright 2018 Michael Fox
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

package com.streamsets.el.regex;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

import java.util.regex.Pattern;

/**
 * RegexEnd.java - Streamsets expression language function for java regex end method
 * @author Michael Fox
 * @version 1.0
 */

@ElDef
public class RegexEnd {

    /**
     *
     * @param inString The string to test
     * @param regex The regular expression to search for
     * @return int The index where the match ends
     */
    @ElFunction(
            prefix = "regex",
            name = "find",
            description = "Returns the index in the string where the match begins"
    )
    public static int end(
            @ElParam("inString") String inString, @ElParam("regex") String regex
    ) {
        try {
            return Pattern.compile(regex).matcher(inString).end();
        } catch (Exception e) {
            return -1;
        }
    }
}
