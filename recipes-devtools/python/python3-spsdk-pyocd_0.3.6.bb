SUMMARY = "Allow SPSDK to use PyOCD as an interface for debugger probes."
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fe2a425fb1f291c670f58b9e3771878e"

inherit pypi python_setuptools_build_meta

PYPI_PACKAGE = "spsdk_pyocd"

SRC_URI[sha256sum] = "522e26ffaa0e185f3e03c3a8712d52fbec9609b8ee57e7946062ddd4f385dec5"

BBCLASSEXTEND = "native"
