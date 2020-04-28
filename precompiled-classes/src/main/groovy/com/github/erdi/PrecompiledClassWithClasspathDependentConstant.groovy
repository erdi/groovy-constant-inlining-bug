package com.github.erdi

class PrecompiledClassWithClasspathDependentConstant {
    public final static int EXAMPLE_TXT_RESOURCE_COUNT = getExampleTxtResourceCount()

    private static int getExampleTxtResourceCount() {
        PrecompiledClassWithClasspathDependentConstant.classLoader.getResources("example.txt").toList().size()
    }
}
