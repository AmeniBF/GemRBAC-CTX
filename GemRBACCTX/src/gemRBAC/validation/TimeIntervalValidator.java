/**
 *
 * $Id$
 */
package gemRBAC.validation;

import gemRBAC.TimePoint;

/**
 * A sample validator interface for {@link gemRBAC.TimeInterval}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TimeIntervalValidator {
	boolean validate();

	boolean validateStart(TimePoint value);
	boolean validateEnd(TimePoint value);
}
