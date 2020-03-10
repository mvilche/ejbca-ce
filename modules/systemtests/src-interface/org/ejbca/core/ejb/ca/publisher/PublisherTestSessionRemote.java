/*************************************************************************
 *                                                                       *
 *  EJBCA Community: The OpenSource Certificate Authority                *
 *                                                                       *
 *  This software is free software; you can redistribute it and/or       *
 *  modify it under the terms of the GNU Lesser General Public           *
 *  License as published by the Free Software Foundation; either         *
 *  version 2.1 of the License, or any later version.                    *
 *                                                                       *
 *  See terms of license at gnu.org.                                     *
 *                                                                       *
 *************************************************************************/
package org.ejbca.core.ejb.ca.publisher;

import javax.ejb.Remote;

/**
 * @version $Id: PublisherTestSessionRemote.java 28718 2018-04-13 16:54:37Z samuellb $
 */
@Remote
public interface PublisherTestSessionRemote {

    /** The most recently passed revocationReason passed to MockedThrowAwayRevocationPublisher. */
    int getLastMockedThrowAwayRevocationReason();

    /** Used to reset the last revocation reason to a dummy value like -123 */
    void setLastMockedThrowAwayRevocationReason(int revocationReason);
}
