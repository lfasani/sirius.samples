/**
 *
 * $Id$
 */
package garden.validation;

import garden.Gardener;
import garden.GardenerGroup;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link garden.GardenerGroup}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GardenerGroupValidator {
	boolean validate();

	boolean validateSubGroups(EList<GardenerGroup> value);
	boolean validateGardeners(EList<Gardener> value);
}
