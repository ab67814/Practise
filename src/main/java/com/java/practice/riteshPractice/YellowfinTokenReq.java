package com.ritesh.practice.riteshPractice;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.hof.mi.web.service.AdministrationPerson;
import com.hof.mi.web.service.AdministrationServiceRequest;
import com.hof.mi.web.service.AdministrationServiceResponse;
import com.hof.mi.web.service.AdministrationServiceServiceLocator;
import com.hof.mi.web.service.AdministrationServiceSoapBindingStub;

public class YellowfinTokenReq {

	public static void main(String[] args) throws RemoteException, ServiceException {
		
		AdministrationServiceResponse rs = null;
		AdministrationServiceRequest rsr = new AdministrationServiceRequest();
		AdministrationServiceServiceLocator servLoc = new AdministrationServiceServiceLocator();
		
		AdministrationServiceSoapBindingStub rssbs = (AdministrationServiceSoapBindingStub) servLoc.getAdministrationService();
		
		    
		rsr.setLoginId("admin@yellowfin.com.au");
		rsr.setPassword("Hipass$2018");
		rsr.setOrgId(new Integer(1));
		rsr.setFunction("LOGINUSER");
		      
		AdministrationPerson ap = new AdministrationPerson();
		ap.setUserId("admin@yellowfin.com.au");
		ap.setPassword("Hipass$2018");
		rsr.setPerson(ap);
		      
		rs = rssbs.remoteAdministrationCall(rsr);
		     
		if ("SUCCESS".equals(rs.getStatusCode()) ) {
		                 
		    //out.write("Success");
		    //out.write(“URL:  http://<yellowfin-server>/logon.i4?LoginWebserviceId=” + rs.getLoginSessionId());
		                             
		} else {
		             
		    //out.write("Failure");
		                 
		}

	}

}
