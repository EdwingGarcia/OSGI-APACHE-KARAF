package org.ogra.bundle1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator, PallindromeService {
	private ServiceRegistration serviceReg;

	public void start(BundleContext context) {
		System.out.println("Starting Bundle1 ......");
		serviceReg = context.registerService(PallindromeService.class.getName(), this, null);
	}

	public void stop(BundleContext context) {
		System.out.println("Stopping Bundle1 ");
	}

	public boolean isPallindrome(String a) {
		int n = a.length();
		String b = "";
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		return b.equalsIgnoreCase(a);
	}


}