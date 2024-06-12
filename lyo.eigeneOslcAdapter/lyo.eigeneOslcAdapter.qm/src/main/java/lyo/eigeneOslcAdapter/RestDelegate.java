// Start of user code Copyright
/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Simple
 */
// End of user code

package lyo.eigeneOslcAdapter;


import javax.inject.Inject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Data.CapellaConnector;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import lyo.eigeneOslcAdapter.servlet.ServiceProviderCatalogSingleton;
import lyo.eigeneOslcAdapter.ServiceProviderInfo;



// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class RestDelegate {

    private static final Logger log = LoggerFactory.getLogger(RestDelegate.class);

    
    
    @Inject ResourcesFactory resourcesFactory;
    // Start of user code class_attributes
    // End of user code
    
    public RestDelegate() {
        log.trace("Delegate is initialized");
    }
    
    
    // Start of user code class_methods
    // End of user code

    //The methods contextInitializeServletListener() and contextDestroyServletListener() no longer exits
    //Migrate any user-specific code blocks to the class lyo.eigeneOslcAdapter.servlet.ServletListener
    //Any user-specific code should be found in *.lost files.

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
            	
    	ServiceProviderInfo[] serviceProviderInfos = {};
        
    	//serviceProviderInfos serviceprovider = CapellaConnector.class 
    	//CapellaClient
    	
        // Start of user code "ServiceProviderInfo[] getServiceProviderInfos(...)"
        ServiceProviderInfo serviceProvider1 = new ServiceProviderInfo();
        serviceProvider1.name = "Project1";
        serviceProvider1.serviceProviderId = "p1";
        
        ServiceProviderInfo serviceProvider2 = new ServiceProviderInfo();
        serviceProvider2.name = "Project2";
        serviceProvider2.serviceProviderId = "p2";
        
        
        serviceProviderInfos = new ServiceProviderInfo[2];
        serviceProviderInfos[0] = serviceProvider1;
        serviceProviderInfos[1] = serviceProvider2;
      
        
        // End of user code
        return serviceProviderInfos;
    }




}
