/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.plugin.devopsfactories.shared;

import org.eclipse.che.dto.shared.DTO;

import javax.validation.constraints.NotNull;

/**
 * Created by stour on 09/09/15.
 */
@DTO
public interface Author {
    String getName();

    void setName(@NotNull final String name);

    Author withName(@NotNull final String name);


    String getEmail();

    void setEmail(@NotNull final String email);

    Author withEmail(@NotNull final String email);
}
