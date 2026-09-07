SUMMARY = "Post-Quantum Crypto plugin for SPSDK"
HOMEPAGE = "https://github.com/nxp-mcuxpresso/spsdk"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe2a425fb1f291c670f58b9e3771878e"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "spsdk_pqc"

DEPENDS += "\
            python3-click-native \
            python3-pyasn1-native \
            python3-setuptools-scm-native \
            python3-setuptools-native \
            python3-typing-extensions-native \
            python3-spsdk-native \
            python3-pycryptodome-native \
"

SRC_URI[sha256sum] = "3faa23bb2f5619add95bb4e277745baf6242170d3f12c7610ce9e0fb06e489f0"

BBCLASSEXTEND = "native"
