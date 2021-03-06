/*
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rpc.server.actionhandlervalidator;

import com.gwtplatform.dispatch.rpc.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.rpc.shared.Action;
import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Registry definition for {@link ActionValidator}.
 */
public interface ActionHandlerValidatorRegistry {
    /**
     * Clears all registered {@link ActionValidator} from the registry.
     */
    void clearActionHandlerValidators();

    /**
     * Searches the registry and returns the {@link ActionValidator} which supports the specified {@link Action},
     * or <code>null</code> if none is available.
     *
     * @param <A>    Type of associated {@link Action}
     * @param <R>    Type of associated {@link Result}
     * @param action The {@link Action}
     * @return The {@link ActionValidator}
     */
    <A extends Action<R>, R extends Result> ActionHandlerValidatorInstance findActionHandlerValidator(A action);

    /**
     * Searches the registry for already bound {@link ActionValidator} class and return the instance or
     * <code>null</code> if none is available.
     *
     * @param actionValidatorClass The {@link Action}
     */
    ActionValidator findActionValidator(Class<? extends ActionValidator> actionValidatorClass);
}
