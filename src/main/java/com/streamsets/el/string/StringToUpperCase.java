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

package com.streamsets.el.string;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

/**
 * StringToUpperCase.java - Streamsets expression language function for java string toUpperCase method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class StringToUpperCase {

    /**
     *
     * @param inString The original string
     * @return String The upper case string
     */
    @ElFunction(
            prefix = "string",
            name = "toUpperCase",
            description = "Returns an upper case version of the original string"
    )
    public static String toUpperCase(
            @ElParam("inString") String inString
    ) {
        try {
                return inString.toUpperCase();
        } catch (Exception e) {
            return "***string:touppercase error***";
        }
    }
}
