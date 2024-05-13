package org.ogra.bundle2;

import org.ogra.bundle1.PallindromeService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {
	private ServiceReference serviceReg;

	public void start(BundleContext context) {
		System.out.println("Starting Bundle2 ");
		serviceReg = context.getServiceReference(PallindromeService.class.getName());
		PallindromeService ms = (PallindromeService) context.getService(serviceReg);
		boolean b = ms.isPallindrome("ola");
		System.out.println(b);
	}

	public void stop(BundleContext context) {
		System.out.println("Stopping Bundle2 ");
	}
}