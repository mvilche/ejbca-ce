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
package org.ejbca.core.ejb.unidfnr;

import javax.ejb.Remote;

/**
 * 
 * @version $Id: UnidfnrProxySessionRemote.java 28658 2018-04-10 09:48:34Z aminkh $
 *
 */
@Remote
public interface UnidfnrProxySessionRemote {
    
    void removeUnidFnrDataIfPresent(final String unid);

    void stroreUnidFnrData(final String unid, final String fnr);
    
}
