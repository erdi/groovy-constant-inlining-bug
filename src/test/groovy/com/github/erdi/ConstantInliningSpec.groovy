package com.github.erdi

import spock.lang.Specification

class ConstantInliningSpec extends Specification {
    def "constants should not be inlined at compile time when it is not safe to do so"() {
        expect:
        ClassWithConstantReferencingPrecompiledConstant.EXAMPLE_TXT_RESOURCE_COUNT == PrecompiledClassWithClasspathDependentConstant.EXAMPLE_TXT_RESOURCE_COUNT
    }
}
