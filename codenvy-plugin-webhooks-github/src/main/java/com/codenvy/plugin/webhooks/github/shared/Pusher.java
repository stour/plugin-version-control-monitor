/*
 *  [2012] - [2016] Codenvy, S.A.
 *  All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains
 * the property of Codenvy S.A. and its suppliers,
 * if any.  The intellectual and technical concepts contained
 * herein are proprietary to Codenvy S.A.
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Codenvy S.A..
 */
package com.codenvy.plugin.webhooks.github.shared;

import org.eclipse.che.dto.shared.DTO;

@DTO
public interface Pusher {

    /**
     * Get pusher's name.
     *
     * @return {@link String} name
     */
    String getName();

    void setName(final String name);

    Pusher withName(final String name);

    /**
     * Get pusher's email.
     *
     * @return {@link String} email
     */
    String getEmail();

    void setEmail(final String email);

    Pusher withEmail(final String email);
}
