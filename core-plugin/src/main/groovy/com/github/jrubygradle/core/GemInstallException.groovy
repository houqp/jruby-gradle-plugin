package com.github.jrubygradle.core

import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors

/** Throws when there are issues installing and extracting GEMs.
 *
 * @since 2.0
 */
@InheritConstructors
@CompileStatic
class GemInstallException extends Exception {
}
