SUMMARY = "The Secure Provisioning SDK (SPSDK) is a set of tools for NXP devices to securely sign images"
HOMEPAGE = "https://github.com/nxp-mcuxpresso/spsdk"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71f9dfe2f5397e150a180724f0270d11"

inherit pypi python_setuptools_build_meta

DEPENDS += "\
            python3-asn1crypto-native \
            python3-bincopy-native \
            python3-bitstring-native \
            python3-click-native \
            python3-click-command-tree-native \
            python3-click-option-group-native \
            python3-colorama-native \
            python3-crcmod-native \
            python3-cryptography-native \
            python3-deepmerge-native \
            python3-fastjsonschema-native \
            python3-filelock-native \
            python3-hexdump-native \
            python3-importlib-metadata-native \
            python3-libusbsio-native \
            python3-libuuu-native \
            python3-oscrypto-native \
            python3-packaging-native \
            python3-platformdirs-native \
            python3-prettytable-native \
            python3-pyasn1-native \
            python3-pyserial-native \
            python3-requests-native \
            python3-ruamel-yaml-native \
            python3-setuptools-scm-native \
            python3-setuptools-native \
            python3-sly-native \
            python3-typing-extensions-native \
            python3-x690-native \
            python3-pyyaml-native \
            python3-spsdk-pyocd-native \
"

SRC_URI[sha256sum] = "a98c6a9054c6aeb544e8bdc7ee00e08d2dcc6f9b7998da5b7dd4c71f07dcd46f"

BBCLASSEXTEND = "native"
