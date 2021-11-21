SUMMARY = "My own linux kernel recipe"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit kernel

SRC_URI = "https://cdn.kernel.org/pub/linux/kernel/v5.x/linux-5.15.2.tar.xz;name=kernel \
	   file://defconfig"

S = "${WORKDIR}/linux-5.15.2"
SRC_URI[kernel.sha256sum] = "5634033a4981be42d3259f50d5371a2cdc9ace5d9860da67a2879630533ab175"
