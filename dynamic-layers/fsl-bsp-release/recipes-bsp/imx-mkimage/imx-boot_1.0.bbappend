FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

DEPENDS:append:mx95-nxp-bsp = " python3-spsdk-native python3-spsdk-pqc-native"

SRC_URI:append:mx95-nxp-bsp = " file://imx95_ahab_sign.yaml.in"

python do_sign:append:mx95-generic-bsp() {
    bb.build.exec_func("sign_imx95", d)
}

sign_imx95() {
    sed \
        -e "s+@@AHAB_SIGN_SRK@@+${AHAB_SIGN_SRK}+" \
        -e "s+@@AHAB_SIGN_SRK_PASS@@+${AHAB_SIGN_SRK_PASS}+" \
        -e "s+@@AHAB_PQC_SIGN_SRK@@+${AHAB_PQC_SIGN_SRK}+" \
        -e "s+@@AHAB_PQC_SIGN_SRK_PASS@@+${AHAB_PQC_SIGN_SRK_PASS}+" \
        -e "s+@@AHAB_SRK0@@+${AHAB_SRK0}+" \
        -e "s+@@AHAB_SRK1@@+${AHAB_SRK1}+" \
        -e "s+@@AHAB_SRK2@@+${AHAB_SRK2}+" \
        -e "s+@@AHAB_SRK3@@+${AHAB_SRK3}+" \
        -e "s+@@AHAB_PQC_SRK0@@+${AHAB_PQC_SRK0}+" \
        -e "s+@@AHAB_PQC_SRK1@@+${AHAB_PQC_SRK1}+" \
        -e "s+@@AHAB_PQC_SRK2@@+${AHAB_PQC_SRK2}+" \
        -e "s+@@AHAB_PQC_SRK3@@+${AHAB_PQC_SRK3}+" \
        ${UNPACKDIR}/imx95_ahab_sign.yaml.in > ${B}/imx95_ahab_sign.yaml
    for target in ${IMXBOOT_TARGETS}; do
        nxpimage ahab sign -c ${B}/imx95_ahab_sign.yaml \
            -b ${S}/imx-boot${BOOT_VARIANT}-${MACHINE}-${UBOOT_CONFIG}.bin-${target} \
            -o ${BUILD_SIGN_DIR}/imx-boot${BOOT_VARIANT}-${MACHINE}-${UBOOT_CONFIG}.bin-${target}-signed
    done
}

do_sign[vardeps] = " \
    AHAB_SIGN_SRK \
    AHAB_SIGN_SRK_PASS \
    AHAB_SRK0 \
    AHAB_SRK1 \
    AHAB_SRK2 \
    AHAB_SRK3 \
    AHAB_PQC_SIGN_SRK \
    AHAB_PQC_SIGN_SRK_PASS \
    AHAB_PQC_SRK0 \
    AHAB_PQC_SRK1 \
    AHAB_PQC_SRK2 \
    AHAB_PQC_SRK3 \
"
