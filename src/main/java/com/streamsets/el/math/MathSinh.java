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

package com.streamsets.el.math;

import com.streamsets.pipeline.api.ElDef;
import com.streamsets.pipeline.api.ElFunction;
import com.streamsets.pipeline.api.ElParam;

/**
 * MathSinh.java - Streamsets expression language function for java math sinh method
 * @author Michael Fox
 * @version 1.1.0
 */

@ElDef
public class MathSinh {

    /**
     *
     * @param inString The original number
     * @return The hyperbolic sine of the number
     */
    @ElFunction(
            prefix = "math",
            name = "sin",
            description = "Returns the sine of a number"
    )
    public static double sinh(
            @ElParam("inString") String inString
    ) {
        try {
                return Math.sinh(Double.parseDouble(inString));
        } catch (Exception e) {
            return -999999999;
        }
    }
}
