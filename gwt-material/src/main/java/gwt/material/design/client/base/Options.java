/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.base;

import com.google.gwt.core.client.GWT;

public class Options {

    private boolean allowWarnings;

    public void maybeNotifyChange(String optionName, Object prevOption, Object newOption) {
        if(allowWarnings && !prevOption.equals(newOption)) {
            GWT.log(getWarning(optionName, prevOption, newOption));
        }
    }

    public String getWarning(String optionName, Object prevOption, Object newOption) {
        return getClass().getSimpleName() + " option '" + optionName + "' has changed (new: " + newOption + ", prev: '"+prevOption+"'), " +
               "be sure to call reload() (note: this message will not appear in production)";
    }

    public boolean isAllowWarnings() {
        return allowWarnings;
    }

    public void setAllowWarnings(boolean allowWarnings) {
        this.allowWarnings = allowWarnings;
    }
}
